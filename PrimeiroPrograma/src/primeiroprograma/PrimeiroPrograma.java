package primeiroprograma;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeiroPrograma {

//    InputStreamReader isr=new InputStreamReader(System.in);
//    BufferedReader br=new BufferedReader(isr);            
    
    public static void main(String[] args) {
     
        Scanner ler=new Scanner(System.in);   
      
        float v1,v2;
  
        DADOS();
    
        System.out.println(" Informe a nota 1");
        v1=ler.nextFloat();
        
        System.out.println(" Informe a nota 2");
        v2=ler.nextFloat();
        
        System.out.println(" Informe a nota 3");
        float v3=ler.nextFloat();
   
   System.out.println("a tua media é "+ Media( v1, v2, v3));
  }
  
    public static void DADOS(){
        System.out.println(" Adilson Futa  ");
        System.out.println(" viana km 14 A ");
        System.out.println(" ITEL  ");
        System.out.println(" ARROZ DOCE ");
    
    }
    
    public static float Media(float n1, float n2, float n3){
        return (n1+n2+n3)/3;
    }
    
    
    
}
