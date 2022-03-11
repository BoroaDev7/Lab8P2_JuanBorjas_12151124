
import java.awt.Color;
import java.io.Serializable;


public class Autos implements Serializable{
    private int numeroIdentificador;
    private int distanciaRecorrida;
    private String nombre;
    private Color color;

    private static final long SerialVersionUID=777L;
    
    public Autos() {
    }

    public Autos(int numeroIdentificador, int distanciaRecorrida, String nombre, Color color) {
        this.numeroIdentificador = numeroIdentificador;
        this.distanciaRecorrida = distanciaRecorrida;
        this.nombre = nombre;
        this.color = color;
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
        return  "Identificador=" + numeroIdentificador + ", distanciaRecorrida=" + distanciaRecorrida + ", nombre=" + nombre ;
    }
    
    
}
