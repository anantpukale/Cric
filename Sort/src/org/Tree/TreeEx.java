package org.Tree;

import java.util.*;

public class TreeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			treePrint();
	}
	
	public static void treePrint(){
		String sent = "Hi I am anant";
		String[] arrString = sent.split(" ");
		Map map = new TreeMap<Integer,String>();
		for( String str : arrString){
			if(map.get(str.length()) != null){
				map.put(str.length(), map.get(str.length()) +"_"+ str);
			}
			else {
				map.put(str.length(),  str);
			}
		}
		/*map.put(2, "am");
		map.put(1,"I");
		map.put(5, "anant");
		map.put(2, "as");*/
		
		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()){
			int key = itr.next();
			
			System.out.println( map.get(key).toString());
		}
		
	} 
	

}
