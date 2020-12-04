public class UTSKomnum
{
    public static double f(double x, boolean angka)
    {
    if(angka) {
    return (Math.pow(x,3)) - (3*x) + 1;
 }
 else {
 return (Math.pow(x,3)) - (2 * Math.sin(x));
 }
 }

 public static double fT(double x, boolean angka)
 {
 if(angka) {
 return 3*(Math.pow(x,2)) - 3;
 }
 else {
 return 3*(Math.pow(x,2)) - (2 * Math.cos(x));
 }
 }
 public static double x(boolean angka)
 {
 if(angka) {
 return 2.0;
 }
 else {
 return 0.5;
 }
 }
 public static double newton(boolean angka)
 {
 System.out.println("Metode Newton : ");
 
 double x = x(angka);
 boolean i = true;
 double hasil = 0.0;

 double y1 = f(x, angka);
 double y2 = fT(x, angka);
 double x1;
 while(true) {
 x1 = x - (y1/y2);
 if(i == true) {
 hasil = x1;
 i = false;
 }
 y1 = f(x1, angka);
 y2 = fT(x1, angka);

 if(Math.abs(x-x1) == 0) { //asumsi e=0
 break;
 }
 x = x1;
 System.out.println("Akar x = " + x1 + "\nF(x) = " + y1 + "\n\n");

 }
 System.out.println("Akar terletak di x = " + x + "\nDengan nilai F(x)= " + y1 + "\n");
 return hasil;
 }
 public static void secant(double a1, boolean angka)
 {
 System.out.println("Metode Secant : ");
 double x0 = x(angka);
 double x1 = a1;
 double y0 = f(x0, angka);
 double y1 = f(x1, angka);
 while(true) {
 double x2 = x1 - (y1 * (x1 - x0) / (y1 - y0));
 //di asumsikan e = 0
 if(Math.abs(x2-x1) == 0) {
 break;
 }
 x0 = x1;
 x1 = x2;
 y0 = y1;
 y1 = f(x1, angka);
 System.out.println("Akar x = " + x1 + "\nF(x) = " + y1 + "\n\n");

 }
 System.out.println("Akar ada di x = " + x1 + "\nDengan nilai F(x) = " + y1 + "\n");
 }
 public static void main(String arg[])
 {
 boolean angka = true ;
 System.out.println(" soal a :");
 secant(newton(angka), angka);
 angka = false;
 System.out.println(" soal b :");
 secant(newton(angka), angka);
 }
}