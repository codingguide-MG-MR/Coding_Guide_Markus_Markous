package c_kontrollstrukturen;

import java.util.Scanner;

//Selectionsort, Iteration, Functions
public class Kontrollstrukturen {
    public static void main(String[] args) {
        //For, while (Kopfgesteuerten) Muss nicht immer ausgeführt werden
        System.out.println("Kopfgesteuerte For Schleife");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Kopfgesteuerte While Schleife");
        int i = 1;
        while (i <= 10)
        {
            System.out.println(i);
            i++;

        }

        i = 10;
        while (i<10){
            //Toter Code (Code wird niemals ausgeführt, weil die Bedingung schon von anfang an nicht erfüllt wird)
            System.out.println(i);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Kopfgesteuerte Schleife");
        //Do While (Fu0gesteuert) Wird immer ein mal augesführt
        i = 10;
        do {
            //Es kann hier keinen Toten Code geben, weil es immer mindestens ein Mal ausgeführt wird
            System.out.println(i);
        } while (i<10);
        System.out.println("--------------------------------------------------");
        System.out.println("Funktion mit Parameter");
        System.out.println(ifakultaet(4));
        System.out.println("--------------------------------------------------");
        System.out.println("Funktion ohne Parameter");
        System.out.println(gruesse());
        System.out.println("--------------------------------------------------");
        System.out.println("Procedur mit Parameter");
        ausgabefakualtaet(4);
        System.out.println("--------------------------------------------------");
        System.out.println("Procedur ohne Parameter");
        ausgabegruesse();
        System.out.println("--------------------------------------------------");
        System.out.println("Kleinstezahl ausgeben:");
        int[] iArray = { 22, 13, 64, 12, 33};
        int iKleinstezahlausgeben = iArray[0];
        for(int j = 0; j<=4; j++)
        {
            if (iArray[j] < iKleinstezahlausgeben){
                iKleinstezahlausgeben = iArray[j];
            }

        }
        System.out.println("Kleinste Zahl: " + iKleinstezahlausgeben);
        System.out.println("--------------------------------------------------");
        System.out.println("Selectionsort");
        System.out.println("Fortgeschritten Nicht Verwirren lassen!!!!!!");
        int[] iUnsortiertesarrysortieren = { 22, 13, 64, 12, 33};


        for(int j1 = 0; j1 <= 4; j1++)
        {
            int iKleinstezahl = iUnsortiertesarrysortieren[j1];
            int iIndexkleinsteselement = j1;
            for (int j2 = j1; j2 <=4; j2++)
            {
                if (iUnsortiertesarrysortieren[j2]<iKleinstezahl)
                {
                    iIndexkleinsteselement = j2;
                    iKleinstezahl = iUnsortiertesarrysortieren[j2];
                }
            }
            int temp = iUnsortiertesarrysortieren[j1];
            iUnsortiertesarrysortieren[j1] = iKleinstezahl;
            iUnsortiertesarrysortieren[iIndexkleinsteselement] = temp;
        }
        for (int iZahl : iUnsortiertesarrysortieren)
        {
            System.out.println(iZahl);
        }
    }
    /*Funktionen und Prozeduren helfen den Einen Grundsatz in der SW-Entwicklung einzuhalten
    * Grundsatz: Don't repeat yourself!
    * Vorteil: Verkürzen von Code
    * */
    //Funktion mit Parameter (ifakultaet = Name der Funktion; public = Zugriffsmodifizier; int = Typ des Rückgabewertes; iZahl = Parameter)

    public static int ifakultaet(int iZahl)
    {
        int iRuekgabe = 1;
        for (int i = iZahl; i >=2; i--)
        {
            iRuekgabe = i * iRuekgabe;
        }
        return iRuekgabe;
    }
    //Funktion ohne Parameter
    public static String gruesse()
    {
        return "Hallo User!";
    }

    //Prozedur mit Parameter (wird durch void gekennzeichnet)
    public static void ausgabefakualtaet(int iZahl)
    {
        int iAusgabe = 1;
        for (int i = iZahl; i >=2; i--)
        {
            iAusgabe = i * iAusgabe;
        }
        System.out.println(iAusgabe);
    }
    //Prozedur ohne Parameter (wird durch void gekennzeichnet)
    public static void ausgabegruesse()
    {
        System.out.println("Hallo User!");
    }
}