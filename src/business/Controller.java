/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author 13104405
 */
public class Controller {
    
    public boolean validaFormulario(boolean completo,
                                    String  nome    , String cpf,
                                    String  idade   , String dependentes,
                                    String  contri  , String tot_rend){
        if(completo){
            //VALIDA NOME E CPF . . .
            if(nome.length()<1 || cpf.length()<11){return false;}
            
            //VALIDA IDADE E DEPENDENTE. . .
            if(idade.length()<1 || dependentes.length()<1){return false;}
            if(valida_numero(idade, true) && valida_numero(dependentes, true)){
                int age = Integer.parseInt(idade);
                if(age<18){return false;}
            }else{return false;}
            
            //CONTRIBUICAO E TOTAL DE RENDA . . .
            if(contri.length()<1 || tot_rend.length()<1){return false;}
            
        }else{
            
        }
        
        return true;
    }
    
    
    
    private boolean valida_numero(String numero, boolean isInt){
        for(int x =0; x<numero.length();x++){
            switch(numero.charAt(x)){
                case '0':   case '1': 
                case '2':   case '3': 
                case '4':   case '5': 
                case '6':   case '7': 
                case '8':   case '9': 
                default : 
                    if(isInt){return false;}
                    if(numero.charAt(x)!='.' || numero.charAt(x)!=','){return false;}
            }
        }
        return true;
    }
    
}