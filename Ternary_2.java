import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int Num;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Please Enter a Number: ");
		Num = sc.nextInt();
		
	   int res =(Num == 10 || Num == 20 || Num == 30 || Num == 40 || Num == 50)?1:0;
	   if(res == 1)
	   System.out.print("Num is "+Num);
	   else
	   System.out.print("Num not present");
	}
}

