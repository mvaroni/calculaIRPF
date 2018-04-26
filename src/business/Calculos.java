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
        BigDecimal cpoficial = new BigDecimal(contr.getContr_prev_oficial(), MathContext.UNLIMITED);
        BigDecimal trendtos = new BigDecimal(contr.getTotal_rendimentos(), MathContext.UNLIMITED);
        
        trendtos.subtract(cpoficial);
        
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
        
        trendtos.multiply(new BigDecimal(desc_unico, MathContext.UNLIMITED));
        
        if(trendtos.doubleValue() <= 12000) return 0;
        if(trendtos.doubleValue() < 24000){
            trendtos.subtract(new BigDecimal(12000, MathContext.UNLIMITED));
            return trendtos.multiply(new BigDecimal(0.15, MathContext.UNLIMITED)).doubleValue();
        }
        
        trendtos.subtract(new BigDecimal(24000, MathContext.UNLIMITED));
        trendtos.multiply(new BigDecimal(1.275,MathContext.UNLIMITED));
        return trendtos.add(new BigDecimal(1800, MathContext.UNLIMITED)).doubleValue();
    }
}
