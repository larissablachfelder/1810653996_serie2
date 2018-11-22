package serie2;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
	    //Einen String einlesen
        String name = JOptionPane.showInputDialog("Name eingeben");

        //einen Integer einlesen und in einen Integer umwandeln, da JOptionPane gibt immer string zurück
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben"));

        if (alter<18) //überprüft die eingabe Alter, ob es kleiner 18 ist, wenn ja folgt das
        {   //showMessageDialog braucht als parentComponent null; gibt Text im Dialogfeld aus wenn jünger als 18
            JOptionPane.showMessageDialog(null,"Du bist leider noch nicht volljährig.");
        }

        else //ansonsten wird das ausgeführt
        {   //ist man 18 oder älter wird dieser Text ausgegeben
            JOptionPane.showMessageDialog(null,"Du bist volljährig.");
        }


    }
}
