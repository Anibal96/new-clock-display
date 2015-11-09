
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

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setTime(int hora, int minuto)
    {
        horas = hora;
        minutos = minuto;
    }
    
    public void timeTick()
    {
        if (minutos<59){
            minutos = minutos + 1;
        }
        if(minutos==59){
            horas = horas +1;
            minutos = 0;
        }
            
    }
    
    public void getTime()
    {
        System.out.println(horas + ":" + minutos);
    }
}
