package pe.egcc.app.prueba;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba07 {

  public static void main(String[] args) {
    
    Set<String> conjunto = new HashSet<>();
    
    conjunto.add("Chiclayo");
    conjunto.add("Cuzco");
    conjunto.add("Chachapoyas");
    conjunto.add("Tacna");
    conjunto.add("Arequipa");
    conjunto.add("Huancayo");
    
    for(String s: conjunto){
      System.out.println(s);
    }
  }
}
