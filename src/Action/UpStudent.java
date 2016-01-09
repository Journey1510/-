package Action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Student;
import dao.Usermanager;

public class UpStudent extends ActionSupport{

    private Student n;
    private int stId;
    
     private String username;
     private String sno;
     private String email;
     private String tel;
     private String mark;
     private String sex;
     private String department;
     private String jiguan;
     private String password;
     private String image;
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
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    /**
     * @return the st
     */
    public Student getN() {
        return n;
    }

    /**
     * @param st the st to set
     */
    public void setN(Student N) {
        this.n = N;
    }

    /**
     * @return the id
     */
    public int getStId() {
        return stId;
    }

    /**
     * @param id the id to set
     */
    public void setStId(int stId) {
        this.stId = stId;
    }
    @Override
    public String execute(){
        //实现信息的修改
        Usermanager um = new Usermanager();
         Student s = um.getstudent1(getSno());     
         s.setJiguan(getJiguan());
         s.setTel(getTel());
         s.setEmail(getEmail());
         
        try{
             um.updateStudent(s);
              return SUCCESS;
        }
        catch (Exception e){
            e.printStackTrace();
        }     
      return INPUT;
    
      
   }

    /**
     * @return the username
     */
   
}