
package modelo;

import java.util.ArrayList;
import java.util.List;


public class ListaUsuario {
    List<UsuarioVO> list;
   public ListaUsuario()
   {
       list= new ArrayList<UsuarioVO>();
   }
   public void agregar(UsuarioVO u)
   {
       list.add(u);
   }
   public int size()
   {
       return list.size();
   }
   public UsuarioVO obtener(int i)
   {
       return list.get(i);
   }
}
