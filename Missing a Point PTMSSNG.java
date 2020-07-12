//Java Solution
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	    int test=0;
	    try{test=Integer.parseInt(sc.readLine().trim());}catch(Exception e){}
	    while(test-->0){
	        int N=0;
	        try{N=Integer.parseInt(sc.readLine().trim());}catch(Exception e){}
	        N=N*4-1;
	        int x=0,y=0;
	        while(N-->0){
	           String s[]=new String[2]; 
	        
	            try{s=sc.readLine().trim().split(" ");}catch(Exception e){}
	            x=x^Integer.parseInt(s[0]);
	            y=y^Integer.parseInt(s[1]);
	        }
	        System.out.println(x+" "+y);
	    }
	}
}
