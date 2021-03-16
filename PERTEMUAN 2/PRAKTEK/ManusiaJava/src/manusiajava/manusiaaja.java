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
class Manusia {
    private String  Name = "Name";
    private boolean Havetv = false;
    private int Numbertv = 0;
    public String Mytv;
    
    Manusia(){
    }
        Manusia(String nama){
            this.Name = nama;
        }
        public String getnamaSaya(){
            return Name;   
        }
        public TV beliTV(TV tiviku){
            this.Havetv = true;
            this.Numbertv = Numbertv+ 1;
            return tiviku;
        }
        public void jualSemuaTV(){
            this.Havetv = false;
            this.Numbertv= 0;
        }
        public boolean cekTV(){
            return this.Havetv;
        }
        public int getJumlahTV(){
            return this.Numbertv;
        }
        
    
}

    

