package pe.egcc.genioapp.prueba;

import pe.egcc.genioapp.service.GenioService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    for(int i = 0; i <= 10; i++){
      System.out.println("Factorial de " + i + " es " + 
              GenioService.factorial(i));
    }
  }
  
}
