/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchgame;

/**
 *
 * @author Acer
 */
public class MatchGame {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        GamePlayer naruto = new GamePlayer();
        naruto.setDimension(24, 24);
        naruto.setPosition(10, 220);
        System.out.println("Posisi Player: "+ naruto.getX() + naruto.getY());
        naruto.Run(24);
        System.out.println("Posisi Player: "+naruto.getX()+ naruto.getY());
        GamePlayer naruto2=new GamePlayer();
        naruto2.setDimension(24, 32);
        naruto2.setPosition(10, 10);

        GameEnemy vale = new GameEnemy();
        vale.setDimension(24, 32);
        vale.setPosition(10, 10);       
        
        GameEnvironment scane = new GameEnvironment();
        scane.addPlayer(naruto);
        scane.addPlayer(naruto);
        scane.addPlayer(naruto2);
        scane.getAllPlayer();
        scane.removePlayer(naruto);
        scane.getAllPlayer();
        scane.addEnemy(vale);
        scane.Interaction();
        
        
        
    
    }
    
      
    
}


