import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        afisare();
        pret();
    }

    public static int nrMinute() {
        System.out.println("Introduceti nr de minute pentru inchiriere:");
        Scanner sc = new Scanner(System.in);
        int minute = sc.nextInt();
        return minute;
    }
    public static void afisare() {
        JOptionPane.showMessageDialog(null, "Sammy’s makes it fun in the sun");
    }

    public static void pret() {
        int minute = nrMinute();
        int ore = 0;
        if (minute >= 60) {
            ore = minute / 60;
        }
        int minuteExtra = minute % 60;
        int pretOra = 40;
        int pretMinute = 1;
        int pretTotal = (pretOra * ore) + (pretMinute * minute);
        System.out.println("Numar ore:" + ore + ", nr minute extra:" + minuteExtra + ", pret total: " + pretTotal);
        System.out.println("Numar minute extra:" +minuteExtra);
        System.out.println("Pret total:" + pretTotal);
             }
}