
import java.io.InputStream;
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
public class IsipaduSfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Aturcara Mencari Isipadu Sebuah Sfera");
        
        System.out.print("Jejaari Sfera Adalah:");
        double jejari=input.nextDouble();
        
        double isipadu;
        if (jejari >= 0) {
            isipadu = 4/3*3.142*jejari*jejari*jejari;
            String Isipadu = null;
            System.out.println ("Isipadu bagi sfera yang mempunyai jejari " +jejari + "adalah" + Isipadu);
        }
    }
}

 
