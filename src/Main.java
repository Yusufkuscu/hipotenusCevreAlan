import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Dik Üçgende Hipotenüs Hesaplama
        System.out.println("Hipotenüs Hesaplama");
        int a, b;
        double c;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a = scan.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = scan.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

        // Alan ve Çevre Hesaplama
        System.out.println("Alan Ve Çevre Hesabı");
        int k, l, m;
        double u, alan, cevre;

        System.out.print("1. Kenarı Giriniz : ");
        k = scan.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        l = scan.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        m = scan.nextInt();

        /*
            Üçgenin çevresi = 2u
            u = (k+l+m)/2
            Alan * Alan = u*(u-k)*(u-l)*(u-m)
         */

        u = (k+l+m)/2.0;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-k)*(u-l)*(u-m));

        System.out.println("Alan : "+alan);
        System.out.println("Çevre : "+ cevre);

    }
}