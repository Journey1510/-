/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Taction;

import Tdao.getclasses;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Classes;

/**
 *
 * @author mm
 */
public class GetClasses extends ActionSupport {
    private int id;
    private Classes classes;
   getclasses gclasses=new getclasses();
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the classes
     */
    public Classes getClasses() {
        return classes;
    }

    /**
     * @param classes the classes to set
     */
    public void setClasses(Classes classes) {
        this.classes = classes;
    }
     public String showclasses(){
    String m = (String) ActionContext.getContext().getSession().get("id");    
        if(gclasses.getclasses(m)!=null)
        {
          setClasses( gclasses.getclasses(m));
           
            return SUCCESS;
        }
        return  INPUT;
    }
}
