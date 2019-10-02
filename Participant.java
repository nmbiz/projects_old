package lab3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Participant {
	private String name,surname,gender;
	private Vector <String> skills = new Vector <String>();
	//height in centimeters, weight in kilograms
	private int height,weight;
	private String team;
	private static int age;
	
	public Participant(String name,String surname, int birth_year, int height_cm,int weight_kg,String gender,String team) {
		this.name=name;
		this.surname=surname;
		this.height=height_cm;
		this.weight=weight_kg;
		this.team=team;
		this.gender=gender;
		calculate_age(birth_year);
	}
	public String show_players(String team_name) {
		if(team==team_name)
			return show_all();
		else return null;
	}
	public void set_team(String team) {
		this.team=team;
	}
	public void change_name(String name) {
		this.name=name;
	}
	public void change_surname(String surname) {
		this.surname=surname;
	}
	public void change_gender(String gender) {
		this.gender=gender;
	}
	public void change_height(int height) {
		this.height=height;
	}
	public void change_weight(int weight) {
		this.weight=weight;
	}
	public void change_birth(int birth_year) {
		calculate_age(birth_year);
	}
	public void change_all(String name,String surname,String gender,int height,int weight,int birth_year) {
		this.name=name;
		this.surname=surname;
		this.height=height;
		this.weight=weight;
		this.gender=gender;
		calculate_age(birth_year);
	}
	private static void calculate_age(int birth_year) {
		Calendar cal = Calendar.getInstance();
		age=cal.get(Calendar.YEAR)-birth_year;
	}
	public void add_skill(String skill) {
		this.skills.add(skill);
	}
	public String show_personal_data() {
		return name+" "+surname;
	}
	public String show_skills() {
		String skilltab="";
		for(int x=0;x<skills.size();x++) {
			skilltab+=skills.get(x)+" ";
		}
		return skilltab;
	}
	public String show_gender() {
		return gender;
	}
	public static int show_age() {
		return age;
	}
	public String show_height() {
		return height+"cm";
	}
	public String show_weight(){
		return weight+"kg";
	}
	public String show_all() {
		String endl = System.getProperty("line.separator");
		return show_personal_data()+endl+show_gender()+endl+show_age()+endl+show_height()+endl+show_weight()+endl+show_skills();
	}
	public static List<String> from_file(String file) {
		   List<String> lines = Collections.emptyList(); 
		    try
		    { 
		      lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
		    } 
		  
		    catch (IOException e) 
		    { 
		      e.printStackTrace(); 
		    } 
		    return lines; 
	}
	public static void read_file() {
		List l = from_file("participants.txt"); 
		Vector <String> list1=new Vector <String>();
		int num=0;
		Team team4=new Team("team4");
		Vector <Integer> list2=new Vector <Integer>();
	    Iterator<String> itr = l.iterator(); 
	    while (itr.hasNext()) {
	    	String special=itr.next();
	    	String name="",surname="",team="";
	    	String gender="";
	    	int number=0,birth=0,height=0,weight=0;
	    	for(int y=0;y<special.length();y+=1) {
	    		if(special.substring(y,y+1).contentEquals(";")==false) {
	    			if(number==0)
	    			name+=special.substring(y,y+1);
	    			if(number==1)
	    				surname+=special.substring(y,y+1);
	    			if(number==2)
	    				birth=Integer.parseInt(special.substring(y,y+1));
	    			if(number==3)
	    				height=Integer.parseInt(special.substring(y,y+1));
	    			if(number==4)
	    				weight=Integer.parseInt(special.substring(y,y+1));
	    			if(number==5)
		    			gender+=special.substring(y,y+1);
	    			if(number==6)
		    			team+=special.substring(y,y+1);
	    		}
	    		if(special.substring(y,y+1).contentEquals(";")==true) {
	    			number+=1;
		    	}
	    		}
	    	
	    	if(num==4) {
		    	Participant name5 = new Participant(name, surname, birth, height, weight, gender, team);
		    	System.out.println(name5.show_personal_data());
		    	num+=1;
	    	}
	    	if(num==3) {
		    	Participant name4 = new Participant(name, surname, birth, height, weight, gender, team);
		    	System.out.println(name4.show_personal_data());
		    	num+=1;
		    	}
	    	if(num==2) {
		    	Participant name3 = new Participant(name, surname, birth, height, weight, gender, team);
		    	System.out.println(name3.show_personal_data());
		    	num+=1;
		    	}
	    	if(num==1) {
		    	Participant name2 = new Participant(name, surname, birth, height, weight, gender, team);
		    	System.out.println(name2.show_personal_data());
		    	num+=1;
		    	}
	    	if(num==0) {
	    	Participant name1 = new Participant(name, surname, birth, height, weight, gender, team);
	    	System.out.println(name1.show_personal_data());
	    	num+=1;
	    	} 
	    	team4.add_to_team(name+" "+surname);
	    	System.out.println(team4.show_info());
	    }
	  }
}
