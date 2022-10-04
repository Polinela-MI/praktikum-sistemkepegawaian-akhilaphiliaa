package Module4;

public class Karyawan {
    public static int currentNIK=0;

        private int nik;
        private String namalengkap;
        private int gapok;
        private int tunjanganTransportasi;
        private int misc;
        private int pajak;


    public Karyawan( String nama,int gapok,int tunjanganTransportasi,int misc,int pajak){
        this.nik = currentNIK;
        currentNIK++;
        this.namalengkap = nama;
        this.gapok = gapok;
        this.tunjanganTransportasi = tunjanganTransportasi;
        this.misc = misc;
        this.pajak = pajak;
    }


    public int getNik () {
        return nik;
    }
    public void setNik(int nik) {
        this.nik = nik;
    }
    public String getNamaLengkap () {
        return namalengkap;
    }
    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }
        public int gajiPokok () {
        return gapok;
    }
    public int getGajipokok() {
        return gapok;
    }
    public double tunjanganTransportasi(){
        return tunjanganTransportasi;
    }
    public double misc(){
        return misc;
    }
    public double pajak(){
        return pajak;
    }
        public void perhitungangaji () {
        double Tunjangan_Transportasi = gapok * 0.025;
        double Tunjangan_kinerja = gapok * 0.1;
        double Tunjangan_makan = 3500 * 20;
        double TotalSebelumPajak = gapok + Tunjangan_Transportasi + Tunjangan_kinerja + Tunjangan_makan;
        double pajak = TotalSebelumPajak * 0.025;
        double total = TotalSebelumPajak - pajak;
        System.out.println(" RP " + total);
    }
    }



