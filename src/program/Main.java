/*
 * Copyrigth (c) 2018, All right reserved
 * Written by tauf21, email : taufik.amary@gmail.com
 * Github : tauf21
 */
package program;

/**
 *
 * @author root
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //membuat objek pada masing-masing subclass
        Persegi nPersegi = new Persegi();
        PersegiPanjang nPersegiPanjang = new PersegiPanjang();
        Lingkaran nLingkaran = new Lingkaran();
        SegiTiga nSegitiga = new SegiTiga();
        
        //mmebuat objek untuk inputan
        Scanner input = new Scanner(System.in);
        
        //id mahasiswa
        System.out.println("==============================");
        System.out.println("Nim \t: 5170411279");
        System.out.println("Nama \t: Taufik Amaryansyah\n");
        System.out.println("==============================\n\n");
        
        //hasil dari pewarisan BangunDatar dan subclass nya
        System.out.println("===========Persegi============");
        nPersegi.luas();
        nPersegi.keliling();
                 
        System.out.println("\n========Persegi Panjang=======");
        nPersegiPanjang.luas();
        nPersegiPanjang.keliling();
        
        System.out.println("\n==========Lingkaran===========");
        nLingkaran.luas();
        nLingkaran.keliling();
        
        System.out.println("\n==========Segi Tiga===========");
        nSegitiga.luas();
        nSegitiga.keliling();
                 
          
                
        
    }
    
}
