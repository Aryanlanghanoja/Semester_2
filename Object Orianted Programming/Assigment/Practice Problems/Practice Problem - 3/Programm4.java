import java.util.*;

class Library
{
    int no_of_books;

    Library()
    {

    }

    Library(int no_of_books)
    {
        this.no_of_books = no_of_books ;

        System.out.println("The Number Of Books In Library Is "+ this.no_of_books);
    }
}

public class Programm4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

        Library L1 = new Library();

        System.out.print("Enter The Number Of Books:-");
        L1.no_of_books = sc.nextInt();

        Library L2 = new Library(L1.no_of_books);
        
    }
}
