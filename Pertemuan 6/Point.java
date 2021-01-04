/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
     private int x;
     private int y;

     /* method constructor digunakan
     untuk menciptakan suatu objek*/
     public Point()
     {
         x = 0;
         y = 0;
     }

     /* method constructor digunakan
     untuk menciptakan suatu objek dengan parameter*/
     public Point(int x, int y)
     {
         this.x = x;
         this.y = y;
     }

     /* method Accessor ini digunakan untuk mengembalikan
     nilai dari x*/
     public int getX()
     {
         return this.x;
     }

     /* method Mutator digunakan untuk mengubah
     suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
     public void setX(int x)
     {
         this.x = x;
     }

     /* method Accessor ini digunakan untuk mengembalikan
     nilai dari y*/
     public int getY()
     {
         return this.y;
     }

     /* method Mutator digunakan untuk mengubah
     suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
     public void sety(int y)
     {
         this.y = y;
     }

     /*method ini di gunakan untuk menampilkan titik x dan y*/
     public String toString()
     {
         return "Titik dengan x=" +x+ " y=" +y ;
     }
}