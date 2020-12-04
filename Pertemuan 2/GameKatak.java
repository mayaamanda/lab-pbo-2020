import java.util.Scanner;

public class GameKatak{
	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        while(true){
			System.out.println("Lompat si katak Lompat, Lompat!");
        	System.out.println("Pilih :");
        	System.out.println("1. Mulai\n 2. Cara bermain");
			System.out.println("Dipilih : ");
        	int pilih = input.nextInt();

			switch(pilih) {
			case 1: 
            System.out.println("Mulai");tebak();break;
			case 2: 
            System.out.println("Pilih angka 1-25 untuk menebak dimana katak berada\n\n");break;
			default: 
            System.out.println("EXIT!");
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
			System.out.println("\nKataknya dimana ?");
            
            while(true){ 
                System.out.print("Silahkan dipilih (1-25): ");               
                tebak = inputUser.nextInt();

                if(tebak >= 1 && tebak <= 25){
                    break;
                } else{
                    System.out.println("\nGak ada pilihannya\n");
                }
            }

            point = (int) (min+Math.random()*(maks-min));
            if ( tebak == point){
                score += 10;
                System.out.println("\nAsyiappp kamu benar. Kataknya ada di "+point);
                System.out.println("Point : "+score);
                System.out.println();
            } else {
                System.out.println("\nWaduhh kamu salahh bro. Kataknya ada di "+point);
                System.out.println("Point : "+score);
                System.out.println();
            }
            x = 1;
            batu++;
        }
        
        if(score >= 100){
            System.out.println("\nWahh kamu jenius bro");
        } else if(score >= 50 && score <= 100){
            System.out.println("you the best");
        } else{
            System.out.println("Kamu belum beruntung\n");
        }
    }
}
/*
https://youtu.be/wOqlzs6DVb8
*/