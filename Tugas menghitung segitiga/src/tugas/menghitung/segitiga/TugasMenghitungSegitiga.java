/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.menghitung.segitiga;

/**
 *
 * @author hnasm
 */
import java.util.Scanner;
import java.util.Locale;
public class TugasMenghitungSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
      
    System.out.println("luas segitiga");
    System.out.println();
     
    double a,t, luas;
 
    System.out.print("Masukkan angka: ");
    a = input.nextDouble();
      
    System.out.print("Masukkan angka: ");
    t = input.nextDouble();
  
    luas = 0.5 * a * t;
      
    System.out.println("Luas segitiga: "+luas);
    }
    
}
