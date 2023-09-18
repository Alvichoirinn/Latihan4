import java.util.Scanner;
public class Latihanpersegipanjang {
    public static void main (String[] args) {
         Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        System.out.println("Masukkan panjang");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar");
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);
        System.out.println(keliling);
    }
    
}
