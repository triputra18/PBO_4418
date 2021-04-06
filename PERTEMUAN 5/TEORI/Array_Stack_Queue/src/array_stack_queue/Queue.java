/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_stack_queue;

/**
 *
 * @author Acer
 */
class Queue extends Angka_Data{
    
    public void append(int data){
        try{
            for (int x = 0; x < Angka_Data.length+1; x++){
                if (Angka_Data[x] == 0){
                    Angka_Data[x] = data;
                    break;
                }
                
                if (x == Angka_Data.length+1){
                    throw new Exception("");
                }
            }
        } catch(Exception e){
            int len = Angka_Data.length;
            int[] temp_node = new int[len+1];
            for (int x = 0; x < len; x++){
                temp_node[x] = Angka_Data[x];
            }
            temp_node[len] = data;
            Angka_Data = temp_node.clone();
        }
    }
    
    public void pop(){
        int len = Angka_Data.length;
        int[] temp_node = new int[len-1];
        for (int i = 0; i < temp_node.length; i++){
            temp_node[i] = Angka_Data[i+1];
        }
        Angka_Data = temp_node.clone();
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
