package Module4;

public class Manajer extends  Karyawan {
    private int pencapaiankerja;
    private int Bonus;
    private int GajiPerMinggu;
    public Manajer(int nik, String nama, int gajipokok) {
        super(nik, nama, gajipokok);
    }
    public int getPencapaiankerja() {
        return pencapaiankerja;
    }
    public void setPencapaiankerja(int pencapaiankerja) {
        this.pencapaiankerja = pencapaiankerja;
    }
    public int getBonus() {
        return Bonus;
    }
    public void setBonus(int bonus) {
        Bonus = bonus;
    }
    @Override
    public void perhitungangaji() {
        super.perhitungangaji();
        double Tunjangan_Transportasi = GajiPerMinggu * 0.1;
        double TotalGaji = GajiPerMinggu + Tunjangan_Transportasi;
        if (pencapaiankerja > 50) {
            Bonus = GajiPerMinggu * (pencapaiankerja + 100);
            TotalGaji = TotalGaji + Bonus;
            double Pajak = TotalGaji * 0.025;
            double Total = TotalGaji - Pajak;
        }
    }
}