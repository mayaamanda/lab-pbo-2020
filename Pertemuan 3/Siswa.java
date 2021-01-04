/**
 * Write a description of class Siswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siswa
{
    // instance variables - replace the example below with your own
    private int nrp;
    private String nama;

    /**
     * Constructor for objects of class Siswa
     */
    public Siswa(int nrpx, String namax)
    {
        // initialise instance variables
        this.nrp = nrpx;
        this.nama = namax;
    }

    public void setNrp(int nrpx)
    {
        this.nrp = nrpx;
    }

    public int getNrp()
    {
        return this.nrp;
    }

    public void setNama(String namax)
    {
        this.nama = namax;
    }

    public String getNama()
    {
        return this.nama;
    }
}