package entity;
// Generated 2011-11-29 21:53:09 by Hibernate Tools 3.2.1.GA

public class Score  implements java.io.Serializable {


     private Integer scid;
     private Integer sno;
     private Integer tno;
     private String tname;
     private Integer cno;
     private String cdep;
     private Integer cmark;
     private String cname;

    public Score() {
    }

    public Score(Integer sno, Integer tno, String tname, Integer cno, String cdep, Integer cmark, String cname) {
       this.sno = sno;
       this.tno = tno;
       this.tname = tname;
       this.cno = cno;
       this.cdep = cdep;
       this.cmark = cmark;
       this.cname = cname;
    }
   
    public Integer getScid() {
        return this.scid;
    }
    
    public void setScid(Integer scid) {
        this.scid = scid;
    }
    public Integer getSno() {
        return this.sno;
    }
    
    public void setSno(Integer sno) {
        this.sno = sno;
    }
    public Integer getTno() {
        return this.tno;
    }
    
    public void setTno(Integer tno) {
        this.tno = tno;
    }
    public String getTname() {
        return this.tname;
    }
    
    public void setTname(String tname) {
        this.tname = tname;
    }
    public Integer getCno() {
        return this.cno;
    }
    
    public void setCno(Integer cno) {
        this.cno = cno;
    }
    public String getCdep() {
        return this.cdep;
    }
    
    public void setCdep(String cdep) {
        this.cdep = cdep;
    }
    public Integer getCmark() {
        return this.cmark;
    }
    
    public void setCmark(Integer cmark) {
        this.cmark = cmark;
    }
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }




}


