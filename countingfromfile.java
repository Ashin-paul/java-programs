

//------------------------------------------------counting "a" in file----------------------------------------------------//

import java.io.*;
class countingfromfile
{
	public static void main(String args[])
	{
		try{
			int	count=0;
			FileInputStream f=new FileInputStream("E:\\ashin\\record\\created_using_java.txt");
			int i=f.read();				//reading as integer//
			while(i!=-1){
			char c=(char)i;				//converting to char//
			if(c=='a'){
			count++;
			}
			i=f.read();					//first letter will be looping infinitly if this not given//
			}
			System.out.println("a:"+count);
		}catch(IOException e){System.out.println(e);}		
	}
}