package hashtable;
import java.util.*; 
public class HashTable {
	public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  	  
			 hm.put(1250,"Jayasri");  
			 hm.put(1251,"Shivani");  
			 hm.put(1252,"Kalyani");  
			 hm.put(1253,"Santhi");  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
			 }  	
	}
	
