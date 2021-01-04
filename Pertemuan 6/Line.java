/**
 * Write a description of class Line here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Line
{
     private Point begin;
     private Point end;

    /* method constructor digunakan
    untuk menciptakan suatu objek dengan parameter*/
     public Line(int x1, int y1, int x2, int y2)
     {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
     }

     /* method constructor digunakan
    untuk menciptakan suatu objek dengan parameter*/
    public Line(Point begin, Point end)
    {
        this.begin = begin;
        this.end = end;
    }

    /* method Accessor digunakan untuk mengembalikan
    nilai dari begin*/
    public Point getBegin()
    { 
        return begin;
    }

    /* method Mutator digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    public void setBegin(Point begin)
    {
        this.begin = begin;
    }

    /* method Accessor ini yang digunakan untuk mengembalikan
    nilai dari end*/
    public Point getEnd()
    {
        return end;
    }

    /* method Mutator digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    public void setEnd(Point end)
    {
        this.end = end;
    }
}