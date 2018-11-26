package uebung2_aufgabe2;

import javax.swing.*;
import java.util.Random;

public class aufgabe5 {

    public static void main(String[] args)
    {
        //minimum und maximum zahlen festlegen
        int min = 1;
        int max = 10;

        //dieser Code wird vermutlich mit den beiden zahlen von maximum und minimum eine zufallszahl berechnen
        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;



        //aufgabe 5 version 1 ohne grenzen


           int versuche = 0;
                  while (versuche < 3)
                  {
                      String eingabe = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl zwischen 1 und 10 ein!");
                      int eingabe1 = Integer.parseInt(eingabe);

                      if (eingabe1 == zufallszahl)
                      {
                           JOptionPane.showMessageDialog(null, "Sie haben die Zahl erraten.");
                           break;
                      }

                       else
                      {
                             versuche++;
                           if (versuche > 2)
                           {
                               JOptionPane.showMessageDialog(null, "Sie haben die Zahl nicht erraten. Die richtige Zahl wäre " + zufallszahl + " gewesen! Alle Versuche aufgebraucht!");

                           }

                           else
                           {
                                JOptionPane.showMessageDialog(null, "Sie haben die Zahl leider falsch :( Aber Sie können es noch " + (3 - versuche) + " mal versuchen. Viel Glück ");
                           }
                      }
                   }







        }


        }


