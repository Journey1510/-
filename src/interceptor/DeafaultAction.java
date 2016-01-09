/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author mm
 */
public class DeafaultAction extends ActionSupport {
    
    public String execute() throws Exception {
       return SUCCESS;
    }
}
