package dao;

import config.HibernateSessionFactory;
import entity.Classes;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Student;
public class Usermanager {
    private Session session;
    private Transaction transaction;
    private Query query;
    public void saveStudent(Student st){
        session =HibernateSessionFactory.getSession();
        try{
            transaction =session.beginTransaction();
            session.save(st);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
           
        }
        HibernateSessionFactory.closeSession();
        
    }
    public void updateStudent(Student st)
    {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.update(st);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        HibernateSessionFactory.closeSession();
    }
    public void deleteStudent(String  sno)
    {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.delete(sno);
            transaction.commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        HibernateSessionFactory.closeSession();
    }
    public Student getStudent(int stId)
    {
        session=HibernateSessionFactory.getSession();
        Student student=(Student)session.get(Student.class, stId);
        HibernateSessionFactory.closeSession();
        return student;
    }
    public List<Student> allStudent(int pageNumber){
        List<Student> allStudent=new ArrayList<Student>();
        String hql="from Student as st";
        session=HibernateSessionFactory.getSession();
        query=session.createQuery(hql);
        query.setFirstResult((pageNumber-1)*10);
        query.setMaxResults(10);
        allStudent=query.list();
        HibernateSessionFactory.closeSession();
        return allStudent;
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
   public Student getstudent1(String m)
   {
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Student as s where sno =  '"+m+"'");
       Student st = (Student) query.uniqueResult();
       HibernateSessionFactory.closeSession();
           return st;
   }
   public boolean stuLogin(Student stu)
      {
       if(stu.getSno()!=null&&stu.getPassword()!=null){
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Student as s where sno =  '"+stu.getSno()+"' and password = '"+stu.getPassword()+"'   ");
       Student s = (Student) query.uniqueResult();
       if (s!=null) {
            HibernateSessionFactory.closeSession();
           return true;
         
       }
       }
       return false;
       }
    public Student getstudent2(int stId)
   {
     
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Student as s where stId =  '"+stId+"'");
       Student st = (Student) query.uniqueResult();
       HibernateSessionFactory.closeSession();
           return st;
     
     
   }
    public int getStudentAmount(){
        int studentAmount=0;
        session=HibernateSessionFactory.getSession();
        String hql="select count(*) from Student as st";
        query=session.createQuery(hql);
        long count =(Long) query.uniqueResult();
        studentAmount=(int)count;
        HibernateSessionFactory.closeSession();
        return studentAmount;
    }
    
}
