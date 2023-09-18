import java.util.Scanner;

public class Latihansegitigasamasisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int alas;
        int tinggi;
        int sisi;
        int luas;
        int keliling;

        System.out.println("Masukkan alas");
        alas = input.nextInt();
        System.out.println("Masukkan tinggi");
        tinggi = input.nextInt();

        luas = alas * tinggi /2 ;
        System.out.println("Hasil luas: " + luas);
        
        System.out.println("Masukkan sisi: ");
        sisi = input.nextInt();

        keliling = 3 * sisi;
        System.out.println("masukkan keliling: " + keliling);

    }
    
}
