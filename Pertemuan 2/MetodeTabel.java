import java.util.Scanner;
/*
    SOAL
    Batas Bawah : 1
    Batas Atas : 3
    Iterasi Maks : 3

    Hasil : 
    Akar diantara 1.6666666666666665 dan 2.333333333333333
    Akar lebih dekat ke x[2] = 2.333333333333333
*/

public class MetodeTabel{
    public static double y(float x) {
        double hasil= Math.pow(x, 2) - 2 * Math.pow(x, 2) - x + 1;
        return hasil;
    }
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);

        System.out.print("Batas bawah(Xbawah) : ");
        double xBawah= input.nextDouble();
        System.out.print("Batas atas(Xatas) : ");
        double xAtas= input.nextDouble();
        System.out.print("Jumlah pembagian(N) : ");
        int n= input.nextInt();

        double h= (xAtas-xBawah)/n;
        
        double[] x= new double [n+1];
        double[] y= new double [n+1];

        for(int i=0; i<=n; i++){
            x[i]= i * h + xBawah;
            y[i]= y(-x[i]);
            System.out.println("x[" +i+ "] = " +x[i]+ "\ty[" +i+ "] = " +y[i]);
        }

        for(int j=0; j<n; j++){
            if(y[j]*y[j+1]<0){
                System.out.println("Akar diantara " +x[j]+ " dan " +x[j+1]);
                if(Math.abs(y[j]) < Math.abs(y[j + 1])){
                    System.out.println("Akar lebih dekat ke x[" +j+ "] = " +x[j]);
                }
                else{
                    System.out.println("Akar lebih dekat ke x[" +(j+1)+ "] = " +x[j+1]);
                }
            }
        }
    }
}