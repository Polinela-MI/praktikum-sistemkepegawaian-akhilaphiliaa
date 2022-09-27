package Module4;

public class Karyawan {
    int nik;
    String nama;
    int gajipokok;

    public Karyawan(int nik, String nama, int gajipokokk) {
        this.nik = nik;
        this.nama = nama;
        this.gajipokok = gajipokok;
    }

    public int getNik() {


        return nik;
    }

    public String getNama(){
        return nama ;
    }
    public int getGajiPokok(){
        return gajipokok;
    }

    public void hitungGaji() {
        double tunjanganTransport = gajipokok * 0.05;
        double tunjanganKinerja = gajipokok * 0.1;
        double totalSebelumPajak = gajipokok + tunjanganTransport + tunjanganKinerja;

        double pajak = totalSebelumPajak * 0.025;

        double total = totalSebelumPajak - pajak;

        System.out.println(" Rp. " + total);
    }
}



