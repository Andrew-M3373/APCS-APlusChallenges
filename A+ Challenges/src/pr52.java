import java.io.*;
import java.util.*;

public class pr52 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("pr52.dat"));
		int lines = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < lines; i ++) {
			String line = scanner.nextLine();
			
			// Initialize ArrayList of ArrayLists
			List<List<String>> arr = new ArrayList<List<String>>();
			
			// Fill ArrayList of ArrayLists
			String[] temp = line.split(" ");
			for (int k = 0; k < temp.length; k++) {
				arr.add(new ArrayList<String>());
				for (int j = 0; j < temp[k].length(); j++) {
					arr.get(k).add(temp[k].substring(j,j+1));
				}
			}
			
			/* Test Printing out ArrayList of ArrayLists
			for (List<String> s : arr)
				System.out.println(s.toString());
			*/
			
			// Sort, remove duplicate letters, printout
			for (List<String> s : arr) {
				Collections.sort(s);
				Set<String> set = new LinkedHashSet<>(s);
				System.out.print(set.toString().replaceAll(" |,|\\[|\\]", "") + " ");
			}
			System.out.println();
			
		}
		
	}

}
