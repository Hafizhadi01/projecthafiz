
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
public class Soalan1 {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);



System.out.print("Masukkan Markah Anda:");
double markah = input.nextInt();

if(markah>45){
    
    System.out.println("Anda telah mencapai tahap lulus");
    
}else {
    System.out.println("Maaf anda gagal !! sila cuba lagi!!3");
}
}
   
}

