package Practice;

public class Palindrome {
	
//	public static void main(String[] args) {
//		int r,temp,sum=0;
//		int n =457;
//	    temp=n;
//	    while(n>0) {
//	    	r =n%10;
//	    	sum = (sum*10)+r;
//	    	n=n/10;
//	    }
//	    if(temp==sum) {
//	    	System.out.println("palindrome");
//	    }
//	    else {
//	    	System.out.println("no");
//	    }
//
//}
	
	public static void main(String[] args) {
		String rev="", name = "malayalam";
		for (int i=name.length()-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
		if(rev.equals(name)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("no");
		}
		
		
	}
}
