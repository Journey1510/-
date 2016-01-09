/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.opensymphony.xwork2.ActionSupport;
import dao.AdminDao;
import dao.TeacherDao;
import entity.Student;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import dao.Usermanager;
import entity.Admin;
import entity.Teacher;
import org.apache.struts2.ServletActionContext;

    
/**
 *
 * @author mm
 */
public class Login  extends ActionSupport{
    
        private HttpServletRequest request;
        private String username;
        private String sno;
        private Integer id;
        private String password;
         private Integer radiobutton;
        
       Usermanager sm=new Usermanager();
        
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }
      public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    //学生登录
    public String execute() {
        if(radiobutton==1){
          
       Student s = new Student();
       s.setSno(getSno());
       s.setPassword(getPassword());
        if (sm.stuLogin(s)) {
          HttpServletRequest request=ServletActionContext.getRequest();
         HttpSession session=request.getSession();
          Student sn=sm.getstudent1(sno);
          session.setAttribute("username", sn.getUsername());
          session.setAttribute("sno", this.sno);
          session.setAttribute("id", sn.getStId());
            return SUCCESS;
        }
        return INPUT;
     //教师登录
    }else if(radiobutton==2){
            TeacherDao td=new TeacherDao();
            Teacher tc=new Teacher();
            
            tc.setTeaId(sno);
            tc.setTpassword(password);
            if(td.tcLogin(tc))
            {
           HttpServletRequest request=ServletActionContext.getRequest();
         HttpSession session=request.getSession();
         Teacher tec=td.getTeacher1(sno);
          session.setAttribute("tname", tec.getTname());
          session.setAttribute("tid", tec.getTid());
          session.setAttribute("teaId", tec.getTeaId());
          return "tsuccess";
            
            
            }
            return INPUT;
        }
    //管理员登录
    else if(radiobutton==3){
              AdminDao ad=new AdminDao();
              Admin am=new Admin();
              am.setUsername(sno);
              am.setPassword(password);
              if(ad.adminLogin(am)){
       HttpServletRequest request=ServletActionContext.getRequest();
         HttpSession session=request.getSession();
         Admin adm=ad.getAdmin(sno);
          session.setAttribute("username", adm.getUsername());  
          session.setAttribute("id", adm.getId());
                  return "asuccess";
              }
              return INPUT;
     }
    else{
        return INPUT;
    }
        
}

    /**
     * @return the radiobutton
     */
    public Integer getRadiobutton() {
        return radiobutton;
    }

    /**
     * @param radiobutton the radiobutton to set
     */
    public void setRadiobutton(Integer radiobutton) {
        this.radiobutton = radiobutton;
    }

   
   
}
