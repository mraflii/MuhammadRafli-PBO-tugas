package testprogram;

public class aritmatika {
    private int angka1, angka2;

    public aritmatika(int input1, int input2) {
        this.angka1 = input1;
        this.angka2 = input2;
    }

    public int penjumlahan() {
        int hasil = angka1 + angka2;
        return hasil;
    }

    public int pengurangan() {
        int hasil = angka1 - angka2;
        return hasil;
    }

    public int perkalian() {
        int hasil = angka1 * angka2;
        return hasil;
    }

    public int pembagian() {
        int hasil = angka1 / angka2;
        return hasil;
    }
}
