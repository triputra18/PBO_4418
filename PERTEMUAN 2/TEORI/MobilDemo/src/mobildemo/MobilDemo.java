/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo;

/**
 *
 * @author Acer
 */
class Mobil {
    String warna;
    int tahunProduksi;
    
}
public class MobilDemo{    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Object
        Mobil mobilku = new Mobil();
        
        //Call the atribute and value
        mobilku.warna = "Putih";
        mobilku.tahunProduksi = 2012;
        
        
        System.out.println("Warna:" + mobilku.warna);
        System.out.println("Tahun:" + mobilku.tahunProduksi);
    }
    
}
