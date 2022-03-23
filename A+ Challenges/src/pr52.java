import java.io.*;
import java.util.*;

public class pr52 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("pr52.dat"));
		int lines = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < lines; i ++) {
			String line = scanner.nextLine();
//			ArrayList<String> list = new ArrayList<String>();
			
			List<String> list = Arrays.asList(line.split(" "));
			List<String[]> newList = new ArrayList<String[]>();
			
			for (String s : list) {
				String[] array = new String[list.size()];
				for (int j = 0; j < s.length(); j++) {
					array[j] = s.substring(j,j+1);
				}
				newList.add(array);
			}
				
			System.out.println(newList.toString().toString());
			
			for (int j = 0; j < list.size(); j++) {
				for (String s : list) {
					if (j == list.get(j).lastIndexOf(list.get(j))) {
						
					}
				}
			}
			
		}
		
	}

}
