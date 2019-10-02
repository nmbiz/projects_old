package lab3;

import java.util.Vector;

public class Team implements Cloneable{
	private int num=0;
	private String team_name;
	private Vector <String> Participants=new Vector<String>();
	public Team(String team_name) {
		this.team_name=team_name;
	}
	public void add_to_team(String name_surname) {
		if(num==5)
			System.out.println("error add_to_team "+name_surname);
		Participants.add(name_surname);
		num+=1;
	}
	public String show_info() {
		String endl = System.getProperty("line.separator");
		String temp="Team name: "+team_name+endl+"Number Of Players: "+num+endl+"Players:"+endl;
		for(int i=0;i<Participants.size();i+=1) {
			temp+=Participants.get(i)+endl;
		}
		return temp;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}
