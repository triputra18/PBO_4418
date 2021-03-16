/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikademo;

/**
 *
 * @author TRI
 */
public class Matematika {
     private float total =0;
     Matematika(){
        
    }
    public float tambah(float angka1 ,float angka2){
        total = angka1 + angka2;
        return total;
    }
     public float kurang(float angka1 ,float angka2){
        total = angka1 - angka2;
        return total;
    }
     public float bagi(float angka1 ,float angka2){
        total = angka1 / angka2;
        return total;
    }
      public float kali(float angka1 ,float angka2){
        total = angka1 * angka2;
        return total;
    }
      public float getTotal(){
          return total;
      }
     

    
}



