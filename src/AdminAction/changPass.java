/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.AdminDao;
import entity.Admin;

/**
 *
 * @author mm
 */
public class changPass extends ActionSupport {
      private String password;
     Admin ad=new Admin();
    public changPass() {
    }
    
    @Override
    public String execute() throws Exception {
        String m = (String) ActionContext.getContext().getSession().get("sno");
        if(getPassword()!=null&&m!=null);
        {
            AdminDao a=new AdminDao();
            ad.setUsername(m);
            ad.setPassword(getPassword());
            a.saveAdmin(ad);
            return SUCCESS;
        }
      
      
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
