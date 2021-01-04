public class TestFinallyBlock2{  
 public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(ArithmeticException e){
   System.out.println(e);
  }  
  finally{
   System.out.println("finally block is always executed");
  }  
  System.out.println("rest of the code...");  
  }  
}   

/**
  Outputnya berupa :
  java.lang.ArithmeticException: / by zero
  finally block is always executed
  rest of the code...
  Eror di atas berupa arithmeticexcption 
*/ 