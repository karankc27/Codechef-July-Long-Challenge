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
	    try{
	        test=Integer.parseInt(sc.readLine());
	        
	    }catch(Exception e){}
	    while(test-->0){
	        int N=0;
	        try{
	            N=Integer.parseInt(sc.readLine());
	        }catch(Exception e){}
	        StringBuilder ans=new StringBuilder(); 
	        int morty=0,chef=0;
	        for(int i=0;i<N;i++){
	            String s[]=new String[2];
	            try{
	                s=sc.readLine().trim().split(" ");
	            }catch(Exception e){}
	            int a=Integer.parseInt(s[0]);
	            int b=Integer.parseInt(s[1]);
	            int x=0,y=0;
	            while(a>0){
	                x+=a%10;
	                a/=10;
	            }
	            while(b>0){
	                y+=b%10;
	                b/=10;
	            }
	            if(x==y){
	                morty++;
	                chef++;
	            }
	            else if(x>y)chef++;
	            else morty++;
	        }
	        if(chef==morty)System.out.println("2 "+chef);
	        else if(chef>morty)System.out.println("0 "+chef);
	        else System.out.println("1 "+morty);
	    }
	}
}
