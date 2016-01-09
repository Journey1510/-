/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.TeacherDao;
import entity.Teacher;

/**
 *
 * @author mm
 */
public class DguTeacher extends ActionSupport{
    private int tid;
   TeacherDao td=new TeacherDao();
   private Teacher t;
      /**
     * @return the t
     */
    public Teacher getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(Teacher t) {
        this.t = t;
    }
      /**
     * @return the tid
     */
    public int getTid() {
        return tid;
    }

    /**
     * @param tid the tid to set
     */
    public void setTid(int tid) {
        this.tid = tid;
    }
    //删除教师
    public String execute() throws Exception {
       
       if(tid!=0){
       td.deleteTeacher(tid);
       return SUCCESS;
       }
       return INPUT;
    }

   //查看教师基本信息
    public String getTeacher(){
        if(td.getTeacher(tid)!=null){
            setT(td.getTeacher(tid));
            return SUCCESS;
        }
        return INPUT;
    }
  

  
}
