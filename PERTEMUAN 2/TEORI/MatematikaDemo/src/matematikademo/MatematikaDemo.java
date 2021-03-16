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
public class MatematikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        mtk.tambah(20 , 20);
        System.out.println("Hasil penjumlahan" + mtk.getTotal());
        mtk.kurang(10 , 5);
        System.out.println("Hasil pengurangan" + mtk.getTotal());
        mtk.bagi(10 , 2);
        System.out.println("Hasil pembagian" + mtk.getTotal());
        mtk.kali(10 , 20);
        System.out.println("Hasil perkalian" + mtk.getTotal());
        
        
    }
    
}



