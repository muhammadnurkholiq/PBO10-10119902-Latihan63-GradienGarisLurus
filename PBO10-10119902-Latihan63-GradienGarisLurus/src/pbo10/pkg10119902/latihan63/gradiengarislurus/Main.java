/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan63.gradiengarislurus;

/**
 *
 * @author 
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF10K
 * NIM  `   : 10119902
 * Deskripsi Program    : Program Ini Untuk Menampilkan Program Gradien Garis Lurus
 * 
 */ 
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kordinat k1 = new Kordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik (" + k1.getX1() + "," + k1.getY1() + ") dan (" + k1.getX2() + "," + k1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + k1.hitungGradien());
        
        System.out.println();
        
        Kordinat k2 = new Kordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (" + k2.getX1() + "," + k2.getY1() + ") dan (" + k2.getX2() + "," + k2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + k2.hitungGradien());
    }
    
}
