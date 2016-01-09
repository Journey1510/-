/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.HibernateSessionFactory;
import entity.Classes;
import entity.Screfer;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mm
 */
public class Cscore {
    ClassDao courseDao = new ClassDao();
    private Session session;
    private Transaction ts;

    public List<Screfer> getRefScoreByStudentId(int sid)  {
        try {
            List<Screfer> list = new ArrayList<Screfer>() ;
            session = HibernateSessionFactory.getSession();
            ts = session.beginTransaction();            
            List<Object> objs = session.createSQLQuery("select * from student_classes where st_id = '" + sid + "' ").list();
            for (int i = 0; i < objs.size(); i++) {
                Object[] o = (Object[]) objs.get(i);
                Screfer s = new Screfer();
                int cid = Integer.parseInt(o[2].toString());
                int score = Integer.parseInt(o[0].toString());
                Classes c = courseDao.getClasses(cid);
                s.setCourseName(c.getCname());
                s.setScore(score);
                list.add(s);
            }
            return list;
            
        } catch (Exception ex) {
            return null;
            
        }
        
        
    }
}
