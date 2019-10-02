package lab5;

import java.util.Vector;

public class Room {
	private static Vector <String> position=new Vector <String>();
	
	public Room(int x,int y) {
		position.add(x+""+y);
	}
	
	public static boolean search_position(String searched) {
		if(position.contains(searched)==true) return true;
		else return false;
	}
	
	public static void show_rooms() {
		for(int x=1;x<4;x++) {
			String line="";
			for(int y=1;y<9;y++) {
				if(search_position(x+""+y)==true) line+="#";
				else line+="X";
			}
			System.out.println(line);
		}
	}

	public static void show_rooms2() {
		for(int x=1;x<4;x++) {
			String line="";
			for(int y=1;y<9;y++) {
				if(search_position(x+""+y)==true) {
					if(Item.search_position(x+""+y)==true) line+=Item.first_letter(x+""+y);
					else line+="#";
				}
				else line+="X";
			}
			System.out.println(line);
		}
	}
}
