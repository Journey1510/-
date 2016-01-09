package entity;

import java.util.HashSet;
import java.util.Set;

public class Student  implements java.io.Serializable {


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
     private Integer maxClasses;
     private Set classes = new HashSet();
     private Set Score=new HashSet();

    public Student() {
    }

	
    public Student(String username, String sno) {
        this.username = username;
        this.sno = sno;
    }
    public Student(int stId,String username, String sno, String email, String tel, String mark, String sex, String department, String jiguan, String password, String image, Integer maxClasses) {
        this.stId=stId;
        this.username = username;
       this.sno = sno;
       this.email = email;
       this.tel = tel;
       this.mark = mark;
       this.sex = sex;
       this.department = department;
       this.jiguan = jiguan;
       this.password = password;
       this.image = image;
       this.maxClasses = maxClasses;
    }
   
    public int getStId() {
        return this.stId;
    }
    
    public void setStId(int stId) {
        this.stId = stId;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSno() {
        return this.sno;
    }
    
    public void setSno(String sno) {
        this.sno = sno;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getMark() {
        return this.mark;
    }
    
    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getJiguan() {
        return this.jiguan;
    }
    
    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public Integer getMaxClasses() {
        return this.maxClasses;
    }
    
    public void setMaxClasses(Integer maxClasses) {
        this.maxClasses = maxClasses;
    }

    /**
     * @return the classes
     */
    public Set getClasses() {
        return classes;
    }

    /**
     * @param classes the classes to set
     */
    public void setClasses(Set classes) {
        this.classes = classes;
    }

    /**
     * @return the Score
     */
    public Set getScore() {
        return Score;
    }

    /**
     * @param Score the Score to set
     */
    public void setScore(Set Score) {
        this.Score = Score;
    }




}


