/**
 * Faktorial
 */
import java.util.Scanner;
public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Proses faktorial = new Proses();
        System.out.println("masukan angka : ");
        int bilangan = input.nextInt();
        System.out.print(bilangan + "! = ");
        int hasil = faktorial.faktorial(bilangan);
        System.out.println();
        System.out.println("Hasil faktorialnya adalah " + hasil);

    }
}
 class Proses{
    static int faktorial(int angka) {
        
        if (angka <= 1) {
            System.out.println(" "+angka);
            return angka;
        } else {
            System.out.print(" " + angka + " x");
            return angka * faktorial(angka - 1); 
        }
    }
}