/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo2;

/**
 *
 * @author Acer
 */
class Mobil2 {
    
    String warna;
    int tahunProduksi;
    String merk;
    boolean on = false;
    int gigi = 0;
    
    
    public Mobil2(){
    }
        public void nyalakanMobil(){
            on = true;
        }
        public void matikanMobil(){
            on = false;
        }
        public void setGigi(int newGigi){
            gigi = newGigi;
        }
        public void naikGigi(){
            gigi++;
        }
        public void turunGigi(){
            gigi--;
        }
        public void setMerk(String newMerk){
            merk = newMerk;
        }
    
}
public class MobilDemo2{    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Object
        Mobil2 mobilku = new Mobil2();
        
        //Call the atribute and value
        mobilku.warna = "Putih";
        mobilku.tahunProduksi = 2012;
        mobilku.nyalakanMobil();
        mobilku.naikGigi();
        mobilku.naikGigi();
        mobilku.naikGigi();
        mobilku.turunGigi();
        mobilku.merk = "BMW";
        
        
        System.out.println("Warna:" + mobilku.warna);
        System.out.println("Tahun:" + mobilku.tahunProduksi);
        System.out.println("Nama Merk:" + mobilku.merk);
        System.out.println("Status Mobil Nyala/Mati:" + mobilku.on);
        System.out.println("Gigi Level:" + mobilku.gigi);
       
    }
    
}