package TeacherAction;

import com.opensymphony.xwork2.ActionContext;


import entity.Teacher;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeacherDao;

public class GetTeacher  extends ActionSupport{
    private Teacher teacher;
    private String teaId;
    private Teacher r;
    private int tid;
    private Teacher te;
    TeacherDao td=new TeacherDao();
       
    public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getTeaId() {
		return teaId;
	}
	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}
	public Teacher getR() {
		return r;
	}
	public void setR(Teacher r) {
		this.r = r;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}

	
	public String getstudent()
    {
		TeacherDao tt=new TeacherDao();
		setTe(tt.getTeacher(tid));
		
        return SUCCESS;
    }
     public String showteacher2(){
    	 if(td.getTeacher1(teaId)!=null){
    		 setR(td.getTeacher1(teaId));
    		 return SUCCESS;
    	 }
     
        return  INPUT;
    }
    public String showteacher1(){
  String m = (String) ActionContext.getContext().getSession().get("teaId");  
  System.out.println(m);
    if(td.getTeacher1(m)!=null){
		setR(td.getTeacher1(m));
		 return SUCCESS;
	 }

   return  INPUT;
    }
    public String showteacher(){
    	TeacherDao tt=new TeacherDao();
    	setR(tt.getTeacher(tid));
    	if(r!=null){
    		 return SUCCESS;
        }
        return INPUT;
    }
    public String editTeacher(){
    	TeacherDao tt=new TeacherDao();
    	this.teacher=tt.getTeacher(tid);
       
        return SUCCESS;
    }

	public Teacher getTe() {
		return te;
	}
	public void setTe(Teacher te) {
		this.te = te;
	}
 
}
