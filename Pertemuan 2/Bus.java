import java.util.Scanner;
import java.util.ArrayList;

public class Bus
{
    private ArrayList <Penumpang> penumpangBiasa;
    private ArrayList <Penumpang> penumpangPrioritas;
    private ArrayList <Penumpang> penumpangBerdiri;
    private int OngkosBus = 2000;
    private int totalPendapatan  = 0;
    int id, umur;
    String nama, hamil;
    Scanner input = new Scanner(System.in);

    public Bus()
    {
        penumpangBiasa = new ArrayList <Penumpang>();
        penumpangPrioritas = new ArrayList <Penumpang>();
    }

    public ArrayList<Penumpang> getPenumpangBiasa(){
        return penumpangBiasa;
    }
    
    public ArrayList<Penumpang> getPenumpangPrioritas(){
        return penumpangPrioritas;
    }

    public ArrayList<Penumpang> getPenumpangBerdiri(){
    	return penumpangBerdiri;
    }

    public int getJumlahPenumpangBiasa(){
        return penumpangBiasa.size();

    }

    public int getJumlahPenumpangPrioritas(){
        return penumpangPrioritas.size();
    }

    public int getJumlahPenumpangBerdiri(){
    	return penumpangBerdiri.size();
    }

    public int getJumlahpenumpang(){
        return penumpangBiasa.size() + penumpangPrioritas.size() + penumpangBerdiri.size();
    }

    public void jumlahPenumpang()
    {
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Id : ");
        int id = input.nextInt();
        System.out.print("Umur : ");
        int umur = input.nextInt();
        System.out.print("Hamil(y/n) : ");
        Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("N") ? true : false;

        Penumpang penumpang = new Penumpang(nama, id, umur, hamil, id);
        naikPenumpang(penumpang);
    }

    public boolean naikPenumpang(Penumpang penumpang){
        if(penumpangBiasa.size() < 17 && penumpang.getUmur() > 10 || penumpang.getUmur() < 60 || penumpang.getHamil()==false){
            System.out.println("Penumpang yang bernama " +penumpang.getNama()+ " ditambahkan");
            penumpangBiasa.add(penumpang);
            penumpang.kurangiSaldo(this.OngkosBus);
            this.totalPendapatan += this.OngkosBus;
            return true;
        }
        else if(penumpangPrioritas.size() < 5 && penumpang.getUmur() < 10 || penumpang.getUmur() > 60 || penumpang.getHamil()==true){
            System.out.println("Penumpang yang bernama " +penumpang.getNama()+ " ditambahkan");
            penumpangPrioritas.add(penumpang);
            penumpang.kurangiSaldo(this.OngkosBus);
            this.totalPendapatan += this.OngkosBus;
            return true;
        }
        else if(penumpangBerdiri.size() < 20){
        	System.out.println("Penumpang yang bernama " +penumpang.getNama()+ " ditambahkan");
        	penumpangBiasa.add(penumpang);
        	penumpang.kurangiSaldo(this.OngkosBus);
            this.totalPendapatan += this.OngkosBus;
            return true;
        }
        else{
            System.out.println("Penumpang yang bernama " +penumpang.getNama()+ " gagal ditambahkan");
            return false;
        }
    }

    public void turun()
    {
        System.out.print("Nama yang ingin dihapus : ");
        String nama = input.next();
        turunkanPenumpang(nama);
    }
    
    public boolean turunkanPenumpang(String nama){
        for (int i = 0; i < penumpangBiasa.size(); i++) {
            if (nama.equals(penumpangBiasa.get(i).getNama())) {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang Telah Turun");
                return penumpangBiasa.equals(nama);
            } else {
                System.out.println("Penumpang" +nama+ " Tidak Ada ");
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i++) {
            if (nama.equals(penumpangPrioritas.get(i).getNama())) {
                penumpangPrioritas.remove(i);
                System.out.println("Penumpang Telah Turun");
                return penumpangPrioritas.equals(nama);
            } else {
                System.out.println("Penumpang" +nama+ " Tidak Ada ");
                return false;
            }
        }

        for (int i = 0; i < penumpangBerdiri.size(); i++){
        	if(nama.equals(penumpangBerdiri.get(i).getNama())){
        		penumpangBerdiri.remove(i);
        		System.out.println("Penumpang Telah Turun");
        		return penumpangBerdiri.equals(nama);
        	}else {
        		System.out.println(nama+ "TIdak ada");
        		return false;
        	}
        }
        return penumpangPrioritas.equals(nama);
    }

    public String toString(){
        String namaPenumpangBiasa =" ";
        String namaPenumpangPrioritas =" ";
        String namaPenumpangBerdiri =" ";
        boolean kosong1 = penumpangBiasa.isEmpty();
        boolean kosong2 = penumpangPrioritas.isEmpty();
        boolean kosong3 = penumpangBerdiri.isEmpty();

        for(Penumpang penumpang : penumpangBiasa){
            namaPenumpangBiasa += penumpang.getNama().toString();
        }
        for(Penumpang penumpang : penumpangPrioritas){
            namaPenumpangPrioritas += penumpang.getNama().toString();
        }
        for(Penumpang penumpang : penumpangBerdiri){
        	namaPenumpangBerdiri += penumpang.getNama().toString();
        }

        if(kosong1 == true){
            System.out.println("Penumpang biasa : kosong");
        }
        else{
            System.out.println("Penumpang biasa : " +namaPenumpangBiasa);
        }

        if(kosong2 == true){
            System.out.println("Penumpang prioritas : kosong");
        }
        else{
            System.out.println("Penumpang prioritas : " +namaPenumpangPrioritas);
        }

        if(kosong3 == true){
        	System.out.println("Penumpang berdiri : kosong");
        } else {
        	System.out.println("Penumpang berdiri : " +namaPenumpangBerdiri);
        }

        return "Penumpang biasa = "+namaPenumpangBiasa+ "Penumpang prioritas = "+namaPenumpangPrioritas+ 
        "Penumpang berdiri = " +namaPenumpangBerdiri+ "total semua penumpang = "+getJumlahpenumpang()+"\n";
    }

    public void pendapatan(){
        System.out.println("Pendapatan Bus : " + totalPendapatan);
    }
}