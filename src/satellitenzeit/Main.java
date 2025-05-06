package satellitenzeit;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl in Sekunden ein.");
        int eingabe = scanner.nextInt();
        int tage = eingabe/86400;
        eingabe = eingabe-(tage*86400);
        int stunden = eingabe/3600;
        eingabe = eingabe-(stunden*3600);
        int minuten = eingabe/60;
        eingabe = eingabe-(minuten*60);
        int sekunden = eingabe;
        System.out.println("Tage:"+tage);
        System.out.println("Stunden:"+stunden);
        System.out.println("Minuten"+minuten);
        System.out.println("Sekunden:"+sekunden);



    }
}
