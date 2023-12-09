public class ContohVarargs {

    // Fungsi varargs untuk tipe data int
    public static void fungsiVarargs(int... angka) {
        System.out.print("Varargs int: ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Fungsi varargs untuk tipe data String
    public static void fungsiVarargs(String... teks) {
        System.out.print("Varargs String: ");
        for (String s : teks) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Memanggil versi fungsi varargs untuk tipe data int
        fungsiVarargs(1, 2, 3);

        // Memanggil versi fungsi varargs untuk tipe data String
        fungsiVarargs("Hello", "World");
    }
}
