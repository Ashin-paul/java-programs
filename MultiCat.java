import java.io.*;
import java.lang.*;
class MultiCat{
    public static void main(String args[]){
        try{
            int a[];
            int n=0; 
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter the limit");
            n=Integer.parseInt(dis.readLine());
            a=new int[n];
            System.out.println("Enter the array elements");
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(dis.readLine());
            }
        }
        catch(IOException e){System.out.println(e);}
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        catch(NumberFormatException e){System.out.println(e);}
        catch(OutOfMemoryError e){System.out.println(e);}
    }
}