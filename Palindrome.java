package week1.day2;

public class Palindrome {

	public static void main(String[] args)
	{
		String name = "MADAM";
		int i = 0, j =name .length() -1;
		while (i < j) {
			if(name.charAt(i) != name.charAt(j))
			{
				System.exit(0);
				
		}
		i++;
		j--;
	}
            System.out.println("Palindrome");
            
	}}
