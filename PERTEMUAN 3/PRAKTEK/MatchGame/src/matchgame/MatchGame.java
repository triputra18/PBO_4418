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
        naruto.setDimension(120, 60);
        naruto.setPosition(50, 24);
        naruto.Run();
        
        System.out.println("Player width: "+ naruto.getWidth() +" and height: "
        + naruto.getHeight());
        System.out.println("Player Position X: "+naruto.getX() + " and position Y: "
        + naruto.getY());
        naruto.Run(45);
        
        GameEnemy vale = new GameEnemy();
        vale.setDimension(80, 65);
        vale.setPosition(12, 8);
        vale.Run();
        System.out.println("Enemy width: "+ vale.getWidth() +" and height: "
        + naruto.getHeight());
        System.out.println("Enemy position X: "+vale.getX() + " and position Y: "
        + naruto.getY());
    
    }
    
}
