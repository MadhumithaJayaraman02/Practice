package Practice;

import java.util.Scanner;

public class Reverse {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a name: ");
//	String input = sc.nextLine();
//
//	String reverse = " ";
//	for(int i=input.length()-1;i>=0; i--) {
//		char a = input.charAt(i);
//	System.out.println(a);
//		//reverse = a+ "\n" +reverse;
//		System.out.println(reverse);
//	}
//}
//}
	//System.out.println("reversed string: " +reverse);
//}
//	public static void main(String[] args) {
//		String name = "madhu";
//		StringBuilder reverse = new StringBuilder();
//		reverse.append(name);
//		reverse.reverse();
//		System.out.println("reversed string " +reverse);
//	}
//}

//public static void main(String[] args) {
//	String name = "hello";
//	StringBuffer sb = new StringBuffer();
//	sb.append(name);
//	sb.reverse();
//	System.out.println(sb);
//}
	public static void main(String[] args) {
		int number = 153 ,temp,remainder, times=0;
		double sum =0;
		temp = number;
		while(temp!=0) {
			times =times+1;
			temp=temp/10;
		}
		 temp = number;
		 while(temp>0) {
			 remainder =temp%10;
			 sum =sum+Math.pow(remainder, times);
			 temp = temp/10;
		 }
		 if(sum==number) {
			 System.out.println("yes"); 
		}
		 else {
			 System.out.println("no");
		 }
	}
}
	