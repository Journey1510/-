
package AdminAction;

import entity.Student;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;
import dao.Usermanager;
public class AllStudent extends ActionSupport {
    private int pageNumber;
    private int totalPage;
    private List<Student> allStudent;

    public int getPageNumber() {
        return pageNumber;
    }


    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

   
    public int getTotalPage() {
        return totalPage;
    }

 
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
      public List<Student> getAllStudent() {
        return allStudent;
    }

  
    public void setAllStudent(List<Student> allStudent) {
        this.allStudent = allStudent;
    }

   
    public String execute() throws Exception{
    Usermanager sm=new Usermanager();
       allStudent =  sm.allStudent(pageNumber);
       if(allStudent!=null)
       {
            System.out.println(allStudent.get(1).getSno());
             return SUCCESS;
   
       }
       return INPUT;
    }  
  
}
