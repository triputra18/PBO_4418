/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readconsole;
import java.io.*;
/**
 *
 * @author TRI
 */
public class ReadConsole {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args []) throws IOException {
        try(InputStreamReader cin = new InputStreamReader(System.in)) {
            System.out.println("Enter any characters,except 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }
    }
    
}
