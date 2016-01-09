 
package services;

import dao.ChooseCourseDAO;
import entity.Classes;
import java.util.List;

 
public class ChooseCourseService {
    
    ChooseCourseDAO dao = new ChooseCourseDAO();
    
    public List<Classes> loadClasses()
    {
        return  dao.loadClasseses();
    }
    
    public Classes loadClassesById(int id)
    {
        return dao.loadClasses(id);
    }
    
    public void updateClasses(Classes claz)
    {
        dao.updateClasses(claz);
    }
   
}
