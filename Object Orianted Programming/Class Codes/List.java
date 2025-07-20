import java.util.*;

public class List 
{
    public static void main(String[] args) 
    {
        ArrayList A1 = new ArrayList();
        A1.add("Aryan");
        A1.add("Dilipbhai");
        A1.add("Langhanoja");
        System.out.println("ArrayList Elemnts:-");
        System.out.println("\t"  +A1);

        LinkedList l1 = new LinkedList();
        l1.add("Mumbai");
        l1.add("Kolkata");
        l1.add("Vadodara");
        System.out.println();
        System.out.println("LinkedList Elements");
        System.out.print("\t" + l1); 
    }    
}
