/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.TeacherDao;
import entity.Teacher;


public class AddTeacher extends ActionSupport {
    
    private Integer age;
     private String email;
     private String tel;
     private String teaId;
     private String tpassword;
     private String tname;
    
    public String execute() throws Exception {
      Teacher t=new Teacher();
      TeacherDao td=new TeacherDao();
      t.setAge(age);
      t.setEmail(email);
      t.setTeaId(teaId);
      t.setTel(tel);
      t.setTname(tname);
      t.setTpassword(tpassword);
      if(t!=null){
          td.saveTeacher(t);
          return SUCCESS;
      }
      return INPUT;
      
    }
    public String updataTeacher(){
         Teacher t=new Teacher();
      TeacherDao td=new TeacherDao();
      t.setAge(age);
      t.setEmail(email);
      t.setTeaId(teaId);
      t.setTel(tel);
      t.setTname(tname);
      t.setTpassword(tpassword);
      if(t!=null){
          td.updateTeacher(t);
          return SUCCESS;
      }
      return INPUT;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the teaId
     */
    public String getTeaId() {
        return teaId;
    }

    /**
     * @param teaId the teaId to set
     */
    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    /**
     * @return the tpassword
     */
    public String getTpassword() {
        return tpassword;
    }

    /**
     * @param tpassword the tpassword to set
     */
    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    /**
     * @return the tname
     */
    public String getTname() {
        return tname;
    }

    /**
     * @param tname the tname to set
     */
    public void setTname(String tname) {
        this.tname = tname;
    }
}
