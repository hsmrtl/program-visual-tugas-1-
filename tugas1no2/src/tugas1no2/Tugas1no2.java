/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1no2;

/**
 *
 * @author hnasm
 */
import java.util.Scanner;

public class Tugas1no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama;
        int usia;
        double tinggi_badan;
        System.out.print("nama: ");
        nama = input.nextLine();
                
        System.out.print("usia: ");
        usia = input.nextInt();
        
        System.out.print("tinggi badan: ");
        tinggi_badan = input.nextDouble();
        
        System.out.println();
        
        System.out.println("Data");
        System.out.println("Nama;"+nama);
        System.out.println("usia:"+usia);
        System.out.println("tinggi badan:"+tinggi_badan);
        
    }
    
}
