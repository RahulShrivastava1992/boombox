package handyPrograms;



import java.util.*;
import java.lang.*;
import java.io.*;

class GOOD_and_BAD_String {
	
	public static boolean isVowel(char c){
		if(c=='a' || c == 'e' || c == 'i' || c=='o' || c=='u')
		return true;
		else
		return false;
	}
	
	
	public static void main (String[] args) {
	    int v=0,c=0,flag=1;
	    Scanner s= new Scanner(System.in);
	    int n=s.nextInt();
	    s.nextLine();
	    while(n>0){
	    //	System.out.println(n);
	    		flag=1;
	    		v=0;c=0;
	     	        String str = s.nextLine();
	     	       
		        System.out.println(str);
	    	        for(int i=0;i<str.length();i++){
						    	if(isVowel(str.charAt(i))){
	    									v++;c=0;
								    	    	  }
						    	else if(str.charAt(i)=='?'){
								    		v++;c++;
									    	}
						    	else{
						    		v=0;c++;
	    							}
						    	System.out.println("v="+v+",c="+c+"\n");
	    	
						    	if((v>5 || c>3 ) && flag !=0){
							    		System.out.println("BAD STRING");
							    		flag=0;
							    	
								    	}
							  }
		    if(flag!=0)
			System.out.println("GOOD STRING");
		    n--;
		}
		s.close();
	}
	
}
