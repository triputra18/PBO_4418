/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraan;

/**
 *
 * @author Acer
 */
public class vehicle {
    double speed = 0;
    String color = "silver";

    public vehicle(){
    }
    
    public void goStraight(){
         System.out.println("Maju");
    
    }
    public void turnLeft(){
         System.out.println("Belok Kiri");
    
    }
    public void turnRight(){
         System.out.println("Belok Kanan");
    
    }
}
