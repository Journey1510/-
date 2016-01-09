package dao;

import config.HibernateSessionFactory;
import entity.Student;
 
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StuDAO {
    
    
    Query query;
    Transaction ts;
    Student stu;
    
    public Student loadStudent(int id) throws IllegalStateException
    {
        Session session = HibernateSessionFactory.getSession();
        try {
             ts = session.beginTransaction();
             stu = (Student)session.load(Student.class, id);
            if (!Hibernate.isInitialized(stu.getClasses())) {
                Hibernate.initialize(stu.getClasses());
            }
             ts.commit();
            
        } catch (Exception e) {
            if (ts!=null) ts.rollback();
            e.printStackTrace();
        }
        finally
        {
            HibernateSessionFactory.closeSession();
        }
        return stu;
       
    }
    public void saveOrUpdateStudent(Student student)
    {
         Session session = HibernateSessionFactory.getSession();
        try {
             ts = session.beginTransaction();
             session.saveOrUpdate(student);
             ts.commit();
        } catch (Exception e) {
            if(ts!=null) ts.rollback();
            e.printStackTrace();
        }
        finally
        {
            HibernateSessionFactory.closeSession();
        }
    }
}
