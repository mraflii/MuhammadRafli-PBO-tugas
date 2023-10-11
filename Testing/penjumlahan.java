package Testing;

public class penjumlahan {
    private int angka1, angka2;

    // constructor
    public penjumlahan() {

    }

    public penjumlahan(int input1, int input2) {
        angka1 = input1;
        this.angka2 = input2;
    }

    // accessor
    public int getAngka1() {
        return this.angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public int getHasil() {
        return angka1 + angka2;
    }

    // mutator
    public void setAngka1(int input1) {
        angka1 = input1;
    }

    public void setAngka2(int input2) {
        this.angka2 = input2;
    }
}
