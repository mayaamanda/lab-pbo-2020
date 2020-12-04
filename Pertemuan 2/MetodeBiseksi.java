import java.util.Scanner;
public class MetodeBiseksi{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

        float a,b,e,fa,fb;
        float xr = 0;
        float fxr = 0;
        int n;
       
        System.out.print("Batas bawah : ");
        a=input.nextFloat();
        System.out.print("Batas atas : ");
        b=input.nextFloat();
        System.out.print("Toleransi eror : ");
        e=input.nextFloat();
        System.out.print("jumlah pembagi N : ");
        n=input.nextInt();
        
        fa = (a*a*a) - (7*a) + 1;
        fb = (b*b*b) - (7*b) + 1; 

        if ((fa*fb) > 0) {

            System.out.print("Tidak ada akar");
        }
        else{

            int kondisi = 1;
            int iterasi = 0;

           while (kondisi == 1) {

                iterasi++;
                xr = (a+b)/2;
                fxr = (xr*xr*xr)-(7*xr)+1;

                if ((Math.abs(b-a) < e)||(iterasi > n)) {
                    
                    kondisi = 0;
                }else
                {
                    if ((fa*fxr) < 0 ) {

                        b = xr;
                        fb = fxr;
                    }
                        
                     else{
                        a = xr;
                        fa = fxr;
                        }
                }

               
           }
           
            System.out.println("nilai xr = " + xr);
            System.out.println("nilai f(xr) = " + fxr);
           

	}
}
}