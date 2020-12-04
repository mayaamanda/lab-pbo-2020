import java.util.Scanner;

	public class GameLompatKatak{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			while(true){
				System.out.println("Lompat si katak Lompat, Lompat!");
				System.out.println("pilih :");
				System.out.println("1. MULAI\n 2. CARA BERMAIN");
				System.out.println("DIPILIH :");
				int pilih = input.nextlnt();

			switch(PILIH){
			case 1:
				System.out.println("Mulai");tebak();break;
			case 2:
				System.out.println("pilih angka 1-25 untuk menebak dimana katak berada\n");break;
				default:System.out.println("EXIT");
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

			while(batu <=20){
				System.out.println("Lompat si katak Lompat, Lompat!\n");
					for (int y=0; y<5; y++){
						System.out.print(x);
							for (int z=0; z<5; z++){
							System.out.print (x);
						x++;
						if (z<4){
							System.out.print(")(");
						}
					}
					System.out.print(")\n");
			}
			System.out.println("\nHohoo kataknya dimana ?");

			while(true){
				System.out.print("Silahkan dipilih (1-25):");
				tebak = inputUser.nextlnt();
			}
		}

				if(tebak >= 1 && tebak <= 25){
				break;
			} else{
				System.out.println("sorry bro gak ada pilihannya\n");

		}
	}
	point = (int) (min+Math.random()*(maks-min));
            if ( tebak == point){
                score += 10;
                System.out.println("\nAsyiappp kamu benar. Kataknya ada di "+point);
                System.out.println("Point : "+score);
                System.out.println();
            } else {
                System.out.println("\nWalahh kamu salahh bro. Kataknya ada di "+point);
                System.out.println("Point : "+score);
                System.out.println();
            }
            x = 1;
            batu++;
        
        if(score >= 100){
            System.out.println("\nWahh kamu jenius bro");
        } else if(score >= 50 && score <= 100){
            System.out.println("you the best");
        } else{
            System.out.println("Kamu belum beruntung\n");
        }

    }
}