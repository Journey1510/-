 
package dao;

import config.HibernateSessionFactory;
import entity.Classes;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ChooseCourseDAO {
    
   
     private Session session;
     private Transaction ts;
    private  Classes clz;

     public List<Classes> loadClasseses()
     {
         session = HibernateSessionFactory.getSession();
         String hql = "from Classes as c";
         Query query = session.createQuery(hql);
         List<Classes> list = query.list();
         return list;
     }
     
   
     public Classes loadClasses(int id)
     {
         try 
         {
         session = HibernateSessionFactory.getSession();
         clz = (Classes)session.load(Classes.class, new Integer(id));
         if (!Hibernate.isInitialized(clz.getStudents())) {
         Hibernate.initialize(clz);
         } 
         }
        catch (Exception e) {
             e.printStackTrace();
         }
         finally
         {
             HibernateSessionFactory.closeSession();
         }
         return clz;
     }
    
     public void updateClasses(Classes claz)
     {
         session = HibernateSessionFactory.getSession();
         ts = session.beginTransaction();
         try {
             claz = (Classes) session.merge(claz);
             session.update(claz);
             ts.commit();
         } catch (Exception e) {
             ts.rollback();
         }
        HibernateSessionFactory.closeSession();
     }
     
     
}
