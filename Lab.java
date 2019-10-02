package lab5;

public class Lab {

	public static void main(String[] args) {
		create_rooms();
		Room.show_rooms();
		new Item("Jab³ko");
		new Item("Krzes³o");
		new Item("Szafa");
		System.out.println("");
		Room.show_rooms2();
		Step.reset();
		Step.movement('e');
		Step.movement('s');
		Step.movement('s');
		Step.movement('w');
		Step.movement('e');
		Step.movement('n');
		Step.movement('e');
		Step.movement('e');
		Step.movement('s');
		Step.movement('n');
		Step.movement('n');
		Step.movement('s');
		Step.movement('e');
		Step.movement('e');
		Step.movement('n');
		Step.movement('e');
		Step.movement('e');
		Step.movement('w');
		Step.movement('w');
		Step.movement('s');
		Step.movement('s');
		Step.movement('e');
		Step.movement('e');
	}

	private static void create_rooms() {
		for(int x=1;x<4;x++) {
			for(int y=1;y<9;y++) {
				if(x==1 && y==3) continue;
				else if(x==1 && y==5) continue;
				else if(x==2 && y==1) continue;
				else if(x==2 && y==7) continue;
				else if(x==3 && y==3) continue;
				else if(x==3 && y==5) continue;
				else new Room(x,y);
			}
		}
	}
}
