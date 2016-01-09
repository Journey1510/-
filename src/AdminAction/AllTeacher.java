/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.TeacherDao;
import entity.Teacher;
import java.util.List;

/**
 *
 * @author mm
 */
public class AllTeacher extends ActionSupport {
    private int pageNumber;
    private int totalPage;
    private List<Teacher> allTeacher;

    /**
     * @return the pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber the pageNumber to set
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return the totalPage
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage the totalPage to set
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    
  
   
    @Override
    public String execute() throws Exception{
   TeacherDao td=new TeacherDao();
       setAllTeacher( td.allTeacher(pageNumber));
       if(allTeacher!=null)
       {
           
             return SUCCESS;
   
       }
       return INPUT;
    }

    /**
     * @return the allTeacher
     */
    public List<Teacher> getAllTeacher() {
        return allTeacher;
    }

    /**
     * @param allTeacher the allTeacher to set
     */
    public void setAllTeacher(List<Teacher> allTeacher) {
        this.allTeacher = allTeacher;
    }

    /**
     * @return the allStudent
     */
  

   
  
}