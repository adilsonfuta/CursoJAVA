
package terceiroprograma;

import java.util.Scanner;


public class TerceiroPrograma {
    
  static Scanner input=new Scanner(System.in);
    
  
  public void maior(){
  
      
        String nome;
        System.out.println(" Diga o seu nome ");
        nome=input.next();
      
        System.out.println(" Digite os valores ");
        int val1=input.nextInt();
        int val2=input.nextInt();
        
        
        if(val1!=val2){
            
        if(val1>val2 )
            System.out.println(" O "+ val1 +" É O MAIOR DE TODOS  ");
        else        
            System.out.println( val2+" é o maior ");
               
        }
  }
  
  public void maiorde4(){
  
          
        int n1,n2,n3,n4;
        
        System.out.println("  Diga os valores ");
        n1=input.nextInt();
        n2=input.nextInt();
        n3=input.nextInt();
        n4=input.nextInt();
        
        if(n1!=n2 && n2!=n3 && n3!=n4){
            if(n1>n2 && n1>n3 && n1>n4 )
                System.out.println("n1 é o maior ");
             if(n2>n1 && n2>n3 && n2>n4 )
                System.out.println("n2 é o maior ");
              if(n3>n1 && n3>n2 && n3>n4 )
                System.out.println("n3 é o maior ");
               if(n4>n1 && n4>n2 && n4>n3 )
                System.out.println("n4 é o maior ");        
        }}
  
    public static void main(String[] args) {
 
        String letra=null;
        
        System.out.println("  Diga a letra ");
        letra=input.next();
        
        switch(letra){
            case  "a":
                     System.out.println(" é vogal");
            break;
            case "e" :
                 System.out.println(" é vogal");
            break;
            case "i" : 
                System.out.println(" é vogal");
            break;
            case "o" : 
                System.out.println(" é vogal");
            break;
            case "u" :
                System.out.println(" é vogal");
            break;
            default:
                System.out.println(" é uma consoante ");
            
        }
        
        
                
    }
    
}
