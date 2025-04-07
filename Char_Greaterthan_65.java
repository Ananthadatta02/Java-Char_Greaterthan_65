package character_programming;

import java.util.Scanner;

public class Char_Greaterthan_65 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = s.next().charAt(0);
		if(ch>65)
			System.out.println("Char " + ch + " Ascii value is Grerater than 65");
		else
			System.out.println("Char " + ch + " Ascii value is Not Grerater than 65");
	}
}
