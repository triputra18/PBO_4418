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
public class Array_Stack_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("[Array List]");
        ArrayList star_array = new ArrayList();
        star_array.append(41);
        star_array.append(52);
        star_array.append(63);
        star_array.append(74);
        star_array.ShowData();
        System.out.println("-");
        star_array.append(85);
        star_array.ShowData();
        System.out.println("-");
        star_array.pop();
        star_array.ShowData();
        System.out.println("-");
        star_array.UbahData(2,0);
        star_array.ShowData();
        System.out.println("\n");
        
        System.out.println("[Stack]");
        Stack star_stack = new Stack();
        star_stack.append(41);
        star_stack.append(52);
        star_stack.append(63);
        star_stack.append(74);
        star_stack.append(85);
        star_stack.ShowData();
        System.out.println("-");
        star_stack.append(96);
        star_stack.ShowData();
        System.out.println("-");
        star_stack.pop();
        star_stack.ShowData();
        System.out.println("-");
        star_stack.UbahData(1,1);
        star_stack.ShowData();
        System.out.println("\n");
        
        System.out.println("[Queue]");
        Queue star_queue = new  Queue();
        star_queue.append(41);
        star_queue.append(52);
        star_queue.append(63);
        star_queue.append(74);
        star_queue.append(85);
        star_queue.ShowData();
        System.out.println("-");
        
        star_queue.pop();
        star_queue.ShowData();
        System.out.println("-");
        star_queue.UbahData(3,1);
        star_queue.ShowData();
     
    }
    
}
