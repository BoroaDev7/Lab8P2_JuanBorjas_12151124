
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminBinarios {
     private ArrayList<Autos> listaCorredores = new ArrayList();
     File archivo = null;
     
     public AdminBinarios(String path) {
        archivo = new File(path);
    }
      public ArrayList<Autos> getListaCorredores() {
        return listaCorredores;
    }
      public void setListaCorredores(ArrayList<Autos> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }
    
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminBinarios{" + "listaCorredores=" + listaCorredores + ", archivo=" + archivo + '}';
    }
     
    public void setAutos(Autos c) {
        this.listaCorredores.add(c);
    }
    
    public void cargarArchivo() {
        try {            
            listaCorredores = new ArrayList();
            Autos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Autos) objeto.readObject()) != null) {
                        listaCorredores.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Autos t : listaCorredores) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
