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
import entity.Score;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class ScoreDao {
     private Session session;
    private Transaction transaction;
    private Query query;
     public List<Score> allScore(int pageNumber){
        List<Score> allScore=new ArrayList<Score>();
        String hql="from Score as sc";
        session=HibernateSessionFactory.getSession();
        query=session.createQuery(hql);
        query.setFirstResult((pageNumber-1)*10);
        query.setMaxResults(10);
        allScore=query.list();
        HibernateSessionFactory.closeSession();
        return allScore;
    }
      public List<Score> loadScore()
     {
         session = HibernateSessionFactory.getSession();
         String hql = "from Score as sc";
         Query query = session.createQuery(hql);
         List<Score> list = query.list();
          HibernateSessionFactory.closeSession();
         return list;
     }
      public void saveScore(Score sc){
        session =HibernateSessionFactory.getSession();
        try{
            transaction =session.beginTransaction();
            session.save(sc);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
           
        }
        HibernateSessionFactory.closeSession();
        
    }
      public void updateScore(Score sc)
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
      public void deleteStudent(String  sno)
    {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.delete(session.get(Score.class, sno));
            transaction.commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        HibernateSessionFactory.closeSession();
    }
    public Score getScore(int scId)
    {
        session=HibernateSessionFactory.getSession();
        Score score=(Score)session.get(Score.class, scId);
        HibernateSessionFactory.closeSession();
        return score;
    }
      public Score getScore1(int scId)
   {
     
       session =  HibernateSessionFactory.getSession();
       Query query = (Query) session.createQuery("from Score as sc where stId =  '"+scId+"'");
       Score sc = (Score) query.uniqueResult();
       HibernateSessionFactory.closeSession();
           return sc;
     
     
   }
    public int getScoreAmount(){
        int scoreAmount=0;
        session=HibernateSessionFactory.getSession();
        String hql="select count(*) from Score as sc";
        query=session.createQuery(hql);
        long count =(Long) query.uniqueResult();
        scoreAmount=(int)count;
        HibernateSessionFactory.closeSession();
        return scoreAmount;
    }
}
