import java.io.*;
class RWFappend {
    public static void main(String args[]){
        try{
            RandomAccessFile r=new RandomAccessFile("123.txt","rw");
            r.write("low".getBytes());
            r.seek(r.length());
        }catch(IOException e){System.out.println(e);}
    }
}