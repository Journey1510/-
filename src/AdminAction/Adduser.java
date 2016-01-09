/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.Usermanager;
import entity.Student;

/**
 *
 * @author mm
 */
public class Adduser extends ActionSupport{
     private String username;
     private String sno;
     private String email;
     private String tel;
     private String mark;
     private String sex;
     private String department;
     private String jiguan;
     private String password;
      private Integer maxClasses;
    
  
    
    public String execute() throws Exception {
       Usermanager um=new Usermanager();
       Student s=new Student();
       s.setUsername(username);
       s.setJiguan(jiguan);
       s.setMark(mark);
       s.setEmail(email);
       s.setPassword(password);
       s.setSex(sex);
       s.setTel(tel);
       s.setSno(sno);
       s.setMaxClasses(maxClasses);
      if(s!=null){
          um.saveStudent(s);
           return SUCCESS;
      }else
      {
          return INPUT;
      }
      
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the sno
     */
    public String getSno() {
        return sno;
    }

    /**
     * @param sno the sno to set
     */
    public void setSno(String sno) {
        this.sno = sno;
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

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the jiguan
     */
    public String getJiguan() {
        return jiguan;
    }

    /**
     * @param jiguan the jiguan to set
     */
    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the maxClasses
     */
    public Integer getMaxClasses() {
        return maxClasses;
    }

    /**
     * @param maxClasses the maxClasses to set
     */
    public void setMaxClasses(Integer maxClasses) {
        this.maxClasses = maxClasses;
    }
}
