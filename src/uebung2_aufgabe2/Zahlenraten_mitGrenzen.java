package uebung2_aufgabe2;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten_mitGrenzen //aufgabe5 mit Grenzen
{

    public static void main (String[] args)
    {   //minimum und maximum zahlen festlegen
        int min = 1;
        int max = 10;

        //dieser Code wird vermutlich mit den beiden zahlen von maximum und minimum eine zufallszahl berechnen
        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;


        /* IF-ELSE-Block laut aufgabe 3 auskommentieren


        if(zufallszahl%2==0) //Hier überprüfe ich, ob die Zahl gerade ist indem ich %2 mit 0 vergleiche
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade.");

        }

        else //ist der Rest der Division nich 0 wird das ausgegeben --> die Zahl ist dementsprechend nicht 0
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist ungerade.");
        }
        */

    //Aufgabe 3

        // diese Zeile lest eine Zahl ein gibt es aber als String zurück

        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl zwischen 1 und 10 ein!");

        /*das Vergleiche funktioniert nicht, weil JOptionPane immer einen String zurückliefert und man keinen String
            mit einem Integer vergleichen kann, deshalb muss man JOptionPane vorher in einen Integer umwandeln mithilfe
            des Befehls Integer.parseInt
             */


        //string in integer umwandeln

        int eingabe1 = Integer.parseInt(eingabe);

        /*Kann auch in einem Schritt erledigt werden:
        int eingabe = Integer.ParseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl zwischen 1 und 10 ein!"));
        dann müsste in der if auch die variable eingabe mit zufallszahl verglichen werden
         */








         //aufgabe4
          int versuche = 0; //variable um versuche zu zählen bei while-schleife auf 0 setzen
         while (versuche<3) //while-schleife hat nur einen parameter
         {

             if (eingabe1 != zufallszahl) //beim nächsten mal vorher überprüfen, ob es richtig ist --> inhalt von else und if tausche und eingabe mit zufallszahl vergleichen
             {
                 if(eingabe1 == zufallszahl) //Die Zahlen der Eingabe und der Zufallszahl werden überprüft ob sie übereinstimmen.
                 {


                     JOptionPane.showMessageDialog(null,"Die Zahlen stimmen überein.");
                 }
                    //die eingabe zahl wird überprüft, ob sie in der Grenze von +-2 liegt
                 else if ((zufallszahl-eingabe1)>= -2 && (zufallszahl-eingabe1)<=2)
                 {

                     JOptionPane.showMessageDialog(null, "Du bist innerhalb der Grenze von -2 und +2.");
                 }


                 else //die Zahl ist falsch
                 {

                     JOptionPane.showMessageDialog(null, "Die Zahlen stimmen nicht überein.");
                 }

                 //ein neues Fenster erscheint, um erneut eine Zahl einzugeben und die Anzahl der Versuche wird angezeigt
                 eingabe1 = Integer.parseInt(JOptionPane.showInputDialog("Gib erneut eine Zahl ein!")); //übrige Versuche werden ausgegeben

             }

             else //wenn die Zahl richtig ist
             {
                 JOptionPane.showMessageDialog(null, "Du hast die Zahl " + zufallszahl + " erraten!");

                 break;
             }

            versuche++; //hier wird der Versuch erhöht.

             //überprüfen ob alle 3 versuche schon verbraucht sind
             if(versuche==2)
             {
                 if (zufallszahl == eingabe1) //Zufallszahl und eingabe werden beim dritten versuch nochmals überprüft
                 {
                     JOptionPane.showMessageDialog(null, "Beim letzten Versuch hats geklappt! Die Zahl ist: " +zufallszahl );
                 }
                 else
                 {   //Die zahl war falsch, deshalb wird die zufallszahl ausgegeben
                     JOptionPane.showMessageDialog(null, "Du hast alle Versuche verbraucht! Die richtige Zahl wäre " + zufallszahl + " gewesen.");

                 }
             }


           }






    }

}
