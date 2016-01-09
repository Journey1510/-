/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

/**
 *
 * @author mm
 */
import com.opensymphony.xwork2.ActionSupport;
import dao.Usermanager;
public class DeleteStudent extends ActionSupport {
    private String  sno;
    /**
     * @return the sno
     */
    public String getSno() {
        return sno;
    }
    /**
     * @param sno the sno to set
     */
    public void setSno(String  sno) {
        this.sno = sno;
    }
    @Override
    public String execute()
    {
        Usermanager sm=new Usermanager();
        sm.deleteStudent(sno);
        return SUCCESS;
    }
}
