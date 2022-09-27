package Module4;

public class KaryawanParuhWaktu extends Karyawan{

    private int jamkerja;

    public KaryawanParuhWaktu(int nik, String nama, int gajipokok) {
        super(nik, nama, gajipokok);
        this.jamkerja = jamkerja;
    }

    public int getJamKerja() {
        return jamkerja;
    }

    public void setJamKerja(int jamkerja) {
        this.jamkerja = jamkerja;
    }
}

