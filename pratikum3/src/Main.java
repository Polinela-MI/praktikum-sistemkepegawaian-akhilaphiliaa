public class Main {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i += 3) {
            int nik = Integer.parseInt(args[i]);
            int gajiPokok = Integer.parseInt(args[i + 2]);

            karyawan k = new karyawan(nik, args[i + 1], gajiPokok);

        }
    }
    public static void main(String[] args) {
        String[] kehadiran = {"5=H!4-H", "5-H!4-S", "S-A!4-H"};
        int pegawai5 = 0;
        int pegawai4 = 0;
        for (i = 0; i < kehadiran.length; i++) {//element yang di kehadiran
            String[] kehadiranpegawai = kehadiran[i].split("!");//5-h 4-h

            for (int j = 0; j < kehadiranpegawai.length; j++) {
                String[] dataPegawai = kehadiranpegawai[j].split("_");//5 h
                if (Integer.parseInt(dataPegawai[0]) == 5) {
                    if (dataPegawai[1].equals("H")) {
                        pegawai5++;
                    }
                } else if (Integer.parseInt(dataPegawai[0]) == 4) {
                    if (dataPegawai[1].equals("H")) {
                        pegawai4++;
                    }
                    System.out.print(k.getNik() + "_" + k.getNamaLengkap());
                    k.hitungGaji();
                }
            }
        }
    }
}