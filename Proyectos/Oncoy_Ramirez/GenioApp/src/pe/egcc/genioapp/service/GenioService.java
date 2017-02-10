package pe.egcc.genioapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class GenioService {

  private GenioService() {
  }

  public static long factorial(int n){
    long f = 1;
    for(;n>1;){
      f *= n--;
    }
    return f;
  }
  
  public static int mcd(int n1, int n2){
      
    int res=1;
    for(int i=1; i<=n1;i++){
        if((n1%i==0) && (n2%i==0)){
            res=i;
        }
    }
      
    //System.out.println(res);  
    return res;
  }
  
  public static int mcm(int n1, int n2){
    int res=1;
    int mcm;
    for(int i=1; i<=n1;i++){
        if((n1%i==0) && (n2%i==0)){
            res=i;
        }
    }
    mcm=(n1*n2)/res;
        //System.out.println(mcm);
    return mcm;
  }
  
  public static String fibonacci(int n){
    int num1 = 1, num2 = 0;
        String serieFibo;
        
        serieFibo= "" + num2;
        serieFibo=serieFibo + " " + num1;
        
        for(int i = 0; i < n; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            serieFibo=serieFibo + " " + num1;
        }
        return serieFibo;
  }
  
  public static boolean  esPrimo(int n){
     int contadorResiduo=0;
        boolean primo=false;
         for (int i = 1; i <= n; i++) {
            if((n%i)==0){
                contadorResiduo+=1;
            }
        }
        
        if(contadorResiduo<=2){
            primo=true;
        }
        
        return primo;
  }
  
}
