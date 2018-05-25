/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import business.Calculos;
import business.Contribuinte;
import business.Controller;
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
    
    //CALCULOS . . .
    
    @Test
    public void calc_IRPF_Normal(){
        String response, test;
        test     = "0.0, 1066.5, 1022.63, 1037.25, 993.38, 31472.44";
        
        //RESULTADO <= 12.000
        Contribuinte contribuinte = new Contribuinte("Icaro", "08755548909", 60, 5, 500, 3_000);
        response = "" + Calculos.calculaIRPF(true, contribuinte);
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
        response = response + ", " + Calculos.calculaIRPF(true, contribuinte6);
        
        //double x = ((((20_000 - 500)*0.98) - 12_000) * 0.15);
         
        assertEquals(test, response);
    }
    
    @Test
    public void calc_IRPF_Simplificado(){
        String response, test;
        test = "[0.0, 978.75, 31156.88]";
        
        //RESULTADO <= 12.000
        Contribuinte contribuinte = new Contribuinte("Selenia", "08204637157", 100, 4_000);
        response = "[" + Calculos.calculaIRPF(false, contribuinte);
        
        //RESULTADO < 24.000
        Contribuinte contribuinte2 = new Contribuinte("Selenia", "08204637157", 500, 20_000);
        response = response + ", " + Calculos.calculaIRPF(false, contribuinte2);
        
        //RESULTADO >= 24.000
        Contribuinte contribuinte3 = new Contribuinte("Selenia", "08204637157", 500, 50_000);
        response = response + ", " + Calculos.calculaIRPF(false, contribuinte3) + "]";
        
        assertEquals(test, response);
    }
    
    //FORMULARIO . . .
    @Test
    public void valida_formulario_completo(){
         //(boolean completo,
         //                           String  nome    , String cpf,
         //                           String  idade   , String dependentes,
         //                           String  contri  , String tot_rend)
         
        Controller controller = new Controller();
        
        //COM TODOS OS DADOS . . . (TRUE)
        boolean b1_t = controller.validaFormulario(true   ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "4",
                                                   "3500" , "5000");
        
        //SEM NOME  . . . (FALSE)
        boolean b2_f = controller.validaFormulario(true   ,
                                                   ""     , "88713400004",
                                                   "45"   , "4",
                                                   "3500" , "5000");
        //SEM CPF   . . . (FALSE)
        boolean b3_f = controller.validaFormulario(true   ,
                                                   "Pedro", "",
                                                   "45"   , "4",
                                                   "3500" , "5000");
        //CPF ERRADO . . . (FALSE)
        boolean b4_f = controller.validaFormulario(true   ,
                                                   "Pedro", "8874",
                                                   "45"   , "4",
                                                   "3500" , "5000");
        //SEM IDADE . . . (FALSE)
        boolean b5_f = controller.validaFormulario(true   ,
                                                   "Pedro", "88713400004",
                                                   ""     , "4",
                                                   "3500" , "5000");
        //IDADE = 0 . . . (FALSE)
        boolean b6_f = controller.validaFormulario(true   ,
                                                   "Pedro", "88713400004",
                                                   "0"    , "4",
                                                   "3500" , "5000");
        //SEM DEPENDENTES . . . (FALSE)
        boolean b7_f = controller.validaFormulario(true   ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "",
                                                   "3500" , "5000");
        //RENDIMENTO MENOR QUE CONTRIBUICAO . . . (FALSE)
        boolean b8_f = controller.validaFormulario(true   ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "4",
                                                   "5000" , "1000");
        //SEM RENDIMENTO . . . (FALSE)
        boolean b9_f = controller.validaFormulario(true   ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "4",
                                                   "5000" , "");
        //SEM CONTRIBUICAO . . . (FALSE)
        boolean b10_f = controller.validaFormulario(true   ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "4",
                                                   "" , "5000");
        
        boolean resposta = b1_t && !b2_f && !b3_f && !b4_f && !b5_f && 
                          !b6_f && !b7_f && !b8_f && !b9_f && !b10_f;
        assertEquals(true, resposta);
    }
    
    @Test
    public void valida_formulario_simplificado(){
         //(boolean completo,
         //                           String  nome    , String cpf,
         //                           String  idade   , String dependentes,
         //                           String  contri  , String tot_rend)
         
        Controller controller = new Controller();
        
        //COM TODOS OS DADOS . . . (TRUE)
        boolean b1_t = controller.validaFormulario(false  ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "4",
                                                   "3500" , "5000");
        
        //SEM NOME  . . . (TRUE)
        boolean b2_t = controller.validaFormulario(false  ,
                                                   ""     , "88713400004",
                                                   "45"   , "4",
                                                   "3500" , "5000");
        //SEM CPF   . . . (TRUE)
        boolean b3_t = controller.validaFormulario(false  ,
                                                   "Pedro", "",
                                                   "45"   , "4",
                                                   "3500" , "5000");
        //CPF ERRADO . . . (TRUE)
        boolean b4_t = controller.validaFormulario(false  ,
                                                   "Pedro", "8874",
                                                   "45"   , "4",
                                                   "3500" , "5000");
        //SEM IDADE . . . (TRUE)
        boolean b5_t = controller.validaFormulario(false  ,
                                                   "Pedro", "88713400004",
                                                   ""     , "4",
                                                   "3500" , "5000");
        //IDADE = 0 . . . (TRUE)
        boolean b6_t = controller.validaFormulario(false  ,
                                                   "Pedro", "88713400004",
                                                   "0"    , "4",
                                                   "3500" , "5000");
        //SEM DEPENDENTES . . . (TRUE)
        boolean b7_t = controller.validaFormulario(false  ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "",
                                                   "3500" , "5000");
        //RENDIMENTO MENOR QUE CONTRIBUICAO . . . (FALSE)
        boolean b8_f = controller.validaFormulario(false  ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "4",
                                                   "5000" , "1000");
        //SEM RENDIMENTO . . . (FALSE)
        boolean b9_f = controller.validaFormulario(false  ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "4",
                                                   "5000" , "");
        //SEM CONTRIBUICAO . . . (FALSE)
        boolean b10_f = controller.validaFormulario(false ,
                                                   "Pedro", "88713400004",
                                                   "45"   , "4",
                                                   ""     , "5000");
        
        boolean resposta = b1_t && b2_t &&  b3_t &&  b4_t &&  b5_t  && 
                           b6_t && b7_t && !b8_f && !b9_f && !b10_f;
        assertEquals(true, resposta);
    }
    
    @Test
    public void mensagem_resultado_calculo_IRPF_sucesso(){
        Controller controller = new Controller();
        String resposta = controller.calculaIRPF(true, "Icaro", "08755548909", "60", "2", "500", "20000");
        assertEquals("Valor IRPF Completo\nR$" + "1066.5", resposta);
    }
    @Test
    public void mensagem_resultado_calculo_IRPF_erro(){
        Controller controller = new Controller();
        String resposta = controller.calculaIRPF(true, "", "", "", "", "500", "20000");
        assertEquals("Erro! Verifique as informações preenchidas.", resposta);
    }
}
