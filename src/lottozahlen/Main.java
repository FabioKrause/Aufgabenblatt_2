package lottozahlen;

public class Main {
    public static void main (String[] args){
        System.out.println("Ziehen Sie neue Lottozahlen in 6 aus 49");
        int randomNumber1 = ((int)(Math.random()*48))+1;
        System.out.println(randomNumber1);
        int randomNumber2 = ((int)(Math.random()*48))+1;
        System.out.println(randomNumber2);
        int randomNumber3 = ((int)(Math.random()*48))+1;
        System.out.println(randomNumber3);
        int randomNumber4 = ((int)(Math.random()*48))+1;
        System.out.println(randomNumber4);
        int randomNumber5 = ((int)(Math.random()*48))+1;
        System.out.println(randomNumber5);
        int randomNumber6 = ((int)(Math.random()*48))+1;
        System.out.println(randomNumber6);

    }
}
