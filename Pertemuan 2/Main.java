import.java.util.Scanner

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Bus b = new Bus();
        int pilih;

        System.out.println("==== BUS TRANS KOETARADJA ====");
        
        while(true){
            System.out.println("\n~~~~");
            System.out.println("MENU : ");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Pendapatan Bus");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            System.out.println();
            input.nextLine();
        
            switch(pilih)
            {
                case 1:
                    b.jumlahPenumpang();
                    break;
                case 2:
                    b.turun();
                    break;
                case 3:
                    b.pendapatan();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                System.out.println("Tidak ada pilihan");
            }
        }
    }
}