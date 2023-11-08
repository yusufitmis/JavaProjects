import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String[] hamle = {"Taş", "Kağıt", "Makas"};
        int kullaniciPuan = 0;
        int bilgisayarPuan = 0;
        System.out.println("Taş-Kağıt-Makas oyununa hoşgeldiniz.");
        System.out.println("Yapabileceğiniz Hamleler 0-Taş 1-Kağıt 3-Makas");
        System.out.print("Kaç olan kazansın: ");
        int sonPuan = scanner.nextInt();

        while(true){

            System.out.print("Yapmak istediğiniz hamleyi girin: ");
            int kullaniciSecim = scanner.nextInt();
            int bilgisayar_secim = (int) (Math.random()*3);

            if ((kullaniciSecim == 0 && bilgisayar_secim ==2) || (kullaniciSecim == 1 && bilgisayar_secim == 0) || (kullaniciSecim == 2 && bilgisayar_secim == 1)) {
                kullaniciPuan += 1;
                System.out.printf("Siz %s yaptınız. Bilgisayar %s yaptı\n", hamle[kullaniciSecim], hamle[bilgisayar_secim]);
                System.out.println("Siz: " + kullaniciPuan + " -" + " Bilgisayar: " + bilgisayarPuan);
            }
            else if ((kullaniciSecim == 0 && bilgisayar_secim ==1) || (kullaniciSecim == 1 && bilgisayar_secim == 2) || (kullaniciSecim == 2 && bilgisayar_secim == 0)){
                bilgisayarPuan += 1;
                System.out.printf("Siz %s yaptınız. Bilgisayar %s yaptı\n",hamle[kullaniciSecim], hamle[bilgisayar_secim]);
                System.out.println("Siz: " + kullaniciPuan + " -" + " Bilgisayar: " + bilgisayarPuan);
            }
            else if (kullaniciSecim == bilgisayar_secim){
                System.out.printf("Siz %s yaptınız. Bilgisayar %s yaptı\n",hamle[kullaniciSecim], hamle[bilgisayar_secim]);
                System.out.println("Siz: " + kullaniciPuan + " -" + " Bilgisayar: " + bilgisayarPuan);
            }
            if ((kullaniciPuan == sonPuan) || (bilgisayarPuan == sonPuan)){
                if (kullaniciPuan>bilgisayarPuan){
                    System.out.println("Tebrikler Kazandınız...");
                }
                else{
                    System.out.println("Üzgünüm Kaybettiniz...");
                }
                break;
            }


        }




    }

}