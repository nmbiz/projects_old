package lab5;

public class Step {
	private static int x,y,counter;
	
	public static void reset() {
		x=1;
		y=1;
		counter=0;
	}
	
	public static void movement(char step) {
		switch(step) {
			case('n'): x-=1;
			case('s'): x+=1;
			case('e'): y+=1;
			case('w'): y-=1;
		}
		
		counter+=1;
		
		if(Item.search_position(x+""+y)==true) {
			System.out.println(Item.show_name(x+""+y)+"-"+counter);
		}
	}
}
