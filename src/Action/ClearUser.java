/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author mm
 */
public class ClearUser extends ActionSupport {
    
    public ClearUser() {
    }
    
    @Override
    public String execute() throws Exception {
       if(ActionContext.getContext().getSession()!=null){
         ActionContext.getContext().getSession().clear();
         return SUCCESS;
       }
       return INPUT;
    }
}
