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
	         test=Integer.parseInt(sc.readLine().trim());
	    }
	    catch(Exception e){
	    }
	        while(test-->0){
	        int N=0;
	        String ss[]=new String[N];
	        try{
	        N=Integer.parseInt(sc.readLine().trim());
	        ss=sc.readLine().trim().split(" ");
	        }
	        catch(Exception e){
	            
	        }
	        int arr[]=new int[N];
	        for(int i=0;i<N;i++)arr[i]=Integer.parseInt(ss[i]);
	        long res=0;
	        for(int i=0;i<N-1;i++){
	            int temp=-1;
	            if(arr[i+1]!=arr[i] && Math.abs(arr[i]-arr[i+1])!=1){
	            temp=Math.abs(arr[i+1]-arr[i])-1;
	            
	                res+=temp;
	                
	            }
	           // System.out.println(temp+" "+res);
	        }
	        System.out.println(res);
	    }
	}
}
