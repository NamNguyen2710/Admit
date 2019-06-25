import java.io.*;
import java.util.*;
import java.io.IOException;
public class Read {
	public static void main (String[] args) throws IOException
	{
		Scanner input = new Scanner(new File("readme.txt"));
		int count = 0;
		while (input.hasNext()) {
		   System.out.println("input: " + input.next());
		   count++;
		}
		System.out.println(count + " total");
	}
}
