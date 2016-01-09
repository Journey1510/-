package TeacherAction;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeacherDao;
import entity.Student;
import entity.Teacher;


public class UpTeacher extends ActionSupport{

	
    private Teacher r;
    private int tid;
    
     private String tname;
     private String teaId;
     private String email;
     private String tel;
     private String age;
     private String sex;
     private String department;
     private String jiguan;
     private String tpassword;
   

    public Teacher getR() {
		return r;
	}


	public void setR(Teacher r) {
		this.r =r;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public String getTeaId() {
		return teaId;
	}


	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getJiguan() {
		return jiguan;
	}


	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}


	public String getTpassword() {
		return tpassword;
	}


	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}


	@Override
    public String execute(){
        //实现信息的修改       
		TeacherDao um= new TeacherDao();
		Teacher s= um.getteacher1(getTeaId());     
        s.setJiguan(getJiguan());
        s.setTel(getTel());
        s.setEmail(getEmail());

        try{
        	um.updateTeacher(s);
              return SUCCESS;
        }
        catch (Exception e){
            e.printStackTrace();
        }     
      return INPUT;
    
      
   }

}