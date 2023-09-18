import java.util.Scanner;

public class Latihanlingkaran {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jarijari;
        double phi;
        int keliling;
        int luas;

        System.out.println("Masukkan jari jari");
        jarijari = input.nextInt();
        System.out.println("Masukkan nilai Phi");
        phi = input.nextDouble();

        luas = jarijari*jarijari*(int)phi;
        keliling = 2*(int)phi*jarijari;

        System.out.println("Hasil luas: " + luas);
        System.out.println("Hasil keliling: " + keliling);
    }
    
}
