package Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Classes;
import entity.Student;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.struts2.ServletActionContext;
import services.ChooseCourseService;
import services.StudentService;

public class ChooseCourseAction extends ActionSupport {

    ChooseCourseService chooseCourseService = new ChooseCourseService();
    //登录者服务
    StudentService studentService = new StudentService();
    private List<Classes> classesList;
    private Classes clas;
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Classes getClas() {
        return clas;
    }

    public void setClas(Classes clas) {
        this.clas = clas;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    //选课主页面初始化
    @Override
    public String execute() throws Exception {
        int sid = 0;
        if (ActionContext.getContext().getSession().get("id") != null) {
            sid = Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
        }
        setClassesList(chooseCourseService.loadClasses());
        setStu(studentService.loadStudentById(sid));
        return SUCCESS;
    }
    //查看详细

    public String viewDetail() throws Exception {
        try {
            int id = 0;
            if (ServletActionContext.getRequest().getParameter("cid") != null) {
                id = Integer.parseInt(ServletActionContext.getRequest().getParameter("cid").toString());
            }
            setClas(chooseCourseService.loadClassesById(id));
            return "viewDetail";
        } catch (Exception e) {
            return ERROR;
        }

    }

    //确认选课
    //向学生中课程集合中添加一个课程
    //首先判断该学生选课数量是否已经超过限制
    //再判断选该课的人数是否达到限制
    //如果都未达到限制，则选课成功
    public String confirmChooseClasses() throws Exception {
        //学生id
        int sid = 0;
        //课程id
        int cid = 0;
        //获取学生id
        if (ActionContext.getContext().getSession().get("id") != null) {
            sid = Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
        }
        //获取课程id
        if (ServletActionContext.getRequest().getParameter("cid") != null) {
            cid = Integer.parseInt(ServletActionContext.getRequest().getParameter("cid").toString());
        }
        //获取目前登录学生
        Student student = studentService.loadStudentById(sid);
        //获取目前要选的课程
        Classes curClass = chooseCourseService.loadClassesById(cid);
        //获取该学生所选的所有课程
        Set classes = student.getClasses();
        Set students = curClass.getStudents();
        if (classes != null && students != null) {
            //如果学生已选课程不超过4门，并且该门课程选的人数不到限制
            if (classes.size() >= 0 && classes.size() < student.getMaxClasses() && students.size() < curClass.getChooseMax()) {
                //若已经选此课，则无法再选
                for (Iterator it = classes.iterator(); it.hasNext();) {
                    Classes c = (Classes) it.next();
                    if (c.getCname().equals(curClass.getCname())) {
                        return "exist";
                    }
                }
                //选中当前课程,添加到该学生持有的课程集合中
                curClass.setChooseCurNum(curClass.getChooseCurNum() + 1);
                classes.add(curClass);
                //在该课程的学生集合中加上这个学生
                students.add(student);
                student.setClasses(classes);
                //保存该学生信息     studentService.saveOrUpdate(student);
                //保存该课程信息
                chooseCourseService.updateClasses(curClass);
                
                return "chooseSuccess";
            }
            return "chooseOver";
        }
        return ERROR;
    }
    //已选课程

    public String myClasses() throws Exception {
        int sid = 0;
        try {
            if (ActionContext.getContext().getSession().get("id") != null) {
                sid = Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
            }
            setStu(studentService.loadStudentById(sid));
            return "myclass";
        } catch (Exception e) {
            return ERROR;
        }
    }

    /*取消选课
    /进入我的课程页面，查看已选课程
    点击取消选课，提示：你确认要取消选择该课程吗，点击确认，取消选课
     */
    /*
    逻辑：1.从学生的课程中移除当前取消的课程，级联的，课程中也会移除该学生
     *      2.当前选课数-1 ，课程人数-1
     */
    public String cancelClasses() throws Exception {
        //学生id
        int sid = 0;
        //课程id
        int cid = 0;
        //获取学生id
        if (ActionContext.getContext().getSession().get("id") != null) {
            sid = Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
        }
        //获取课程id
        if (ServletActionContext.getRequest().getParameter("cid") != null) {
            cid = Integer.parseInt(ServletActionContext.getRequest().getParameter("cid").toString());
        }
        //获取目前登录学生
        Student student = studentService.loadStudentById(sid);
        //获取目前要选的课程
        Classes curClass = chooseCourseService.loadClassesById(cid);

        Set classes = student.getClasses();
        Set students = curClass.getStudents();

        //已选课程-1
        curClass.setChooseCurNum(curClass.getChooseCurNum() - 1);
    
        //删除所选课程
        for (Iterator it = classes.iterator(); it.hasNext();) {
            Classes clz = (Classes) it.next();
            if (clz.getCname() == null ? curClass.getCname() == null : clz.getCname().equals(curClass.getCname())) {
                //从集合删除5
                it.remove();
                classes.remove(clz);
            }
        }
        
        //删除学生
        for (Iterator it = students.iterator(); it.hasNext();) {
            Student s =  (Student) it.next();
            if (s.getSno() == null ? student.getSno() == null : s.getSno().equals(student.getSno()) ) {
                 it.remove();
                students.remove(s);
            }
        }
        
        //classes.remove(curClass);
       //这里为什么删除不了
       //students.remove(student);
        
        student.setClasses(classes);
        curClass.setStudents(students);
        //保存该课程信息
        chooseCourseService.updateClasses(curClass);
        studentService.saveOrUpdate(student);

        return "cancelSuccess";
    }
}
