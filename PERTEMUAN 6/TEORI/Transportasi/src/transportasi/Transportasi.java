/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasi;

/**
 *
 * @author Acer
 */
import Transportasi.metter;
import Transportasi.shiva;

public class TransportasiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil metter = new Mobil();
        metter.goStraight();
        metter.turnLeft();
        metter.turnLeft();
        System.out.println();
        
        Bicycle shiva = new Bicycle ();
        shiva.ringBell();
        shiva.turnLeft();
        shiva.turnLeft();
        
        System.out.println();
        
    }
    
}
