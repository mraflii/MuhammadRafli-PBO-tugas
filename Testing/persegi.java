package Testing;

public class persegi {
    private int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getKeliling() {
        penjumlahan keliling = new penjumlahan(sisi, sisi);
        keliling.setAngka1(keliling.getHasil());
        keliling.setAngka1(keliling.getHasil());
        return keliling.getHasil();
    }

}
