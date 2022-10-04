package Module4;

import Module4.Karyawan;

public class Main {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i += 3) {
            int nik = Integer.parseInt(args[i]);
            int gajiPokok = Integer.parseInt(args[i + 2]);

            Karyawan k = new Karyawan(nik, args[i + 1], gajiPokok);

        }
    }
}