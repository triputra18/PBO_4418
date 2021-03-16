/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusiajava;

/**
 *
 * @author Acer
 */

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    TV(){
    }  
    
        public void turnOn(){
        on = true;
        }
        
        public void turnOff(){
            on = false;
        }
        
        public void setChannel (int newChannel){
            
                channel = newChannel;
        }
        
        public void setVolume (int newVolumeLevel){
            
                volumeLevel = newVolumeLevel;
        }
        
        public void channelUp(){
            
                channel++;
        }
        
        public void channelDown(){
            
                channel--;
        }
        
        public void volumeUp(){
            
                volumeLevel++;
        }
        
        public void volumeDown(){
            
                volumeLevel--;
        }
        
        
    
}

