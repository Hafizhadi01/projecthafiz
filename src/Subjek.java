/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
public class Subjek {
    public static void main(String[] args) {
    
       int KIM,BIO,ADDM,PHI;
        double jumlah,purata,peratus;
       
       KIM = 80;
       BIO = 79;
       ADDM = 78;
       PHI = 77;
   
         jumlah=KIM+BIO+ADDM+PHI;
         purata=jumlah/4;
         peratus=jumlah*100/400;
   
  System.out.println("Hasil jumlah:"+KIM+'+' +BIO+'+' +ADDM+ '+' +PHI+ '='+jumlah);
  System.out.println("Hasil purata:" +purata);
  System.out.println("Hasil peratus:" +peratus);
  
   
}
}
