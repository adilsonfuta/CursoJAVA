
package segundoprograma;

import PacoteNOVO.*;


public class SegundoPrograma {

            TESTE a=new TESTE();
 

    public static void main(String[] args) {
        
        OutraClasse oc=new OutraClasse();
        
        TESTE ts=new TESTE();
       
              
        ts.teste_pacote();
        
        System.out.println(" "+oc.antes(12));
        System.out.println(" "+oc.depois(12));
        
        
        System.out.println( OutraClasse.sms() );
        System.out.println( oc.sms() );
        
        
    }
    
}
