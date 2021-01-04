/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manajer extends Pegawai {
    private String departemen;

    /* method constructor ini digunakan
    untuk menciptakan suatu objek dengan parameter*/
    public Manajer(String nama, double gaji, String departemen)
    {
        super(nama, gaji);
        this.departemen = departemen;
    }

    /* method Mutator digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    public void setDepartemen(String departemen)
    {
        this.departemen = departemen;
    }

    /* method Accessor ini digunakan untuk mengembalikan
    nilai dari departemen*/
    public String getDepartemen()
    {
        return departemen;
    }
}