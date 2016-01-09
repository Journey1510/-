package AdminAction;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author mm
 */
import entity.Classes;
import java.util.List;
import dao.Usermanager;
public class AllClasses  extends ActionSupport {
    private int pageNumber;
    private int totalPage;
    private List<Classes> allClasses;
    
  

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

    /**
     * @return the allClasses
     */
    public List<Classes> getAllClasses() {
        return allClasses;
    }

    /**
     * @param allClasses the allClasses to set
     */
    public void setAllClasses(List<Classes> allClasses) {
        this.allClasses = allClasses;
    }
    @Override
      public String execute() throws Exception {
      Usermanager sm=new Usermanager();
      allClasses=sm.allClasses(pageNumber);
      return SUCCESS;
    }
}