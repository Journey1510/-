package entity;


import java.util.HashSet;
import java.util.Set;


public class Classes  implements java.io.Serializable {

     private Integer csId;
     private String cname;
     private String cmark;
     private String courTime;
     private String roomId;
     private String teaId;
     private Integer chooseMax;
     private Integer chooseCurNum;
     private Set students = new HashSet();

    public Classes() {
    }

    public Classes(String cname, String cmark, String courTime, String roomId, String teaId, Integer chooseMax, Integer chooseCurNum) {
       this.cname = cname;
       this.cmark = cmark;
       this.courTime = courTime;
       this.roomId = roomId;
       this.teaId = teaId;
       this.chooseMax = chooseMax;
       this.chooseCurNum = chooseCurNum;
    }
   
    public Integer getCsId() {
        return this.csId;
    }
    
    public void setCsId(Integer csId) {
        this.csId = csId;
    }
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCmark() {
        return this.cmark;
    }
    
    public void setCmark(String cmark) {
        this.cmark = cmark;
    }
    public String getCourTime() {
        return this.courTime;
    }
    
    public void setCourTime(String courTime) {
        this.courTime = courTime;
    }
    public String getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    public String getTeaId() {
        return this.teaId;
    }
    
    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }
    public Integer getChooseMax() {
        return this.chooseMax;
    }
    
    public void setChooseMax(Integer chooseMax) {
        this.chooseMax = chooseMax;
    }
    public Integer getChooseCurNum() {
        return this.chooseCurNum;
    }
    
    public void setChooseCurNum(Integer chooseCurNum) {
        this.chooseCurNum = chooseCurNum;
    }

    /**
     * @return the students
     */
    public Set getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Set students) {
        this.students = students;
    }




}


