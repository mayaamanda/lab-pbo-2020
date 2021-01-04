public class Testtrycatch2{  
 public static void main(String args[]){  
  try{  
        int data=10/0;  
     }catch(ArithmeticException e){System.out.println(e);}  

  System.out.println("rest of the code...");  
 }  
}  

/**
	Outputnya berupa :
	java.lang.ArithmeticException: / by zero
	rest of the code...

	Artinya eror pada kode program sudah dihandle dengan menerapkan konsep exception handling
	sehingga saat di run menghasilkan eror, namun karena sudah dihandle akan diprint
	erornya namun program tetap berjalan hingga selesai
*/
