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
    //��¼�߷���
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

    //ѡ����ҳ���ʼ��
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
    //�鿴��ϸ

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

    //ȷ��ѡ��
    //��ѧ���пγ̼��������һ���γ�
    //�����жϸ�ѧ��ѡ�������Ƿ��Ѿ���������
    //���ж�ѡ�ÿε������Ƿ�ﵽ����
    //�����δ�ﵽ���ƣ���ѡ�γɹ�
    public String confirmChooseClasses() throws Exception {
        //ѧ��id
        int sid = 0;
        //�γ�id
        int cid = 0;
        //��ȡѧ��id
        if (ActionContext.getContext().getSession().get("id") != null) {
            sid = Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
        }
        //��ȡ�γ�id
        if (ServletActionContext.getRequest().getParameter("cid") != null) {
            cid = Integer.parseInt(ServletActionContext.getRequest().getParameter("cid").toString());
        }
        //��ȡĿǰ��¼ѧ��
        Student student = studentService.loadStudentById(sid);
        //��ȡĿǰҪѡ�Ŀγ�
        Classes curClass = chooseCourseService.loadClassesById(cid);
        //��ȡ��ѧ����ѡ�����пγ�
        Set classes = student.getClasses();
        Set students = curClass.getStudents();
        if (classes != null && students != null) {
            //���ѧ����ѡ�γ̲�����4�ţ����Ҹ��ſγ�ѡ��������������
            if (classes.size() >= 0 && classes.size() < student.getMaxClasses() && students.size() < curClass.getChooseMax()) {
                //���Ѿ�ѡ�˿Σ����޷���ѡ
                for (Iterator it = classes.iterator(); it.hasNext();) {
                    Classes c = (Classes) it.next();
                    if (c.getCname().equals(curClass.getCname())) {
                        return "exist";
                    }
                }
                //ѡ�е�ǰ�γ�,��ӵ���ѧ�����еĿγ̼�����
                curClass.setChooseCurNum(curClass.getChooseCurNum() + 1);
                classes.add(curClass);
                //�ڸÿγ̵�ѧ�������м������ѧ��
                students.add(student);
                student.setClasses(classes);
                //�����ѧ����Ϣ     studentService.saveOrUpdate(student);
                //����ÿγ���Ϣ
                chooseCourseService.updateClasses(curClass);
                
                return "chooseSuccess";
            }
            return "chooseOver";
        }
        return ERROR;
    }
    //��ѡ�γ�

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

    /*ȡ��ѡ��
    /�����ҵĿγ�ҳ�棬�鿴��ѡ�γ�
    ���ȡ��ѡ�Σ���ʾ����ȷ��Ҫȡ��ѡ��ÿγ��𣬵��ȷ�ϣ�ȡ��ѡ��
     */
    /*
    �߼���1.��ѧ���Ŀγ����Ƴ���ǰȡ���Ŀγ̣������ģ��γ���Ҳ���Ƴ���ѧ��
     *      2.��ǰѡ����-1 ���γ�����-1
     */
    public String cancelClasses() throws Exception {
        //ѧ��id
        int sid = 0;
        //�γ�id
        int cid = 0;
        //��ȡѧ��id
        if (ActionContext.getContext().getSession().get("id") != null) {
            sid = Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
        }
        //��ȡ�γ�id
        if (ServletActionContext.getRequest().getParameter("cid") != null) {
            cid = Integer.parseInt(ServletActionContext.getRequest().getParameter("cid").toString());
        }
        //��ȡĿǰ��¼ѧ��
        Student student = studentService.loadStudentById(sid);
        //��ȡĿǰҪѡ�Ŀγ�
        Classes curClass = chooseCourseService.loadClassesById(cid);

        Set classes = student.getClasses();
        Set students = curClass.getStudents();

        //��ѡ�γ�-1
        curClass.setChooseCurNum(curClass.getChooseCurNum() - 1);
    
        //ɾ����ѡ�γ�
        for (Iterator it = classes.iterator(); it.hasNext();) {
            Classes clz = (Classes) it.next();
            if (clz.getCname() == null ? curClass.getCname() == null : clz.getCname().equals(curClass.getCname())) {
                //�Ӽ���ɾ��5
                it.remove();
                classes.remove(clz);
            }
        }
        
        //ɾ��ѧ��
        for (Iterator it = students.iterator(); it.hasNext();) {
            Student s =  (Student) it.next();
            if (s.getSno() == null ? student.getSno() == null : s.getSno().equals(student.getSno()) ) {
                 it.remove();
                students.remove(s);
            }
        }
        
        //classes.remove(curClass);
       //����Ϊʲôɾ������
       //students.remove(student);
        
        student.setClasses(classes);
        curClass.setStudents(students);
        //����ÿγ���Ϣ
        chooseCourseService.updateClasses(curClass);
        studentService.saveOrUpdate(student);

        return "cancelSuccess";
    }
}
