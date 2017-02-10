package pe.egcc.genioapp.controller;

import pe.egcc.genioapp.service.GenioService;

/**
 *
 * @author Gustavo Coronel
 */
public class GenioController {

  public long factorial(int n) {
    return GenioService.factorial(n);
  }

   public String fibonacci(int n) {
    return GenioService.fibonacci(n);
  }
   
     public boolean esPrimo(int n) {
    return GenioService.esPrimo(n);
  }
     public int mcd(int n1,int n2) {
    return GenioService.mcd(n1, n2);
  }
     public long mcm(int n1, int n2) {
    return GenioService.mcm(n1, n2);
  }

   
  
  
  
  
  
  
}
