package week4;

import acm.program.*;
import java.util.*;

public class UniqueNames extends ConsoleProgram{
	public void run () {
		
		ArrayList<String> list = new ArrayList<String>();
		
		readList(list);
		printArrayList(list);
		
		readList(list);
		printArrayList(list);
		
		
	}
	private void readList(ArrayList list) {
		while (true) {
			String item = readLine(" Enter Name: ");
			if (item.equals("")) break;
			list.add(item);
		}
	}
	private void printArrayList(ArrayList list) {
		println("List contains " + list.size() + " Unique Names");
		for(int i=0; i<list.size(); i++) {
			println(list.get(i));
		}
		
	}

}