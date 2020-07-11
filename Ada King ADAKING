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
	    try{ test=Integer.parseInt(sc.readLine().trim());}catch(Exception e){}
	    while(test-->0){
	        int n=0;
	        try{ n=Integer.parseInt(sc.readLine().trim());}catch(Exception e){}
	        StringBuilder res=new StringBuilder();
	        for(int i=0;i<8;i++){
	            for(int j=0;j<8;j++){
	                if(i==0 && j==0){
	                    res.append("O");
	                    n--;
	                    continue;
	                }
	                else if(n>0){
	                    res.append(".");
	                    n--;
	                }
	                else res.append("X");
	            }
	            res.append("\n");
	        }
	        System.out.print(res);
	    }
	}
}
