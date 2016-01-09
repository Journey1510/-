/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author mm
 */
import config.HibernateSessionFactory;
import entity.Classes;
import entity.Student;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class ClassDao {
    private Session session;
    private Transaction transaction;
    private Query query;
    public void saveClasses(Classes cs){
        session =HibernateSessionFactory.getSession();
        try{
            transaction =session.beginTransaction();
            session.save(cs);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
           
        }
        HibernateSessionFactory.closeSession();
        
    }
    public void updateClasses(Classes sc)
    {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.update(sc);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        HibernateSessionFactory.closeSession();
    }
    public void deleteClasses(int tid)
    {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.delete(session.get(Classes.class, tid));
            transaction.commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        HibernateSessionFactory.closeSession();
    }
    public Classes getClasses(int csId)
    {
        session=HibernateSessionFactory.getSession();
       Classes classes=(Classes)session.get(Classes.class, csId);
        HibernateSessionFactory.closeSession();
        return classes;
    }
     public Classes getClasses1(int csId)
   {
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Classes as s where sno =  '"+csId+"'");
       Classes cl = (Classes) query.uniqueResult();
       HibernateSessionFactory.closeSession();
           return cl;
   }
    public List<Classes> allClasses(int pageNumber){
        List<Classes> allClasses=new ArrayList<Classes>();
        String hql="from Classes as cs";
        session=HibernateSessionFactory.getSession();
        query=session.createQuery(hql);
        query.setFirstResult((pageNumber-1)*10);
        query.setMaxResults(10);
        allClasses=query.list();
        HibernateSessionFactory.closeSession();
        return allClasses;
    }
    
  
  
    public int getClassesAmount(){
        int classesAmount=0;
        session=HibernateSessionFactory.getSession();
        String hql="select count(*) from Classes as cs";
        query=session.createQuery(hql);
        long count =(Long) query.uniqueResult();
        classesAmount=(int)count;
        HibernateSessionFactory.closeSession();
        return classesAmount;
    }

    public void saveClasses(List<Student> students) {
     session =HibernateSessionFactory.getSession();
        try{
            transaction =session.beginTransaction();
            session.save(students);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
           
        }
        HibernateSessionFactory.closeSession();
        
    }
    
}
