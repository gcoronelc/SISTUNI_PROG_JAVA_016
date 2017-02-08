package pe.egcc.app.service.spec;

import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public interface CrudSpec<T> {
  
  void insertar(T bean);
  
  void actualizar(T bean);
  
  void eliminar(int id);
  
  T read(int id);
  
  List<T> read(T bean);
  
  List<T> readAll();
}
