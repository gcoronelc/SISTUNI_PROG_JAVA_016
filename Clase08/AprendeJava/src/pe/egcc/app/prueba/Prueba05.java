package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {

    List<Integer> lista = new ArrayList<>();

    lista.add(23);
    lista.add(30);
    lista.add(43);
    lista.add(67);
    lista.add(52);
    lista.add(26);
    lista.add(74);
    
    System.out.println("Todos");
    lista.forEach(n -> System.out.println(n));
    
    
    System.out.println("Aplicando filtros");
    lista.stream().filter(n -> n>50).forEach(n -> System.out.println(n));
    
  }
}
