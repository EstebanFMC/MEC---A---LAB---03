import java.util.Timer;
import java.util.TimerTask;

public class MainPrueba {

   
    public static void main(String[] args) {
        
        TimerTask task = new TimerTask(){
            public void run()
            {
                    
            }
        };
         
        Timer timer = new Timer ();
        timer.scheduleAtFixedRate(task, 2,3);
        
    }
   
}
