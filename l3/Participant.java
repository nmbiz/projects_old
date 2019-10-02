package lab3;

import java.util.Calendar;
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
}
