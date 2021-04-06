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
public class UjiKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicycle shiva = new Bicycle();
        MotorVehicle ninja = new MotorVehicle();
        
        System.out.println(shiva.speed);
        System.out.println(shiva.color);
        shiva.turnRight();
        shiva.ringBell();
        
         System.out.println(ninja.speed);
         System.out.println(ninja.color);
         System.out.println(ninja.licencePlate);
         System.out.println(ninja.sizeofEngine);
         
         ninja.turnLeft();
         System.out.println(ninja.getLicencePlate());
         System.out.println(ninja.getSizeofEngine());
            
   }
    
}
