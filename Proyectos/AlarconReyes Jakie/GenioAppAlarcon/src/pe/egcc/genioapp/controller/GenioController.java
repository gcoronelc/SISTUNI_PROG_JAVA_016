package pe.egcc.genioapp.controller;

import pe.egcc.genioapp.service.GenioService;

public class GenioController {

  public long factorial(int n) {
    return GenioService.factorial(n);
  }

  public int mcd(int n1, int n2){
  return GenioService.mcd(n1, n2);
  
  }
   public int mcm(int n1, int n2){
  return GenioService.mcm(n1, n2);
  
  }
    public static int[] fibonacci(int limite){
  return GenioService.fibonacci(limite);
  
  }
 
       public boolean Primo(int n1){
  return GenioService.esPrimo(n1);
  
  }
    
}
