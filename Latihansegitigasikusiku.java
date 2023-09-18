import java.util.Scanner;
public class Latihansegitigasikusiku {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int alas;
        int tinggi;
        int sisi_a;
        int sisi_b;
        int sisi_c;
        int luas;
        int keliling;

        System.out.println("Masukkan alas");
        alas = input.nextInt();
        System.out.println("Masukkan tinggi");
        tinggi = input.nextInt();

        System.out.println("Masukkan sisi a: ");
        sisi_a = input.nextInt();
        System.out.println("Masukkan sisi b: ");
        sisi_b = input.nextInt();
        System.out.println("Masukkan sisi c");
        sisi_c = input.nextInt();

        luas = alas * tinggi/2;
        System.out.println("Hasil luas: " + luas);

        keliling = sisi_a + sisi_b + sisi_c;
        System.out.println("Hasil keliling: " + keliling);
    }
    
}
