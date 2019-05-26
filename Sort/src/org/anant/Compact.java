package org.anant;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class Compact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,13,14,15,17,18,19,20};
		System.out.println(areConsecutive(a,a.length));
		//System.out.println(compactCheck(a,0,0,""));
	}

	static String compacHash(int[] arr){
		String res="";
		HashSet<Integer> hash = new HashSet<Integer>();
		for (int e: arr)
			hash.add(e);//(Arrays.asList(arr));
		for(int a : arr){
			//res = "";
			int temp = a;
			while(hash.contains(temp)){
				temp++;
			}
			if(a+2 >temp)
			res= res +""+ a+" "+ (temp-1);
			else
				res = res+","+a;
		}
		return res;
	}
	
	static String compactCheck(int[] array,int i ,int si,String res){
		// if(si < )
		if((i+1)<array.length){
			if(array[i]+1 == (array[i+1])){
				if(i>si) si = i;
				res = compactCheck(array,i+1,si,res);
				
			}
			else{
				si=i;
				res = res+""+ array[i]+"-"+ array[si]; 
			}
		}		
		return res;
	}
	   static String areConsecutive(int arr[], int n) 
	    {
		   String res = "";
	        if (n < 1)
	            return "";
	 
	        /* 1) Get the minimum element in array */
	        int min = getMin(arr, n);
	 
	        /* 2) Get the maximum element in array */
	        int max = getMax(arr, n);
	 
	        /* 3) max - min + 1 is equal to n,  then only check all elements */
	        if (max - min + 1 == n) 
	        {
	           res = arr[0]+"-"+arr[n-1];
	        }
	        return res; // if (max - min  + 1 != n)
	    }
	   static int getMax(int arr[], int n) 
	    {
	        int max = arr[0];
	        for (int i = 1; i < n; i++) 
	        {
	            if (arr[i] > max)
	                max = arr[i];
	        }
	        return max;
	    }
	   /* UTILITY FUNCTIONS */
	    static int getMin(int arr[], int n) 
	    {
	        int min = arr[0];
	        for (int i = 1; i < n; i++) 
	        {
	            if (arr[i] < min)
	                min = arr[i];
	        }
	        return min;
	    }
}
