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
public class AddClasses extends ActionSupport{
    
     private String cname;
     private String cmark;
     private String courTime;
     private String roomId;
     private String teaId;
     private Integer chooseMax;
    
    
    public String execute() throws Exception {
       Classes cs=new Classes();
       ClassDao cd=new ClassDao();
       cs.setCname(cname);
       cs.setCmark(cmark);
       cs.setCourTime(courTime);
       cs.setRoomId(roomId);
       cs.setTeaId(teaId);
       cs.setChooseMax(chooseMax);
       if(cs!=null){
           cd.saveClasses(cs);
           return SUCCESS;
       }
       return INPUT;
    }
    public String updataClasses(){
         Classes cs=new Classes();
       ClassDao cd=new ClassDao();
       cs.setCname(cname);
       cs.setCmark(cmark);
       cs.setCourTime(courTime);
       cs.setRoomId(roomId);
       cs.setTeaId(teaId);
       cs.setChooseMax(chooseMax);
       if(cs!=null){
           cd.updateClasses(cs);
           return SUCCESS;
       }
       return INPUT;
    }
    /**
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname the cname to set
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return the cmark
     */
    public String getCmark() {
        return cmark;
    }

    /**
     * @param cmark the cmark to set
     */
    public void setCmark(String cmark) {
        this.cmark = cmark;
    }

    /**
     * @return the courTime
     */
    public String getCourTime() {
        return courTime;
    }

    /**
     * @param courTime the courTime to set
     */
    public void setCourTime(String courTime) {
        this.courTime = courTime;
    }

    /**
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the teaId
     */
    public String getTeaId() {
        return teaId;
    }

    /**
     * @param teaId the teaId to set
     */
    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    /**
     * @return the chooseMax
     */
    public Integer getChooseMax() {
        return chooseMax;
    }

    /**
     * @param chooseMax the chooseMax to set
     */
    public void setChooseMax(Integer chooseMax) {
        this.chooseMax = chooseMax;
    }

    /**
     * @return the chooseCurNum
     */
  
}
