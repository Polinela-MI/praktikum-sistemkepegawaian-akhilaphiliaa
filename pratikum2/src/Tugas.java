import java.util.*;
import java.lang.Math;

    public class Tugas {
        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int nik;
            String nama;
            float gajipokok;
            double hasil;
            System.out.println("Masukan Nama Kamu ");
            nama = input.nextLine();
            System.out.println("Masukan Nik Kamu ");
            nik = input.nextInt();
            System.out.println("Masukan Gaji Pokok Kamu ");
            gajipokok = input.nextFloat();
            hasil =  (gajipokok+(0.05 * gajipokok) + (0.1 * gajipokok)) -(0.025*gajipokok) ;
            System.out.println("NamaKamu : " +nama);
            System.out.println("Nik Kamu : " +nik);
            System.out.println("Gajih Bersih Kamu : " +hasil);

        }
    }


