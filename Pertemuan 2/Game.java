import java.util.Scanner;

public class Game{
	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        while(true){
			System.out.println("LOMPAT SI KATAK LOMPAT!");
        	System.out.println("Pilih :");
        	System.out.println("1. Mulai\n2. Cara bermain");
			System.out.println("Dipilih guys : ");
        	int pilih = input.nextInt();

			switch(pilih) {
			case 1: System.out.println("Mulai");tebak();break;
			case 2: System.out.println("Pilih angka 1-25 untuk menebak dimana katak berada\n\n");break;
			default: System.out.println("EXIT!");
			continue;
			}
		}
	}


	public static void tebak(){
       Scanner input = new Scanner(System.in);
	   Scanner inputUser = new Scanner(System.in);

    	int batu = 1;
    	int min = 1;
    	int maks = 25;
    	int score = 0;
    	int point;
    	int tebak;
		int x = 1;

		while (batu <=20){
            System.out.println("Lompat si katak Lompat,Lompat!\n");
        for (int y=0; y<5; y++){            
                System.out.print("(");               
                for (int z=0; z<5; z++){                  
                    System.out.print(x);
                    x++;
                    if (z<4){   
                        System.out.print(")(");
                    }
                }
                System.out.print(")\n");
			}
			System.out.println("\nHayoo kataknya dimana ?");
            
            while(true){ 
                System.out.print("coba dipilih (1-25): ");               
                tebak = inputUser.nextInt();

                if(tebak >= 1 && tebak <= 25){
                    break;
                } else{
                    System.out.println("\n ihh enggak ada pilihannya lohh\n");
                }
            }

            point = (int) (min+Math.random()*(maks-min));
            if ( tebak == point){
                score += 10;
                System.out.println("\nCiee betol. Kataknya ada di "+point);
                System.out.println("Point : "+score);
                System.out.println();
            } else {
                System.out.println("\nYahh salahh. Kataknya ada di "+point);
                System.out.println("Point : "+score);
                System.out.println();
            }
            x = 1;
            batu++;
        }
        
        if(score >= 100){
            System.out.println("\nWahh kamu hebat");
        } else if(score >= 50 && score <= 100){
            System.out.println("Pintarrr");
        } else{
            System.out.println("Lebih teliti lagi\n");
        }
    }
}