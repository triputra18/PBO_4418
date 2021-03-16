/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku1;

/**
 *
 * @author Tri
 */

class Bukuku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
}
    

    
public class Buku1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bukuku buku = new Bukuku();
        
        // atribut
        buku.judul = "kancil yang bijak";
        buku.pengarang ="Tri Putra Laksana";
        buku.penerbit = "Elex";
        buku.tahun = 2007;
        
        System.out.println("judul:" + buku.judul);
        System.out.println("pengarang:" + buku.pengarang);
        System.out.println("penerbit:" + buku.penerbit);
        System.out.println("tahun:" + buku.tahun);
        
        buku.judul = "istri yang malang";
        buku.pengarang ="lala";
        buku.penerbit = "Abdul";
        buku.tahun = 2001;
        
        System.out.println("judul:" + buku.judul);
        System.out.println("pengarang:" + buku.pengarang);
        System.out.println("penerbit:" + buku.penerbit);
        System.out.println("tahun:" + buku.tahun);
    }
    
}
