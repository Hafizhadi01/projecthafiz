
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
public class Contoh1 {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int merdeka =1957;

System.out.print("Masukkan tahun anda dilahirkan:");
int tahun = input.nextInt();

if(tahun>merdeka){
    
    System.out.println("Anda dilahirkan selepas merdeka");
    
}else {
    System.out.println("Anda dilahirkan sebelum merdeka");
}
}
   
}
