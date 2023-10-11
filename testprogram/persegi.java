package testprogram;

public class persegi {
    public static void main(String[] args) {
        aritmatika penjumlahan = new aritmatika(100, 2);
        aritmatika pengurangan = new aritmatika(100, 2);
        aritmatika perkalian = new aritmatika(100, 2);
        aritmatika pembagian = new aritmatika(100, 2);

        int a = penjumlahan.penjumlahan();
        int b = pengurangan.pengurangan();
        int c = perkalian.perkalian();
        int d = pembagian.pembagian();

        System.out.println("Penjumlahan " + a);
        System.out.println("Pengurangan " + b);
        System.out.println("perkalian " + c);
        System.out.println("pembagian " + d);
    }
}
