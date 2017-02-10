package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  
  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
    lista.add("Real Madrid");
    lista.add("Barcelona");
    lista.add("Sevilla");
    lista.add("Melgar");
    lista.add("Bayer");
    lista.add("Milan");
    
    
    System.out.println("Recorrido Indexado");
    System.out.println("==================");
    for(int i = 0; i < lista.size(); i++) {
      String dato = lista.get(i);
      System.out.println(dato);
    }
    
    lista.set(2, "Arsenal");
    System.out.println("Recorrido con Iterator");
    System.out.println("======================");
    Iterator<String> i = lista.iterator();
    while(i.hasNext()) {
      String dato = i.next();
      System.out.println(dato);
    }
    
    lista.add(3, "Flamengo");
    System.out.println("Recorrido con Colección");
    System.out.println("=======================");
    for(String s: lista) {
      System.out.println(s);
    }
    
    
    System.out.println("Usando Lambda");
    System.out.println("=============");
    lista.stream().forEach(s -> System.out.println(s));
    
      
    
  }
  
}
