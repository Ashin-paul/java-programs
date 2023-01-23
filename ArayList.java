class ArayList {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("A");
        al.add("D");
        al.add("C");
        for(String a:al){System.out.println(al);}
        al.add(1,"asaa");
        for(String a:al){System.out.println(al);}
    }
}