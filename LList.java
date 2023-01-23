import java.util.*;
class LList {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("D");
        ll.add("A");
        ll.add("C");
        for(String a:ll){System.out.println(a);}
        ll.addFirst("first");
        ll.removeFirst();
    }
}