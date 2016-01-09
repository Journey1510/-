/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

/**
 *
 * @author mm
 */
public class Logininterceptor extends AbstractInterceptor {
    
    
    
    @Override
    public String intercept(ActionInvocation ai) throws Exception {
       Map session=ai.getInvocationContext().getSession();
        String username=(String)session.get("username");
        if(username!=null&&username.length()>0){
            return ai.invoke();
        }else
        {
            ActionContext ac=ai.getInvocationContext();
            ac.put("info","Äú»¹Ã»ÓÐµÇÂ¼£¬ÇëµÇÂ¼£¡");
            return Action.INPUT;
        }
    }
}
