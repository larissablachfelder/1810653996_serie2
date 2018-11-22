package serie2;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
	    //Einen String einlesen
        String name = JOptionPane.showInputDialog("Name eingeben");

        //einen Integer einlesen und in einen Integer umwandeln, da JOptionPane gibt immer string zurück
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben"));

        if (alter<18)
        {
            JOptionPane.showMessageDialog(null,"Du bist leider noch nicht volljährig.");
        }

        else
        {
            JOptionPane.showMessageDialog(null,"Du bist volljährig.");
        }


    }
}
