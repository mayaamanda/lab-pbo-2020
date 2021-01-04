/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /* 
    method constructor ini digunakan
    untuk menciptakan suatu objek 
    */
    public Book(String bookAuthor, String bookTitle, int pages, String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 0;
        refNumber = ("");
    }

    /* 
    method Accessor ini digunakan untuk mengembalikan
    nilai dari author
    */
    public String getAuthor()
    {
        return author;
    }

    /* 
    method Accessor ini digunakan untuk mengembalikan
    nilai dari title
    */
    public String getTitle()
    {
        return title;
    }

    /*
    method ini di gunakan untuk menampilkan author
    */
    public void printAuthor()
    {
        System.out.println(author);
    }

    /*
    method ini di gunakan untuk menampilkan tittle
    */
    public void printTitle()
    {
        System.out.println(title);
    }

    /* 
    method Accessor ini digunakan untuk mengembalikan
    nilai dari page
    */
    public int getPages()
    {
        return pages;
    }

    /*method ini di gunakan untuk menampilkan author title pages dan terdapat juga kondisi*/
    public void printDetails()
    {
        System.out.println(author);
        System.out.println(title);
        System.out.println(pages);
        if(refNumber == ("")) {
            System.out.println("zzz");
        }
        else {
            System.out.println(refNumber);
        }
    }

    /* 
    method Mutator ini digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
}