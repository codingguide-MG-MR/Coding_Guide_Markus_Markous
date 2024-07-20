package b_grundlegende_ein_und_ausgabe;

//Hello World, FormattedOutput and Arithmetic, Calculations

import java.util.Scanner;

public class Grundlegendeeinundausgabe {
    public static void main(String[] args) {

        //Hello World
        System.out.println("--------------------------------------------------");
        System.out.println("Hello World");


//******************************************************************************************************************************************************




        //Artithmeitsche Operatoren (Kalkulationen)
        System.out.println("--------------------------------------------------");
        //Additions Operator (+)
        int iSummand1 = 5;
        int iSummand2 = 7;
        //Eine Addtionsrechenoperation wird druchgeführt
        int iSumme = iSummand1 + iSummand2;
        //Nach Operation ausgabe in Konsole
        System.out.println("Summe: " + iSumme);

        //Subtraktions Operator (-)
        int iMinuend = 7;
        int iSubtrahend = 5;
        //Eine Subtraktionsoperation wird druchgeführt
        int iDifferenz = iMinuend - iSubtrahend;
        //Nach Operation ausgabe in Konsole
        System.out.println("Differnz: " + iDifferenz);

        //Multiplikation Operator (*)
        int iFaktor1 = 7;
        int iFaktor2 = 5;
        //Eine Multiplikationrechenoperation wird druchgeführt
        int iProdukt = iFaktor1 * iFaktor2;
        //Nach Operation ausgabe in Konsole
        System.out.println("Produkt: " + iProdukt);

        //Divisions Operator (/)
        int iDivident = 25;
        int iDivisor = 5;
        //Eine Quotientrechenoperation wird druchgeführt
        int iQuotient = iDivident / iDivisor;
        //Nach Operation ausgabe in Konsole
        System.out.println("Quotient: " + iQuotient);

        //Mod Operator (%) (Rest einer Division)
        int iDivident1 = 24;
        int iDivisor1 = 6;
        //Eine Divisionsrestrechenoperation wird druchgeführt
        int iRestdivision = iDivident1 % iDivisor1;
        //Nach Operation ausgabe in Konsole
        System.out.println("Restdivision: " + iRestdivision);

        //Mod Operator Inkrementierung(++)
        int iIterator1 = 5;
        iIterator1++;
        int iWertnachiteration = iIterator1;
        //Wert nach Inkrementierung
        System.out.println("Wert nach Inkrementation: " + iWertnachiteration);

        //Mod Operator Dekrementierung(--)
        int iIterator2 = 5;
        iIterator2--;
        int iWertnachdekrementierung = iIterator2;
        //Wert nach Inkrementierung
        System.out.println("Wert nach Inkrementation: " + iWertnachdekrementierung);
        System.out.println("--------------------------------------------------");

        //Formated Output String
        System.out.printf("%d ist größer als %d\n", 6, 2);
        System.out.printf("%f ist größer als %f\n", 6.8, 2.9);
        System.out.printf("%s ist älter %s\n", "Markous", "Markus");
        System.out.println("--------------------------------------------------");

        /*
        1	%D	int/signiertes int	wird für vorzeichenbehaftete E/A-Integerwerte verwendet
        2	%C	verkohlen	Wird für E/A-Zeichenwerte verwendet
        3	%F	schweben	Wird für I/O-Dezimal-Gleitkommawerte verwendet
        4	%S	Schnur	Wird für E/A-Zeichenfolgen/Zeichengruppen verwendet
        5	%ld	lange Ganzzahl	Wird für E/A-lange vorzeichenbehaftete Ganzzahlwerte verwendet
        6	%u	vorzeichenlose Ganzzahl   	Wird für E/A-Integerwerte ohne Vorzeichen verwendet
        7	%ich	vorzeichenlose Ganzzahl	wird für den I/O-Integerwert verwendet
        8	%lf	doppelt	Wird für E/A-Bruchteile oder Gleitkommadaten verwendet
        9	%N	druckt	druckt nichts
        */

        Scanner scanner = new Scanner(System.in);

        // Check if there is another line of input
        if (scanner.hasNextLine()) {
            // Safely read the next line
            String line = scanner.nextLine();
            System.out.println(line);
        } else {
            System.out.println("No input available.");
        }

        //System.out.println("Servus, Grüß dich " + name + "!!!");







    }
}
