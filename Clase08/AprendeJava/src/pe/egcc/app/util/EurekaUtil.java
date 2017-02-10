package pe.egcc.app.util;

/**
 *
 * @author Gustavo Coronel
 */
public final class EurekaUtil {

  public static void print(int[][] mat) {
    System.out.println("-------------------------------------------");
    for (int[] fila : mat) {
      String sFila = "";
      for (int n : fila) {
        sFila += "   " + n;
      }
      System.out.println(sFila);
    }
  }

  private EurekaUtil() {
  }
  
  public static void print(int[] datos){
    System.out.println("-----------------");
    for (int dato : datos) {
      System.out.println("Dato: " + dato);
    }
  }
  
  
  
  
}
