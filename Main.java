// Java program to count total
// number of words in the string
import java.util.*; 
import java.util.StringTokenizer;
public class Main
{
	
	// Function to count total number
	// of words in the string
	public static int
	countWords(String str)
	{
		
		// Check if the string is null
		// or empty then return zero
		if (str == null || str.isEmpty())
			return 0;
		
		// Create a StringTokenizer with the
		// given string passed as a parameter
		StringTokenizer tokens = new
		StringTokenizer(str);
		
		// Return the number of words
		// in the given string using
		// countTokens() method
		return tokens.countTokens();
	}
	
	// Driver Code
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
		// Print the result
		System.out.println("No of words: " +
		countWords(str));
	}
}
