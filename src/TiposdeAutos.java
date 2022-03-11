
import java.awt.Color;


public class TiposdeAutos extends Autos   {
    private String tipo;

    public TiposdeAutos(String tipo) {
        super();
    }

    public TiposdeAutos(String tipo, int numeroIdentificador, int distanciaRecorrida, String nombre, Color color) {
        super(numeroIdentificador, distanciaRecorrida, nombre, color);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tipo=" + tipo;
    }
    
    
    
    
}
