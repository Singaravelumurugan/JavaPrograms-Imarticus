package Works;

import java.util.Scanner;

public class StringPosition {
	public static void Caps(String str) {
		 boolean consonant, vowel,capital,small,special,number,space;
		   consonant= vowel=capital=small=special=number=space= false;
		   int count=0;
		 
			 	int n=str.length();
			 	for(int i=0;i<n;i++) {
			 		if(count==7) 
			 			break;
			 		
			 	char ch = str.charAt(i);
					        
				 if(!capital && Character.isUpperCase(ch)) {
	            System.out.println(" First Capital letter index: " + (i+1));
	            capital=true;
	            count++;
				       }
				 if(Character.isLetter(ch)){
			     if(!small && Character.isLowerCase(ch)) {
	        	System.out.println("First Small letter index: " + (i+1));
	        	small=true;
	        	count++;
					        }
				 }
				else if(!number && Character.isDigit(ch)) {        
	            System.out.println("First Number index: " +(i+1));
	            number=true;
	            count++;
					  }
				else if(!space &&  ch ==' ' && Character.isWhitespace(ch)) {
			    System.out.println("First Space index : " +(i+1));
			    space = true;
			    count++;
					}
			     if(vowel || consonant) {
			    	ch= Character.toLowerCase(ch);
			    	if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					    System.out.println("First vowel index : " +(i+1));
					    vowel=true;
					    count++;
			    	} 
			     }
			  else if (Character.toString(ch) != null) {
				  System.out.println("First Special Character index : " +(i+1));	
				  special=true;
				  count++;
			  }
				 }  }		       
	
	public static void main(String args[]) {
		   Scanner s = new Scanner (System.in);
		  System.out.println("Enter the String");
		  String str;
		  str=s.nextLine();
		  Caps(str);
		  s.close();
			   }
			}

		


