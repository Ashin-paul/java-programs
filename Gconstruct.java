class Gen <T,U> { //generic class
    T v1;
    U v2;
    Gen(T o1,U o2){ //generic constructor
        v1=o1;
        v2=o2;
        System.out.println(v1+" --- "+v2);
    }
}
class Gconstruct{
    public static void main(String args[]){
        Gen <String,Integer> g1 =new Gen("A",1111);
        Gen <Double,String> g2 =new Gen(11.11,"A");
    }
}