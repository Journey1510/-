/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.ClassDao;
import entity.Classes;

/**
 *
 * @author mm
 */
public class getCs extends ActionSupport{
       private int csId;
      private Classes cs;
   
      ClassDao c=new ClassDao();
    
    public getCs() {
    }
    
    @Override
    public String execute() throws Exception {
      if(c.getClasses(getCsId())!=null){
          setCs(c.getClasses1(getCsId()));
            return SUCCESS;
        }
        return INPUT;
    }

    /**
     * @return the csId
     */
    public int getCsId() {
        return csId;
    }

    /**
     * @param csId the csId to set
     */
    public void setCsId(int csId) {
        this.csId = csId;
    }

    /**
     * @return the cs
     */
    public Classes getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(Classes cs) {
        this.cs = cs;
    }
}
