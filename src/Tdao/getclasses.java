/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tdao;

import com.mysql.jdbc.ResultSet;
import config.HibernateSessionFactory;
import entity.Classes;

import javax.transaction.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mm
 */

public class getclasses {
      Session session;
   Transaction ts;
   ResultSet rs=null;
     public Classes getclasses(String m)
   {
     
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Classes as s where sno =  '"+m+"'");
       Classes classes = (Classes) query.uniqueResult();
       
           return classes;
   }
}
