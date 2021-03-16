/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle.java;

/**
 *
 * @author Tri
 */
class Bicycle {
    int speed = 0;
    int gear = 0;
    
     void changeGear(int newValue){
        gear = gear + newValue;
        System.out.println("\nGear" + gear);
    }
     
     void speedUp(int increment){
        speed = speed + increment;
        System.out.println("\nSpeed" + speed);
    }
     
}

public class BicycleJava {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle bike = new Bicycle();
        
        //memanggil atribut dan memberi nilai
        bike.speed =10;
        bike.gear =2;
        
        //memanggil method dan menunjuk nilai parameter
        bike.speedUp(10);
        bike.changeGear(2);
       
    }
    
}
