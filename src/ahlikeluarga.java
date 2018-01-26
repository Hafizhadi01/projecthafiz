/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
import java.util.Scanner;
public class ahlikeluarga {
    public static void main (String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Masukkan nama");
        String nama= input.nextLine();
       
        if (nama.equals("ayah")){
            System.out.println("umur ayah ialah 60 tahun");
            
        } 
      else  if (nama.equals("emak")){
            System.out.println("umur emak ialah 54 tahun");
    }
       else  if (nama.equals ("kakak")){
            System.out.println("umur kakak ialah 26 tahun");
    }
        else  if (nama.equals ("abang")){
            System.out.println("umur abang ialah 24 tahun");
    }
      else  if (nama.equals ("adik")){
            System.out.println("umur adik ialah 19 tahun");
    }
        else{
          System.out.println("bukan ahli keluarga");
      }
        
    
    }
}
