/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_stack_queue;

/**
 *
 * @author Acer
 * array [5] = 0 1 2 3 4 
 */ 
class ArrayList extends Angka_Data{
    
     public void append(int data){
        for (int x = 0; x < Angka_Data.length; x++){
            if (Angka_Data[x] == 0){
                Angka_Data[x] = data;
                break;
            }
        }
    }
    
    public void append(int index, int data){
        Angka_Data[index] = data;
    }
    
    public void pop(){
        for (int x = Angka_Data.length-1; x > 0; x--){
            if (Angka_Data[x] != 0){
                Angka_Data[x] = 0;
                break;
            }
        }
    }
    
    public void pop(int index){
        Angka_Data[index] = 0;
    }
    
    public void UbahData(int index, int data){
        Angka_Data[index] = data;
    }
    
    public void ShowData(){
        for (int x = 0; x < Angka_Data.length; x++){
            System.out.println(Angka_Data[x]);
    }
    }
    
    
    
}
