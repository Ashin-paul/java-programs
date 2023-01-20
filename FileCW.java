import java.io.*;
import java.lang.*;
class FileCW{
public static void main(String args[]){
    try{
    FileOutputStream f=new FileOutputStream("newlycreated.txt");
    String x ="12313";
    f.write(x.getBytes());
    }catch(IOException e){System.out.println(e);}
}
}