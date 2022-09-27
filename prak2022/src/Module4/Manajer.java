package Module4;

public class Manajer extends Karyawan{
    private int pencapaianKerja;
    (int nik, String nama, int gajipokok) {
        super(nik, nama, gajipokok);
        this.pencapaianKerja = pencapaianKerja;
    }

    public int getPencapaianKerja() {
        return pencapaianKerja;
    }

    public void setPencapaianKerja(int pencapaianKerja) {
        this.pencapaianKerja = pencapaianKerja;
    }
}

