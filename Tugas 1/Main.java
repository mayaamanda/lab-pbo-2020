/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Main {
    static void menu() {
        int play;
        int mode = 0;

        Bus b1 = new Bus();
        Scanner input = new Scanner(System.in);

        System.out.println("============== BUS TRANS KOETA RADJA ===============");
        System.out.println("MENU");
        System.out.println("1. Naikkan Penumpang");
        System.out.println("2. Turunkan Penumpang");
        System.out.println("3. Lihat Penumpang");
        System.out.print("Pilih nomor: ");
        play = input.nextInt();

        while (play != 4) {
            switch (play) {
                case 1:
                    while (mode != 2) {
                        System.out.print("Nama : ");
                        String nama = input.next();
                        System.out.print("Masukan Umur: ");
                        int umur = input.nextInt();
                        System.out.print("Hamil [y/n]: ");
                        Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("N") ? true : false;

                        Penumpang penumpang = new Penumpang(nama, umur, hamil);
                        b1.naikPenumpang(penumpang);
                        b1.toString();
                        System.out.println("");
                        System.out.print("Naikkan?[1.Yes 2.No] :");
                        mode = input.nextInt();
                        System.out.println("============================");
                    }
                    break;
                case 2:
                    System.out.print("\nMasukan nama yang ingin dihapus: ");
                    String nama = input.next();
                    b1.turunkanPenumpang(nama);
                    b1.toString();
                    System.out.println("============================");
                    System.out.println("");
                    break;
                case 3:
                    b1.toString();
                    System.out.println("============================");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }

            System.out.println("===== BUS TRANS KOETA RADJA =====");
            System.out.println("MENU");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.print("Pilih nomor: ");
            play = input.nextInt();

        }
    }
}