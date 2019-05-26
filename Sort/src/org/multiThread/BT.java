package org.multiThread;
import java.io.*; 
import java.util.*;
public class BT {

	//The solutions should be written, for compiler compatibility : j2se jdk 6.0

	
	//public class Main  
	//{ 
	    public static void main(String[] args) throws IOException  
	    { 
	    	/*String s1 = "creative";
	    	String s2 = "reactiv";
	    	Map<String,Integer> m1 = new HashMap<String,Integer>();
	    	Map<String,Integer> m2 = new HashMap<String,Integer>();
	    	String[] as1 = s1.split("");
	    	String[] as2 = s2.split("");
	    	for(String s: as1){
	    		if(m1.containsKey(s) ){
	    			m1.put(s, m1.get(s)+1);
	    		}
	    		else{
	    			m1.put(s, 1);
	    		}
	    	}
	    	for(String s: as2){
	    		if(m2.containsKey(s)){
	    			m2.put(s, m2.get(s)+1);
	    		}
	    		else{
	    			m2.put(s, 1);
	    		}
	    	}
	    	for(String s: as1){
	    		if(m1.get(s) != m2.get(s)){
	    			System.out.println(0);;
	    		}
	    		
	    	}*/
	    	
	        int n=0,p,q;  
	        int[][] arr = new int[100][100]; 
	         
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	         
	        //First fetching the size of the 2 dimensional array 
	        n =Integer.parseInt(br.readLine()); 
	         
	        //Now fetching the n x n array from the console 
	        int pq=0,counter=0; 
	        int[] samarr=new int[n*n]; 
	        while (pq<n) 
	        { 
	            String s = br.readLine(); 
	            if (s == null) break; 
	            for (String token  : s.split("\\s+")) 
	            { 
	                samarr[counter] = Integer.parseInt(token); 
	                counter++; 
	            } 
	            pq++; 
	        } 
	         
	        counter=0; 
	        for(p=0;p<n;p++) 
	        { 
	            for(q=0;q<n;q++) 
	            { 
	                 
	                arr[p][q]=samarr[counter]; 
	                counter++; 
	            } 
	        } 
	         
	        //Start your code here. Do not print anything in between 
	      int m = 2;
	      int maxSum =0;
	      int[][] resArr = new int[m-1][m-1];
	      for(int col=0;col<m;col++) 
	        {
	    	  for(int row=0;row<m;row++) 
	     	   {
	            int sum = 0;
	            int[][] iRes = new int[m-1][m-1];
	            int ri = 0;
	     	 	for(int i=row;i<(m+row);i++) 
	      		{ 
	     	 		int ci = 0;
	      	      for(int j=col;j<(m+col);j++) 
	      	      { 
	      	    	  //int ci =0;
	                sum = sum + arr[i][j]; 
	                iRes[ri][ci]=arr[i][j];
	                ci++;
	              } 
	      	      ri++;
	       	 	}
	            if(sum > maxSum){ maxSum = sum; resArr=iRes;}
	   	 	   }
	    	}
	      
	         
	           
	   // This prints the inputted array. Use similar format for program output 
	       for(p=0;p<m;p++) 
	       { 
	          for(q=0;q<m;q++) 
	          { 
	             System.out.print(Integer.toString(resArr[p][q])+" "); 
	          } 
	          System.out.println(); 
	       } 
	                 
	         
	     
	}
}

//}
