package com.javaprogram;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
            try {
                System.out.print("Masukan angka 1 = ");
                int angka1= sc.nextInt();
                System.out.print("Masukan angka 2 = ");
                int angka2= sc.nextInt();
                int jumlah=calc.add(angka1, angka2);
                int kurang=calc.substract(angka1, angka2);
                int kali=calc.multiply(angka1, angka2);
                double bagi =calc.divide(angka1, angka2);
    
                System.out.println(angka1 + "+" + angka2 + "= " +jumlah);
                System.out.println(angka1 + "-" + angka2 + "= "  +kurang);
                System.out.println(angka1 + "x" + angka2 + "= " +kali);
                System.out.println(angka1 + ":" + angka2 + "= " +bagi);
                
    
            } catch (InputMismatchException e) {
                System.err.println("Error! input bukan angka");
            }
            
            
    
        System.out.println("End of program");

	}

}
