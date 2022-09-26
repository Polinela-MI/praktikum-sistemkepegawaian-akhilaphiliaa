public class karyawan {
    int nik;
    String namaLengkap;
    int gajiPokok;

    public karyawan (int nik, String namaLengkap, int gajiPokok) {
        this.nik = nik;
        this.namaLengkap = namaLengkap;
        this.gajiPokok = gajiPokok;
    }

    public int getNik() {
        return nik;
    }

    public String getNamaLengkap(){
        return namaLengkap;
    }

    public void hitungGaji() {
        double tunjanganTransport = gajiPokok * 0.05;
        double tunjanganKinerja = gajiPokok * 0.1;
        double totalSebelumPajak = gajiPokok + tunjanganTransport + tunjanganKinerja;

        double pajak = totalSebelumPajak * 0.025;

        double total = totalSebelumPajak - pajak;

        System.out.println(" Rp. " + total);
    }
}
