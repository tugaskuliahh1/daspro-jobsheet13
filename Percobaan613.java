import java.util.Scanner;

public class Percobaan613 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan panjang:");
        p=input.nextInt();
        System.out.println("Masukkan lebar:");
        l=input.nextInt();
        System.out.println("Masukkan tinggi:");
        t=input.nextInt();

        // Menghitung luas persegi panjang
        L=p*l;
        System.out.println("Luas Persegi Panjang adalah " +L);

        // Menghitung volume balok
        vol=p*l*t;
        System.out.println("Volume balok adalah " +vol);
    }

    static int hitungLuas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume= hitungLuas(a,b)*tinggi;
        return volume;
    }
}
