package services;

import dao.ClassDao;
import dao.StuDAO;
import entity.Student;
import java.util.List;
 


public class StudentService {
    
    StuDAO dao = new StuDAO();
    
    public  Student loadStudentById(int id) throws IllegalStateException
    {
        return dao.loadStudent(id);
    }
    
    public void  saveOrUpdate(Student student)
    {
        try {
            dao.saveOrUpdateStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void importStudentsinfo(List<Student> students) {
       try{
          ClassDao cd= new ClassDao();
          cd.saveClasses(students);
          
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
}
