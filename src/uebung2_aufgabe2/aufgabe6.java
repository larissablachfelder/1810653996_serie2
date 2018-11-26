package uebung2_aufgabe2;

import javax.swing.*;
import java.util.Random;

public class aufgabe6 {

    public static void main(String[] args)
    {
        //minimum und maximum zahlen festlegen
        int min = 1;
        int max = 10;

        //dieser Code wird vermutlich mit den beiden zahlen von maximum und minimum eine zufallszahl berechnen
        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;



        //aufgabe 6 do-while-schleife


           int versuche = 0;
                  do //braucht keinen parameter, da dieser später bei while dabeisteht, am ende der schleife wird die versuche variable erhöht
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
                      versuche++; //hier wird die variable erhöht
                   }

                    while(versuche<3);//hier wird die variable &uuml;berpr&uuml;ft und anschlie&szlig;end entweder abgebrochen oder wiederholt



                //do-while ist fußgesteuert, weil am ende der schleife erhöht und überprüft wird, ob die Schleife ausgeführt wird oder nicht

                //das programm arbeitet nur mehr teilweise und wiederholt die schleife nicht mehr, nach einmal eintippen wird die schleife abgebrochen

        //For-schleife: Zählvariable, zählschritte und höchstanzahl stehen in der BEdingung im Kopf
        //While-schleife: Überprüfung im Kopf, variable wird im Körper erhöht
        //DO_WHILE: zuerst wird ausgeführt und anschließend die variable erhöht und erst danach überprüft



        }


        }


