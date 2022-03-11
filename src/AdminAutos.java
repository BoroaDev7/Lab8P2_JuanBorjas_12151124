
import javax.swing.JProgressBar;
import javax.swing.JTextField;


public class AdminAutos extends Thread {
    private JProgressBar ganando;
    private JTextField largo; 
    private boolean avanzar;
    private boolean vive;

    public AdminAutos(JProgressBar ganando,JTextField largo) {
        this.ganando = ganando;
        this.largo=largo;
        avanzar=true;
        vive = true;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setDetener(boolean vive) {
        this.vive = vive;
    }
    
    
    public void run() {
        while (vive) {
            if (avanzar) {
                ganando.setMaximum(Integer.parseInt(largo.getText()));
               
               

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }

    }
    public void DistanciaRecorrida(){
        
        
    }
    
}
