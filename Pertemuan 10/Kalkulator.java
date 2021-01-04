import java.util.Scanner;
public class Kalkulator {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.perhitungan();
    }

    protected void perhitungan() {
        InputHelper input = new InputHelper();

        String s1 = input.getInput("Masukkan angka: ");
        String s2 = input.getInput("Masukkan angka: ");
        String op = input.getInput("Pilih operasi (+ - * /):");

        double result = 0; 

        try {
            switch (op) {
                case "+":
                    result = MathHelper.penambahan(s1, s2);
                    break;
                case "-":
                    result = MathHelper.pengurangan(s1, s2);
                    break;
                case "*":
                    result = MathHelper.perkalian(s1, s2);
                    break;
                case "/":
                    result = MathHelper.pembagian(s1, s2);
                    break;
                default:
                    System.out.println("Operasi tidak dikenal!");
                    return;
            }

            System.out.println("Hasil: " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " +
e.getMessage());
        }
    }

    class InputHelper{
        public String getInput(String prompt) {
            System.out.print(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    } 
    }

/**
Pada kode program di atas mengandung exception handling dimana saat di run jika memasukkan
operasi yang tidak sesuai dengan instruksi akan menghasilkan peringatan berupa "Operasi tidak dikenal"
namun program tetap berjalan hingga selesai walau terjadi eror namun hal tersebut sudah teratasi
*/ 