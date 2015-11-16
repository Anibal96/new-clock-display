
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Hora asignada.
    private int horas;
    // Minutos asignados.
    private int minutos;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
    }

    
    public void setTime(int hora, int minuto)
    {
        horas = hora;
        minutos = minuto;
    }
    
    public void timeTick()
    {
        if (minutos<60){
            minutos = minutos + 1;
        }
        if (minutos==60){
            horas = horas +1;
            minutos = 0;
        }
        if (horas==24){
            horas = 0;
        }
            
    }
    
    /**
     * Mostrar tiempo.
     */
    public String getTime()
    {
       String horAc = "%02d:%02d";
       String resultado = String.format(horAc,horas,minutos);
       return resultado;
    }
}
