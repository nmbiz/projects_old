package lab5;

import java.util.Random;
import java.util.Vector;

public class Item {
	private static Vector <String> positions=new Vector <String>();
	private static Vector <String> names=new Vector <String>();
	
	public Item(String name) {
		Random generator = new Random();
		boolean done=false;
		while(done!=true) {
			int x = generator.nextInt(3)+1;
			int y = generator.nextInt(8)+1;
			if(Room.search_position(x+""+y)==true) {
				if(search_position(x+""+y)==false) {
				positions.add(x+""+y);
				names.add(name);
				done=true;
				}
			}
		}
	}

	public static String show_name(String position) {
		int index=positions.indexOf(position);
		return names.get(index);
	}
	
	public static String first_letter(String position) {
		int index=positions.indexOf(position);
		String name=names.get(index);
		return Character.toString(name.charAt(0));
	}
	
	public static boolean search_position(String searched) {
		if(positions.contains(searched)==true) return true;
		else return false;
	}
}
