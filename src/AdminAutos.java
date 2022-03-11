
import javax.swing.JProgressBar;


public class AdminAutos extends Thread {
    private JProgressBar ganando;
    private JProgressBar 
    private boolean avanzar;
    private boolean vive;

    public AdminAutos(JProgressBar ganando) {
        this.ganando = ganando;
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
                ganando.setValue(Math.round(Integer.parseInt(
                        sp_velocidad.getValue().toString())
                        * (progBar_t.getValue() / 60))
                );
                progBar_d.setString(Integer.toString(
                        progBar_d.getValue()) + " Kilometros");

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
        }

    }
    
}
