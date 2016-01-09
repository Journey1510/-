/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Score;
import entity.Student;
import java.util.List;
import org.apache.struts2.ServletActionContext;
import services.ScoreService;
import services.StudentService;

/**
 *
 * @author mm
 */
public class ResultInquiry extends ActionSupport {
    private Student stu;
    private Score sc;
    private List<Score>scorelist;
    ScoreService scoreService=new ScoreService();
    StudentService studentService = new StudentService();
    /**
     * @return the stu
     */
    public Student getStu() {
        return stu;
    }

    /**
     * @param stu the stu to set
     */
    public void setStu(Student stu) {
        this.stu = stu;
    }
    public Score getSc() {
        return sc;
    }

    /**
     * @param sc the sc to set
     */
    public void setSc(Score sc) {
        this.sc = sc;
    }

    /**
     * @param scorelist the scorelist to set
     */
    
    public ResultInquiry() {
    }
       public List<Score> getScorelist() {
        return scorelist;
    }

    /**
     * @param scorelist the scorelist to set
     */
    public void setScorelist(List<Score> scorelist) {
        this.scorelist = scorelist;
    }
    @Override
    public String execute() throws Exception {
        int scid=0;
      if(ActionContext.getContext().getSession().get("id")!=null)
      {
          scid=Integer.parseInt(ActionContext.getContext().getSession().toString());
      }
    
      setScorelist(scoreService.loadScore());
      setStu(studentService.loadStudentById(scid));
      return SUCCESS;
    }
    public String viewScore() throws Exception{
        try{
            int id=0;
            if(ServletActionContext.getRequest().getParameter("scid") != null)
            {
                id=Integer.parseInt(ServletActionContext.getRequest().getParameter("scid").toString());
            }
            setSc(scoreService.getScore1(id));
           return "viewScore";
      
          } catch (Exception e) {
            return ERROR;
        }
    }
    public String myScore() throws Exception{
        int scid=0;
        try{
            if(ActionContext.getContext().getSession()!=null){
                scid=Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
            }
            setStu(studentService.loadStudentById(scid));
            return "myscore";
            
        }catch(Exception e)
        {
            return ERROR;
        }
    }

    
}
