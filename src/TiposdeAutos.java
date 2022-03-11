
import java.awt.Color;
import java.io.Serializable;


public class TiposdeAutos implements Serializable   {
    private String tipo;
    private int numeroIdentificador;
    private int distanciaRecorrida;
    private String nombre;
    private Color color;
    
    private static final long SerialVersionUID=777L;
    
    public TiposdeAutos() {
    
    }

    public TiposdeAutos(String tipo, int numeroIdentificador, int distanciaRecorrida, String nombre, Color color) { 
        this.tipo = tipo;
        this.numeroIdentificador = numeroIdentificador;
        this.distanciaRecorrida = distanciaRecorrida;
        this.nombre = nombre;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "tipo=" + tipo + "Identificador=" + numeroIdentificador + ", distanciaRecorrida=" + distanciaRecorrida + ", nombre=" + nombre ;
    }
    
    
    
    
}
