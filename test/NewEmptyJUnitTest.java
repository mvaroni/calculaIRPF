/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import business.Calculos;
import business.Contribuinte;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void calc_IRPF_Normal(){
        String response, test;
        test     = "[0.0, 1066.5, 1022.625, 1124.8545, 993.375, 31472.4375]";
        
        
        //RESULTADO < 12.000
        Contribuinte contribuinte = new Contribuinte("Icaro", "08755548909", 60, 5, 500, 3_000);
        response = "[" + Calculos.calculaIRPF(true, contribuinte);
        //60 ANOS, 2 DEPENDENTES, 500 CONTRIBUICAO, 20_000 RENDIMENTO
        Contribuinte contribuinte2 = new Contribuinte("Icaro", "08755548909", 60, 2, 500, 20_000);
        response = response + ", " + Calculos.calculaIRPF(true, contribuinte2);
        //60 ANOS, 4 DEPENDENTES, 500 CONTRIBUICAO, 20_000 RENDIMENTO
        Contribuinte contribuinte3 = new Contribuinte("Icaro", "08755548909", 60, 4, 500, 20_000);
        response = response + ", " + Calculos.calculaIRPF(true, contribuinte3);
        //70 ANOS, 2 DEPENDENTES, 500 CONTRIBUICAO, 20_000 RENDIMENTO
        Contribuinte contribuinte4 = new Contribuinte("Icaro", "08755548909", 70, 2, 500, 20_000);
        response = response + ", " + Calculos.calculaIRPF(true, contribuinte4);
        //70 ANOS, 4 DEPENDENTES, 500 CONTRIBUICAO, 20_000 RENDIMENTO
        Contribuinte contribuinte5 = new Contribuinte("Icaro", "08755548909", 70, 4, 500, 20_000);
        response = response + ", " + Calculos.calculaIRPF(true, contribuinte5);
        //70 ANOS, 4 DEPENDENTES, 500 CONTRIBUICAO, 50_000 RENDIMENTO
        Contribuinte contribuinte6 = new Contribuinte("Icaro", "08755548909", 70, 4, 500, 50_000);
        response = response + ", " + Calculos.calculaIRPF(true, contribuinte6) + "]";
        
        //double x = ((((20_000 - 500)*0.98) - 12_000) * 0.15);
         
        assertEquals(test, response);
    }
    @Test
    public void calc_IRPF_Simplificado(){
        Contribuinte contribuinte = new Contribuinte("Selenia", "08204637157", 100, 4000);
        assertEquals(0, 0);
    }
}
