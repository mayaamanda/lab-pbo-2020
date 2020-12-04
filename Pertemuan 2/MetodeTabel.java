import java.util.*;

public class MetodeTabel {
    public static double y(double x) {
        double nilai= (x*x*x) - (2*x*x) - x + 1;
        return nilai;
    }
    public static void main(String[] args) {

        MetodeTabel uji = new MetodeTabel();
        Scanner input = new Scanner(System.in);
        System.out.print("masukan batas Bawah (Xbawah) : ");
        double xBawah = input.nextDouble();
        System.out.print("masukan batas Atas (Xatas) : ");
        double xAtas = input.nextDouble();
        System.out.print("masukan jumlah pembagian (N) : ");
        int n = input.nextInt();
        
        double h = (xAtas - xBawah) / n;

        double x[] = new double[n + 1];
        double y[] = new double[n + 1];

        for (int i = 0; i <= n; i++) {
            x[i] = xBawah + (i * h);
            y[i]= y(x[i]);
            System.out.println("nilai x[" +i+ "] = " + x[i] + " & nilai y[" +i+ "] = " + y[i]);
        }

        for (int j=0;j<=(n-1);j++) {
            if(y[j] * y[j+1] < 0) {
                System.out.println(" " + x[j] + " dan " + x[j + 1]);
                if (Math.abs (y[j]) < Math.abs(y[j+1])) {
                    System.out.println("Akar lebih dekat ke " + x[j]);
                } else {
                    System.out.println("Akar lebih dekat ke  " + x[j+1]);
                }
            }
        }
    }
}