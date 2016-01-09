package AdminAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.Usermanager;


public class PageAction  extends ActionSupport {
 private int pageNumber;
    private int totalPage;

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
    public String execute() throws Exception {
         Usermanager sm=new Usermanager();
        int studentAmount=sm.getStudentAmount();
        this.totalPage=studentAmount % 10==0 ? (studentAmount / 10):(studentAmount / 10+1);
        if(pageNumber==0){
            pageNumber=1;
        }
        if(this.pageNumber<1){
            this.pageNumber=1;
        }
        if(this.pageNumber>totalPage){
            this.pageNumber=totalPage;
        }
        return SUCCESS;
    }
    }
    

