
/**
 * Write a description of class MeDebes10Euros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * @see voxxxx
 */
public class MeDebes10Euros
{
    // instance variables - replace the example below with your own
    private int x;
   

    /**
     * Constructor for objects of class MeDebes10Euros
     */
    public MeDebes10Euros()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Este metodo sirve para sacar por pantalla un mensaje las veces que se indica 
     * con el parametro de entrada. 
     * 
     * @param  y   Número de veces que se va a mostrar el mensaje por pantalla.
     * @return     No devuelve nada. 
     * 
     */
    public void sampleMethod(int y)
    {
        // put your code here
        for (int i = 0; i < y; i++)
        {
            System.out.println("Si lees esto debes 10€ a boki");
        }
        
    }
}
