package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {

    List<Producto> catalogo = new ArrayList<>();

    catalogo.add(new Producto("Sporade", 2.50, 200));
    catalogo.add(new Producto("Gatorade", 3.00, 180));
    catalogo.add(new Producto("Coca Cola", 2.00, 100));
    catalogo.add(new Producto("Inka Cola", 2.50, 150));
    catalogo.add(new Producto("Chicha de Jora", 5.00, 300));
    catalogo.add(new Producto("Agua Cielo", 5.00, 1200));

    System.out.println("Recorrido Indexado");
    System.out.println("==================");
    for (int i = 0; i < catalogo.size(); i++) {
      Producto p = catalogo.get(i);
      System.out.println(p);
    }

    System.out.println("Recorrido Tipo Colección");
    System.out.println("========================");
    for (Producto p : catalogo) {
      System.out.println(p);
    }
    
    
    System.out.println("Recorrido Usando Lambda");
    System.out.println("=======================");
    catalogo.forEach(p -> System.out.println(p));
    

  }
}
