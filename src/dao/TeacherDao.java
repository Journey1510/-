
package dao;


import config.HibernateSessionFactory;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import entity.Teacher;
public class TeacherDao {
    private Session session;
    private Transaction transaction;
    private Query query;
    public void saveTeacher(Teacher tc){
        session =HibernateSessionFactory.getSession();
        try{
            transaction =session.beginTransaction();
            session.save(tc);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
           
        }
        HibernateSessionFactory.closeSession();
        
    }
    public void updateTeacher(Teacher tc)
    {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.update(tc);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        HibernateSessionFactory.closeSession();
    }
    public void deleteTeacher(int tid)
    {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.delete(session.get(Teacher.class, tid));
            transaction.commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        HibernateSessionFactory.closeSession();
    }
    public Teacher getTeacher(int tid)
    {
        session=HibernateSessionFactory.getSession();
       Teacher teacher=(Teacher)session.get(Teacher.class, tid);
        HibernateSessionFactory.closeSession();
        return teacher;
    }
    public List<Teacher> allTeacher(int pageNumber){
        List<Teacher> allTeacher=new ArrayList<Teacher>();
        String hql="from Teacher as tc";
        session=HibernateSessionFactory.getSession();
        query=session.createQuery(hql);
        query.setFirstResult((pageNumber-1)*10);
        query.setMaxResults(10);
        allTeacher=query.list();
        HibernateSessionFactory.closeSession();
        return allTeacher;
    }
    
  
   public boolean tcLogin(Teacher tc)
      {
          
       if(tc.getTeaId()!=null&&tc.getTpassword()!=null){
       session =  HibernateSessionFactory.getSession();
       try{
       Query query = (Query) session.createQuery("from Teacher as t where t.teaId = '"+tc.getTeaId()+"' and  t.tpassword = '"+tc.getTpassword()+"'  ");
       Teacher t=(Teacher)query.uniqueResult();
       if (t!=null) {
            HibernateSessionFactory.closeSession();
           return true;
         
       }
       }
        catch(Exception e){
            e.printStackTrace();
        }
        HibernateSessionFactory.closeSession();
     
       
      
      }
       return false;
    }
   public Teacher getteacher1(String m)
   {
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Teacher as t where teaId =  '"+m+"'");
       Teacher st = (Teacher) query.uniqueResult();
       HibernateSessionFactory.closeSession();
           return st;
   }
   public Teacher getTeacher1(String m)
   {
     
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Teacher as t where teaId =  '"+m+"'");
       Teacher tc = (Teacher) query.uniqueResult();
       HibernateSessionFactory.closeSession();
           return tc;     
     
   }
    public int getTeacherAmount(){
        int teacherAmount=0;
        session=HibernateSessionFactory.getSession();
        String hql="select count(*) from Teacher as tc";
        query=session.createQuery(hql);
        long count =(Long) query.uniqueResult();
        teacherAmount=(int)count;
        HibernateSessionFactory.closeSession();
        return teacherAmount;
    }
    
}
