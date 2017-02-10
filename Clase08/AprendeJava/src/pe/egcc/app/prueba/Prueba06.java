package pe.egcc.app.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba06 {

  public static void main(String[] args) {
    
    Map<String,Object> rec = new HashMap<>();
    
    rec.put("codigo", "P7834");
    rec.put("nombre", "Laptop");
    rec.put("stock", 800);
    rec.put("pventa", 4589.0);
    rec.put("pcosto", 2546.8);
    rec.put("nombre", "Impresora");
    
    
    System.out.println("Obteniendo un valor");
    System.out.println("Nombre: " + rec.get("nombre"));
    
    System.out.println("Mostrar todos los valores");
    for(String key: rec.keySet()){
      System.out.println(key + " => " + rec.get(key));
    }
  }
  
  
}
