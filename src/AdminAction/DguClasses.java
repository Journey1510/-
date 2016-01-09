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
public class DguClasses extends ActionSupport{
    
      private int csId;
      private Classes cs;
     ClassDao cd=new ClassDao();
      ClassDao c=new ClassDao();

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
      
    @Override
    public String execute() throws Exception {
      if(csId!=0){
         cd.deleteClasses(csId);
         return SUCCESS;
      }
      return INPUT;
    }
    public String getClasses() throws Exception{
        if(c.getClasses(csId)!=null){
          setCs(c.getClasses1(csId));
            return SUCCESS;
        }
        return INPUT;
        
    }
}
