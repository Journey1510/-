/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

/**
 *
 * @author mm
 */
import entity.Student;
import com.opensymphony.xwork2.ActionSupport;
import dao.Usermanager;
public class UpdateStudent extends ActionSupport{
  
    private String  sno;
    private int stId;
    private String password;
    private String password1;
    private String password2;
  
  
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

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the password1
     */
    public String getPassword1() {
        return password1;
    }

    /**
     * @param password1 the password1 to set
     */
    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    /**
     * @return the password2
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * @param password2 the password2 to set
     */
    public void setPassword2(String password2) {
        this.password2 = password2;
    }
  
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
      
       //HttpServletRequest request=ServletActionContext.getRequest();
         //  HttpSession session=request.getSession();
         // session.setAttribute("sno",this.sno);
         
        //String m = (String) ActionContext.getContext().getSession().get("sno");
        //实现密码的修改
     
        Usermanager um = new Usermanager();
         Student s = um.getstudent1(getSno());
         s.setPassword(getPassword1());
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
     * @return the id
     */
   

    /**
     * @return the department
     */
   
}
