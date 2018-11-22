package uebung2_aufgabe2;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten
{

    public static void main (String[] args)
    {   //minimum und maximum zahlen festlegen
        int min = 1;
        int max = 10;

        //dieser Code wird vermutlich mit den beiden zahlen von maximum und minimum eine zufallszahl berechnen
        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;


        if(zufallszahl%2==0) //Hier überprüfe ich, ob die Zahl gerade ist indem ich %2 mit 0 vergleiche
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade.");

        }

        else //ist der Rest der Division nich 0 wird das ausgegeben --> die Zahl ist dementsprechend nicht 0
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist ungerade.");
        }









    }






}
