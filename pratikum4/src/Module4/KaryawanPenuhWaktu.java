package Module4;

public class KaryawanPenuhWaktu extends Karyawan{
    private int TotalJamKerja;
    private int GajiPerJam;
    private int Lembur;
    private int Penalty;

    public KaryawanPenuhWaktu(String nama, int gajipokok,int TotalJamKerja) {
        super(nama, gajipokok);
    }
    public int getTotalJamKerja(){
        return TotalJamKerja;
    }

    public void setTotalJamKerja(int totalJamKerja) {
        TotalJamKerja = totalJamKerja;
    }

    public int getLembur() {
        return Lembur;
    }

    public void setLembur(int lembur) {
        Lembur = lembur;
    }

    public int getPenalty() {
        return Penalty;
    }

    public void setPenalty(int penalty) {
        Penalty = penalty;
    }
    @Override
    public void perhitungangaji(){
        super.perhitungangaji();
        double GajiPerMinggu = GajiPerJam * 40;
        double Tunjangan_Transportasi = GajiPerMinggu * 0.05;
        double TotalGaji = GajiPerMinggu + Tunjangan_Transportasi;

        if (TotalJamKerja > 40);
        Lembur = (TotalJamKerja - 40) * (getGajipokok() + 5000);
        TotalGaji = TotalGaji + Lembur;

        if (TotalJamKerja < 40);
        Penalty = ( 240 - TotalJamKerja) * getGajipokok();
        TotalGaji = TotalGaji - Penalty;

        double Pajak = TotalGaji * 0.025;
        double Total = TotalGaji - Pajak;

    }
}
