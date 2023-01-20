import java.io.*;
import java.lang.*;
class PrimeNoException{
    public static void main(String args[]){
       try{
        int num=0;
        int count=0;
        int mod=0;
        DataInputStream dis =new DataInputStream(System.in);
        System.out.println("Enter a number");
        num=Integer.parseInt(dis.readLine());
        int i=num;
        while(i!=0){
           mod=mod+(num%i);
           if(mod==0){
        count++;
        i--;
           }
        if(count>2){
            System.out.println("Not prime");
            break;
        }
        }
       }catch(IOException e){System.out.println(e);} 
    }
}