
package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class GestorArchivoExperiencia {
    public void AgregarExperiencia(UsuarioExperiencia a)
    {
        File f= new File ("Experiencia.txt");
        FileWriter fw;
        BufferedWriter bw;
        try {
            if (f.exists()) {
                fw= new FileWriter(f,true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(a.getNombre()+"%"+a.getTexto());
            } else {
                fw= new FileWriter(f,true);
                bw= new BufferedWriter(fw);
                bw.write(a.getNombre()+"%"+a.getTexto());
            }
            bw.close();
        } catch (Exception e) {
        }
    }
    public ListaExperiencia obtenerLista()
    {
        ListaExperiencia li = new ListaExperiencia();
        
        File f= new File ("Experiencia.txt");
        FileReader fr;
        BufferedReader br;
        try {
            
            if (f.exists()) {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null)
                 {
                     String []textusuario= linea.split("%");
                     UsuarioExperiencia us = new UsuarioExperiencia(textusuario[0],textusuario[1]);
                     li.agregar(us);
                 }
                 br.close();
            } else {
                System.out.println("Archivo no existe");
            }
            
        } catch (Exception e) {
        }
        return li;
    }
}
