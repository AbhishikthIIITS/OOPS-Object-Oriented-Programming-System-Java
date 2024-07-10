
import java.lang.String;

class Book{
     String title;
    private String author;
    private String ISBN;
    private int available;
    private int issued;

    public Book(){
        setTitle("book1");
        setAuthor("author1");
        setISBN("164237738");
        setAvailable(0);
        setIssued(0);
    }

    public Book(String s1){
        setTitle(s1);
    }

    public Book(int s1){
        setIssued(s1);
    }

    public Book(int s1,String s2, String s3){
        setAvailable(s1);
        setAuthor(s2);
        setISBN(s3);
    }

    public Book(String s1, String s2, String s3, int i1, int i2){
        setTitle(s1);
        setAuthor(s2);
        setISBN(s3);
        setAvailable(i1);
        setIssued(i2);
    }

    public void setTitle(String s1){
        this.title = s1;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String s1){
        author = s1;
    }

    public String getAuthor(){
        return author;
    }

    public void setISBN(String s1){
        this.ISBN = s1;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setAvailable(int s1){
        this.available = s1;
    }

    public int getAvailable(){
        return available;
    }

    public void setIssued(int s1){
        this.issued = s1;
    }

    public int getIssued(){
        return issued;
    }
    public void searchBook(String s1,Book [] b){
        for(int i = 0;i<5;i++){
            //System.out.println(b[i].getTitle());
            if((b[i].getTitle().contains(s1)==true)||(b[i].getAuthor().contains(s1)==true)){
                printBookDetails(b[i]);
            }
        }
    }

    public void issueBook(String s1,Book [] b){
        for(int i = 0;i<5;i++){
            if(s1.compareTo(b[i].ISBN)==0){
                b[i].available--;
                b[i].issued++;
            }
        }
    }

    public void returnBook(String s1,Book [] b){
        for(int i = 0;i<5;i++){
            if(s1.compareTo(b[i].ISBN)==0){
                b[i].available++;
                b[i].issued--;
            }
        }
    }

    public void printBookDetails(Book b){
    System.out.println("Title:- " + b.getTitle());
    System.out.println("Author:- " + b.getAuthor());
    System.out.println("ISBN:- " + b.getISBN());
    System.out.println("Available books:- " + b.getAvailable());
    System.out.println("Issued books:- " + b.getIssued()); 
    }
    
    public void printUpperCase(String s1, Book [] b){
        for(int i = 0;i<5;i++){
            if(s1.compareTo(b[i].ISBN)==0){
                System.out.println("Title:- " + b[i].getTitle().toUpperCase());
                System.out.println("Author:- " + b[i].getAuthor().toUpperCase());
                System.out.println("ISBN:- " + b[i].getISBN());
                System.out.println("Available books:- " + b[i].getAvailable());
                System.out.println("Issued books:- " + b[i].getIssued());
            }
        }
    }

    public void addBook(String s1, String s2, String s3, int i1,int i2,Book [] b){
        int v = 0;
        for(int i = 0;i<5;i++){
            if(s3.compareTo(b[i].ISBN)==0){
                b[i].available+=i1;
                v++;
            }
        }
        if (v == 0){
            b[5] = new Book(s1,s2,s3,i1,i2);
        }
    }

    public void updateBookName(String s1,String s2, Book [] b){
        for(int i = 0;i<5;i++){
            if(b[i].title.contains(s1)==true){
                b[i].setTitle(s2);
                System.out.println("The new details of the book are:- ");
                printBookDetails(b[i]);
            }
        }
    }
}

public class LibraryApplication_S20210010044 {
    
    public static void showBooks(Book [] b){
        Book b2 = new Book();
        for(int i=0;i<6;i++){
            b2.printBookDetails(b[i]);
        }
    }
    public static void main(String[] Args){
        Book b[] = new Book[7];
        Book b1 = new Book();
        b1.title ="blablabla";
        b[0] = new Book("Java How to Program","Paul Deitel, Harvey Deitel","9789353062033",15,10);
        //b[1] = new Book("Junkwraith");
        b[1] = new Book("Junkwraith","Ellinor Richey","9781603095006",18,12);
        //b[1] = new Book(12);
        b[2] = new Book();
        b[3] = new Book("Let Us C","Yashavant Kanetkar","9788183331630",25,7);
        b[4] = new Book("Purely Functional Data Structures","Chris Okasaki","9780521631242",12,18);

        b1.searchBook("Java",b);
        b1.issueBook("9788183331630",b);
        b1.returnBook("9780521631242",b);
        b1.printBookDetails(b[1]);
        b1.printUpperCase("9781603095006",b);
        b1.addBook("Jumping Into C++","Alex Allain","9780988927803",8,10,b);
        b1.updateBookName("Data","Info", b);
        showBooks(b);
    }
}
