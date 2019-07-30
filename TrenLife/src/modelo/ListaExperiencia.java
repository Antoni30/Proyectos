
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaExperiencia {
    List<UsuarioExperiencia> list;
    
   public ListaExperiencia()
   {
       list= new ArrayList<UsuarioExperiencia>();
   }
   public int size()
   {
       return list.size();
   }
   public UsuarioExperiencia obtener(int n)
   {
       return list.get(n);
   }
   public void agregar(UsuarioExperiencia u)
   {
       list.add(u);
   }
   public void mostrar()
   {
       Iterator<UsuarioExperiencia> iter = list.iterator();
       while(iter.hasNext())
       {
           UsuarioExperiencia aux= iter.next();
           System.out.println(aux.toString());
       }
   }
}
