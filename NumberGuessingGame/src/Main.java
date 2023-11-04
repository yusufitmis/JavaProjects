import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        // tahmin edilecek sayı aralığını alma
        System.out.print("Tahmin Alt Değeri Girin: ");
        int min = scan.nextInt();
        System.out.print("Tahmin Üst Değeri Girin: ");
        int max = scan.nextInt();
        // tahmin edilecek sayı
        int sayi = rnd.nextInt(max-min)+min;
        //kaç seferde tahmin edilecek
        System.out.print("Kaç Hak İstersiniz: ");
        int hak = scan.nextInt();
        double puan =100;
        int i =0;
        boolean kazan = false;

        while(i < hak){
            i++;
            System.out.print( i + ". tahmini yapın: ");
            int tahmin = scan.nextInt();
            if (sayi < tahmin){
                System.out.println("Aşağı!");
            }
            else if(sayi>tahmin){
                System.out.println("Yukarı!");
            }
            else {
                puan -=(100/hak)*(i-1);
                System.out.println("Tebrikler " + i + ". Tahminde Bildiniz..." + "Puanınız: " + puan);
                kazan = true;
                break;
            }
        }
        if (!kazan){
            System.out.println("Kaybettiniz... Sayı: " + sayi + "Puanınız: 0");
        }

    }
}