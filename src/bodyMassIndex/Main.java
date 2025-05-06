package bodyMassIndex;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Körpergröße in Metern an.");
        double eingabeKörpergröße = scanner.nextDouble();
        System.out.println("Bitte geben Sie Ihr Körpergewicht in Kilogramm ein");
        int eingabeKörpergewicht = scanner.nextInt();
        System.out.println("Ihr BMI:"+(int)(eingabeKörpergewicht/(eingabeKörpergröße*eingabeKörpergröße)));


    }
}
