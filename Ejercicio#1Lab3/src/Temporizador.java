import java.util.Timer;
import java.util.TimerTask;
public class Temporizador {

Timer timer;

public Temporizador(int segundos)
{
    timer = new Timer();
    timer.schedule(new Recordatorio(), segundos * 100);
}
    
class Recordatorio extends TimerTask{
    public void run()
    {
        System.out.println("Alarma");
        timer.cancel();
    }
}

}
