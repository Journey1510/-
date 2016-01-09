/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Student;
import dao.Usermanager;

/**
 *
 * @author mm
 */

public class SaveStudent  extends ActionSupport{
    private Student student;
    
    public SaveStudent() {
    }
    
    @Override
    public String execute() throws Exception {
        Usermanager sm=new Usermanager();
        sm.saveStudent(student);
        return SUCCESS;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }
}
