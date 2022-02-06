import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    char ch;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter the char : ");
		ch = sc.next().charAt(0);
	  int res =	(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ? 1:0;
	  if(res == 1)
	  System.out.print(ch +" is vowel");
	  else
	  System.out.print(ch +" is consonant");
	}
}

