import java.util.ArrayList;
import java.util.LinkedList;


public class CF 
{
    public static void main(String[] args) 
    {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.set(1, "Aryan");

        System.out.println("ArrayList elements: " + arrayList);

        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('A');
        linkedList.add('B');
        linkedList.add('C');

        System.out.println("LinkedList elements: " + linkedList);
    }
}