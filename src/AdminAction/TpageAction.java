/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.TeacherDao;

/**
 *
 * @author mm
 */
public class TpageAction extends ActionSupport{
    
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
        TeacherDao td=new TeacherDao();
        int teacherAmount=td.getTeacherAmount();
        this.totalPage=teacherAmount % 10==0 ? (teacherAmount / 10):(teacherAmount / 10+1);
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