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
import java.util.ArrayList;
public class GameEnvironment {
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>(); 
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>(); 

    public GameEnvironment(){
    }

    public GameEnvironment(double width, double height){
        this.width=width;
        this.height=height;
    }

    public void addPlayer(GamePlayer newPlayer){
        arrPlayer.add(newPlayer);
    }

    public void removePlayer(GamePlayer removeplayer){
        arrPlayer.remove(removeplayer);
    }

    public void getAllPlayer(){
        System.out.println("Many Player: "+arrPlayer);
       
    }
    public void addEnemy(GameEnemy newEnemy){
        arrEnemy.add(newEnemy);
    }
    
    public void removeEnemy(GameEnemy removeenemy){
        arrEnemy.remove(removeenemy);
    }

    public void getAllEnemy(){
        System.out.println("Many Enemy: "+arrEnemy);
        
    }

    public void Interaction(){
        if (arrPlayer == null|arrEnemy == null){
            System.out.println("Player or Enemy not sets");
        }
        for(int i = 0; i < arrPlayer.size(); i++){
            for(int j = 0; j < arrEnemy.size(); j++){
                if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                    System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) + " not in the same Y position");
                }
                if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), 
                    arrEnemy.get(j).getX(), arrEnemy.get(j).getY()) < 2){
                    System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                    removeEnemy(arrEnemy.get(j));
                }
                else{
                    System.out.println("==> Player "+arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("current x position =  " + arrPlayer.get(i).getX() +" <==");
                }
            }
        }
    }

    public static double EuclideanDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    
}



 