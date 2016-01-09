/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Student;
import java.io.*;
import java.io.FileOutputStream;
import dao.Usermanager;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author mm
 */
public class MyUpload extends ActionSupport{
    private File doc;
    private String docContentType;
    private String docFileName;
    private String path;
    private String sno;
    private int id;
    
      public File getDoc() {
        return doc;
    }

    /**
     * @param doc the doc to set
     */
    public void setDoc(File doc) {
        this.doc = doc;
    }

    /**
     * @return the docContentType
     */
    public String getDocContentType() {
        return docContentType;
    }

    /**
     * @param docContentType the docContentType to set
     */
    public void setDocContentType(String docContentType) {
        this.docContentType = docContentType;
    }

    /**
     * @return the idocFileName
     */
    public String getDocFileName() {
        return docFileName;
    }

    /**
     * @param idocFileName the idocFileName to set
     */
    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }
    public String getPath() throws Exception{
        return ServletActionContext.getServletContext().getRealPath(path);
      
    }

    /**
     * @param path the path to set
     */
    public void setPath(String value) {
        this.path = value;
    }
    
    @Override
     public String execute() throws Exception {
        docFileName=getFileName(docFileName);
        FileOutputStream fos=new  FileOutputStream(getPath()+"\\"+docFileName);
        FileInputStream fis=new FileInputStream(doc);
        byte[] b=new byte[1024];
        int length=0;
        while((length=fis.read(b))>0){
            fos.write(b, 0, length);
        }
          int n=Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
          setId(n);
         Usermanager um = new Usermanager();
         Student s = um.getStudent(getId());
       
         s.setImage(getDocFileName());
         um.updateStudent(s);
        return SUCCESS;
    }
     private String getFileName(String fileName){
         int position=fileName.lastIndexOf(".");
         String extension=fileName.substring(position);
         return System.currentTimeMillis()+extension;
         
     }

    /**
     * @return the sno
     */
    public String getSno() {
        return sno;
    }

    /**
     * @param sno the sno to set
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

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

   
  
}
