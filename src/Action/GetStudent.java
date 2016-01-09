package Action;

import com.opensymphony.xwork2.ActionContext;
import entity.Student;
import com.opensymphony.xwork2.ActionSupport;
import dao.Usermanager;

public class GetStudent  extends ActionSupport{
    private Student student;
    private String sno;
    private Student n;
    private int stId;
    private Student st;
   Usermanager um=new Usermanager();

    /**
     * @return the sNO
     */
    public String getSno() {
        return sno;
    }

    /**
     * @param sNO the sNO to set
     */
       public Student getStudent() {
        return student;
    }
     public int getStId() {
        return stId;
    }
     public Student getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(Student n) {
        this.n = n;
    }
    /**
     * @param id the id to set
     */
    public void setStId(int stId) {
        this.stId = stId;
    }
    /**
     * @param stusent the stusent to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    public String getstudent()
    {
        Usermanager sm=new Usermanager();
       
        setSt(sm.getStudent(stId));
        return SUCCESS;
    }
     public String showstudent2(){
        if(um.getstudent1(sno)!=null)
        {
          setN( um.getstudent1(sno));
           
            return SUCCESS;
        }
        return  INPUT;
    }
    public String showstudent1(){
    String m = (String) ActionContext.getContext().getSession().get("sno");  
    
        if(um.getstudent1(m)!=null)
        {
          setN( um.getstudent1(m));
           
            return SUCCESS;
        }
        return  INPUT;
    }
    public String showstudent(){
        Usermanager sm=new Usermanager();
        setN(sm.getStudent(stId));
        if(n!=null){
        return SUCCESS;
        }
        return INPUT;
    }
    public String editStudent(){
        Usermanager sm=new Usermanager();
        this.student=sm.getStudent(stId);
        return SUCCESS;
    }

    /**
     * @return the st
     */
    public Student getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(Student st) {
        this.st = st;
    }
 
}
