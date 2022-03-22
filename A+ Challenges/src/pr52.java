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
			
			for (int j = 0; j < list.size(); j++) {
				for (String s : list) {
					if (j == list.get(j).lastIndexOf(list.get(j))) {
						
					}
				}
			}
			
		}
		
	}

}
