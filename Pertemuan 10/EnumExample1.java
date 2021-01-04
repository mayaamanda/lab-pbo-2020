class EnumExample1{
 public enum Season { WINTER, SPRING, SUMMER, FALL}
 public static void main(String[] args) {
    for (Season s : Season.values())
  System.out.println(s); 
   }
}  

/**
	Outputnya berupa :
	WINTER
	SPRING
	SUMMER
	FALL
	
	dari variabel season bertipe enum yang telah diisi dapat dicetak dengan for each dengan menggunakan
	method .values()
*/ 