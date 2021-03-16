/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusiajava;

/**
 *
 * @author A
 */

public class ManusiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia org1 = new Manusia("Tri Putra Laksana");
        System.out.println(org1.getnamaSaya());
        TV tvku = new TV();
        org1.beliTV(tvku);
        org1.beliTV(tvku);
        org1.beliTV(tvku);
        System.out.println(org1.cekTV());
        System.out.println("Ada beberapa TV:" + org1.getJumlahTV());
        org1.jualSemuaTV();
        System.out.println(org1.cekTV());
        System.out.println("Ada beberapa TV:" +org1.getJumlahTV());
                
    }
    
}

