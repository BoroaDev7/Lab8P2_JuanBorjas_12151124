
import java.util.Random;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


public class AdminAutos extends Thread {
    private JProgressBar ganando;
    private JTextField largo; 
    private boolean avanzar;
    private boolean vive;
    private String tipo;
    private  Random num=new Random();
   

    public AdminAutos(JProgressBar ganando,JTextField largo) {
        this.ganando = ganando;
        this.largo=largo;
        avanzar=true;
        vive = true;
    }
     public AdminAutos(String tipo) {
       this.tipo=tipo;
  
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
    public int DistanciaRecorrida1(){
        try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        return 30 + num.nextInt(161);
    }
    public int DistanciaRecorrida2(){
  
        try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
         return 20 + num.nextInt(181);
    }
    public int DistanciaRecorrida3(){
  
        try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
         return 20 + num.nextInt(181);
    }
    
}
