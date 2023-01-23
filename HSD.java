import java.util.*;
class HSD {
    
    public static void main(String args[]){
        HashSet<String> hs=new HashSet<String>();
        hs.add("A");
        hs.add("D");
        hs.add("D"); //will not take no duplicats in Hash
        for(String a:hs){System.out.println(a);}
    }
}