/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.opensymphony.xwork2.ActionContext;
import dao.Cscore;
import entity.Screfer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mm
 */
public class Score  {
    Cscore cs = new Cscore();
    private List<Screfer> s= new ArrayList<Screfer>();
    public Score() {
    }
    
    public String execute() throws Exception {
      int n=Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
        setS(cs.getRefScoreByStudentId(n));
    return "SUCCESS";

 }

    /**
     * @return the s
     */
    public List<Screfer> getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(List<Screfer> s) {
        this.s = s;
    }
}