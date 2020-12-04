import java.util.*;

public class testabel {
    public double y(double x) {
        double hasil = (x*x*x) - (2*(x*x) - x + 1);
        return hasil;
    }

    public static void main(String[] args) {
        testabel uji = new testabel();
        Scanner input = new Scanner(System.in);
        System.out.print("masukan batas xBawah :");
        double xBawah = input.nextDouble();
        System.out.print("masukan batas xAtas :");
        double xAtas = input.nextDouble();
        System.out.print("masukan jumlah pembagi N :");
        int N = input.nextInt();

        double h = (xAtas - xBawah) / N;

        double x[] = new double[N + 1];
        double y[] = new double[N + 1];

        for (int i = 0; i <= N; i++) {
            x[i] = xBawah + (i * h);
            y[i] = y(x[i]);

            System.out.println("nilai x[" + i + "]= " + x[i] + "& nilai y[" + i + "]=" + y[i]);
        }

        for (int j=0;j<=(N-1);j++) {
            if(y[j] * y[j+1] < 0) {
                System.out.println(" " + x[j] + " dan " + x[j + 1]);
                if (Math.abs(y[j]) < Math.abs (y[j+1])) {
                    System.out.println("Jawabannya " + x[j]);
                } else {
                    System.out.println("Jawabannya " + x[j+1]);
                }
            }
        }
    }
}