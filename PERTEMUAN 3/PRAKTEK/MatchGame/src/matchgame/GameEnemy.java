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
public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    public GameEnemy(){
    }
    public GameEnemy(double width, double height){
    }
    public GameEnemy(double width, double height, int positionX, int positionY){
    }
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public int getX(){
        return this.positionX;
    }
    public int getY(){
        return this.positionY;
    }
    
    //method
    public void Run(){
        System.out.println("Enemy is running");
    }
    
}
