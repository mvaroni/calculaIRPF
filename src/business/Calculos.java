/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author 14202122
 */
public class Calculos {
    
    public static double calculaIRPF(boolean completo, Contribuinte contr){
        System.out.println(" - - - C O N T A - - -");
        BigDecimal cpoficial = new BigDecimal(contr.getContr_prev_oficial(), MathContext.UNLIMITED);
        BigDecimal trendtos = new BigDecimal(contr.getTotal_rendimentos(), MathContext.UNLIMITED);
        
        System.out.println( "CONTRIBUICAO OFICIAL = " + cpoficial.toString() +
                            "TOTAL DE RENDIMENTOS = " + trendtos.toString());
        trendtos = trendtos.subtract(cpoficial);
        
        System.out.println("PÓS SUBTRAÇÃO = " + trendtos.toString());
        
        double desc_unico = 0.95;
        if(completo){
            // Se o contribuinte tiver menos de 65 anos
            if(contr.getIdade() < 65){
                if(contr.getNro_dependentes() < 3){
                    desc_unico = 0.98;
                }else if(contr.getNro_dependentes() < 6){
                    desc_unico = 0.965;
                }
            // Se o contribuinte tiver 65 anos ou mais
            }else{
                if(contr.getNro_dependentes() < 3){
                    desc_unico = 0.97;
                }else if(contr.getNro_dependentes() < 6){
                    desc_unico = 0.955;
                }else{
                    desc_unico = 0.94;
                }
            }
        }
        
         trendtos = trendtos.multiply(new BigDecimal(desc_unico, MathContext.UNLIMITED));
        
        if(trendtos.doubleValue() <= 12000) return 0;
        if(trendtos.doubleValue() < 24000){
            trendtos = trendtos.subtract(new BigDecimal(12000, MathContext.UNLIMITED));
            return arredondar(trendtos.multiply(new BigDecimal(0.15, MathContext.UNLIMITED)).doubleValue());
        }
        
        trendtos = trendtos.subtract(new BigDecimal(24000, MathContext.UNLIMITED));
        trendtos = trendtos.multiply(new BigDecimal(1.275,MathContext.UNLIMITED));
        return arredondar(trendtos.add(new BigDecimal(1800, MathContext.UNLIMITED)).doubleValue());
    }
    
    private static double arredondar(double valor) {
        double arredondado = valor;
        arredondado *= (Math.pow(10, 2));
        arredondado = Math.ceil(arredondado);           
        arredondado /= (Math.pow(10, 2));
        return arredondado;
    }
}
