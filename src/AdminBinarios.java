
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminBinarios {
     private ArrayList<TiposdeAutos> listaCorredores = new ArrayList();
     File archivo = null;
     
     public AdminBinarios(String path) {
        archivo = new File(path);
    }
      public ArrayList<TiposdeAutos> getListaCorredores() {
        return listaCorredores;
    }
      public void setListaCorredores(ArrayList<TiposdeAutos> listaCorredores) {
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
     
    public void setTiposAutos(TiposdeAutos c) {
        this.listaCorredores.add(c);
    }
    
    public void cargarArchivo() {
        try {            
            listaCorredores = new ArrayList();
            TiposdeAutos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (TiposdeAutos) objeto.readObject()) != null) {
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
            for (TiposdeAutos t : listaCorredores) {
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

    public void setListaCorredores(TiposdeAutos car) {
        this.listaCorredores.add(car);
    }
    
}
