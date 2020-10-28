/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119003.latihan22.perhitunganlingkaran;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung lingkaran dari input user
 */
public class PerhitunganLingkaran {
    static Scanner scan = new Scanner(System.in);
    static final double pi = Math.PI;    
    double diameter;    
    /**
     * @param args the command line arguments
     */    
    private void validasi(String diameter){
       if(!diameter.matches("^[0-9]*$")){
            System.out.println("Nilai Diameter Tidak Sesuai");
            masukkanDiameterLingkaran();       
       }else{
           this.diameter = Double.parseDouble(diameter);
       }                 
    }   
    
    private void masukkanDiameterLingkaran(){
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        validasi(scan.next());                          
    }
        
    private double hitungLuasLingkaran(){                
        return pi * Math.pow(diameter, 2);
    }
    
    private double hitungJariJariLingkaran(double luas){        
        return Math.sqrt(luas / pi);
    }
    
    private double kelilingLingkaran(double jariJari){
        return 2 * pi * jariJari;
    }
    
    private static void tampilHasil(double luas, double jariJari, double keliling){   
        System.out.println("\n====Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = "+jariJari+" cm");
        System.out.println("Luas Lingkaran = "+luas+" cm");
        System.out.println("Keliling Lingkaran = "+keliling+" cm");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        PerhitunganLingkaran data = new PerhitunganLingkaran();
        data.masukkanDiameterLingkaran();            
        double luas = data.hitungLuasLingkaran();
        double jariJari = data.hitungJariJariLingkaran(luas);
        double keliling = data.kelilingLingkaran(jariJari);
        tampilHasil(luas,jariJari,keliling);
        System.out.println("Developed by : Ivan Faathirza");
    }
    
}
