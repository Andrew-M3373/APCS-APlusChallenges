import java.io.*;
import java.util.*;

public class pr51 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("pr51.dat");
		Scanner scanner = new Scanner(file);
		int lines = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < lines; i ++) {
			ArrayList<String> list = new ArrayList<String>();
			String line = scanner.nextLine();
			for(int j = 0; j < line.length(); j++) {
				list.add(line.substring(j,j+1));
			}
			
			Collections.sort(list);
//			for (int j = 0; j < list.size(); j++) {
//				if (list.get(j).equals(" ")) list.remove(j);
////				else if (list.get(j+1).equals(list.get(j))) list.remove(j+1);
//			}

			Set<String> set = new LinkedHashSet<>(list);
			
			if (set.remove(0));
			for (String s : set) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}
