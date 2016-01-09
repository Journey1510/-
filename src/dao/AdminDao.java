/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.HibernateSessionFactory;
import entity.Admin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mm
 */
public class AdminDao {
      private Session session;
    private Transaction transaction;
    private Query query;
    public boolean adminLogin(Admin ad)
      {
       if(ad.getUsername()!=null&&ad.getPassword()!=null){
       session =  HibernateSessionFactory.getSession();
        try{
       Query query = (Query) session.createQuery("from Admin as a where a.username =  '"+ad.getUsername()+"' and a.password = '"+ad.getPassword()+"'   ");
       Admin s = (Admin) query.uniqueResult();
       if (s!=null) {
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
    public Admin getAdmin(String m)
   {
     
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Admin as a where a.username =  '"+m+"'");
       Admin ad = (Admin) query.uniqueResult();
       HibernateSessionFactory.closeSession();
           return ad;
     
     
   }
      public void saveAdmin(Admin a){
        session =HibernateSessionFactory.getSession();
        try{
            transaction =session.beginTransaction();
            session.save(a);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
           
        }
        HibernateSessionFactory.closeSession();
        
    }
}
