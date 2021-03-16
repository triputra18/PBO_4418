/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvsmile;

/**
 *
 * @author TRI
 */
public class TVSmile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TV tv1 = new TV();
      tv1.turnOn();
      tv1.setChannel(16);
      tv1.setVolume(6);
      
      TV tv2 = new TV();
      tv2.turnOn();
      tv2.channelUp();
      tv2.channelUp();
      tv2.volumeUp();
      
      System.out.println("TV1 Channel " + tv1.channel + " Volume " + tv1.volumeLevel); 
      System.out.println("TV2 Channel " + tv2.channel + " Volume " + tv2.volumeLevel);
    }
    
    
}
