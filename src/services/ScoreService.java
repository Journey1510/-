/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ScoreDao;
import entity.Score;
import java.util.List;

/**
 *
 * @author mm
 */
public class ScoreService {
    ScoreDao sd=new ScoreDao();
     public List<Score> loadScore()
    {
        return  sd.loadScore();
    }
    
    public Score getScore1(int id)
    {
        return sd.getScore1(id);
    }
    
    public void updateScore(Score sc)
    {
        sd.updateScore(sc);
    }
}
