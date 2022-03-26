import java.io.*;
import java.util.*;

public class pr53 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("pr53.dat"));
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			
			// Fill ArrayList
			List<String> list = new ArrayList<String>();
			String[] temp = line.split(" ");
			for (String t : temp)
				list.add(t);
			
			// Remove 4-letter words
			List<String> removedList = new ArrayList<String>();
			for (int i = list.size()-1; i >= 0; i--)
				if (list.get(i).length() == 4) {
					removedList.add(list.get(i));
					list.remove(i);
				}			
			// Print updated string and 4-letter words
			System.out.println(list.toString().replaceAll("[,\\[\\]]", ""));
			Collections.sort(removedList);
			System.out.println(removedList.toString().replaceAll("[,\\]]", "\n").replaceAll("[ \\[]",""));
		}
	}

}
