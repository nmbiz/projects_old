package lab3;


public class lab{
	private String t3info;
	public lab() {
		Participant.read_file();
		Team team1=new Team("team1");
		Team team2=new Team("team2");
		Participant Mark=new Participant("Mark", "First",1998, 200, 90,"male","team1");
		Mark.add_skill("skill1");
		Mark.add_skill("skill2");
		Mark.add_skill("skill3");
		Mark.add_skill("skill4");
		Mark.add_skill("skill5");
		team1.add_to_team(Mark.show_personal_data());
		Participant John=new Participant("John", "Sec",2000, 180, 70,"male","team1");
		John.add_skill("skill1");
		John.add_skill("skill2");
		John.add_skill("skill3");
		John.add_skill("skill4");
		John.add_skill("skill5");
		team1.add_to_team(John.show_personal_data());
		Participant Maria=new Participant("Maria", "Th",1990, 220, 90,"female","team1");
		Maria.add_skill("skill1");
		Maria.add_skill("skill2");
		Maria.add_skill("skill3");
		Maria.add_skill("skill4");
		Maria.add_skill("skill5");
		team1.add_to_team(Maria.show_personal_data());
		Participant August=new Participant("August", "Fo",2010, 150, 60,"male","team1");
		August.add_skill("skill1");
		August.add_skill("skill2");
		August.add_skill("skill3");
		August.add_skill("skill4");
		August.add_skill("skill5");
		team1.add_to_team(August.show_personal_data());
		Participant Elisabeth=new Participant("Elisabeth", "Fi",1998, 200, 60,"female","team1");
		Elisabeth.add_skill("skill1");
		Elisabeth.add_skill("skill2");
		Elisabeth.add_skill("skill3");
		Elisabeth.add_skill("skill4");
		Elisabeth.add_skill("skill5");
		team1.add_to_team(Elisabeth.show_personal_data());
		Participant Eleonora=new Participant("Eleonora", "Fi",1998, 200, 60,"female","team2");
		Eleonora.add_skill("skill1");
		Eleonora.add_skill("skill2");
		Eleonora.add_skill("skill3");
		Eleonora.add_skill("skill4");
		Eleonora.add_skill("skill5");
		team2.add_to_team(Eleonora.show_personal_data());
		Participant Jonathan=new Participant("Jonathan", "Fi",1998, 200, 60,"male","team2");
		Jonathan.add_skill("skill1");
		Jonathan.add_skill("skill2");
		Jonathan.add_skill("skill3");
		Jonathan.add_skill("skill4");
		Jonathan.add_skill("skill5");
		team2.add_to_team(Jonathan.show_personal_data());
		Participant Martin=new Participant("Martin", "Fi",1998, 200, 60,"male","team2");
		Martin.add_skill("skill1");
		Martin.add_skill("skill2");
		Martin.add_skill("skill3");
		Martin.add_skill("skill4");
		Martin.add_skill("skill5");
		team2.add_to_team(Martin.show_personal_data());
		Participant Tomas=new Participant("Tomas", "Fi",1998, 200, 60,"male","team2");
		Tomas.add_skill("skill1");
		Tomas.add_skill("skill2");
		Tomas.add_skill("skill3");
		Tomas.add_skill("skill4");
		Tomas.add_skill("skill5");
		team2.add_to_team(Tomas.show_personal_data());
		Participant Sam=new Participant("Sam", "Fi",1998, 200, 60,"male","team2");
		Sam.add_skill("skill1");
		Sam.add_skill("skill2");
		Sam.add_skill("skill3");
		Sam.add_skill("skill4");
		Sam.add_skill("skill5");
		team2.add_to_team(Sam.show_personal_data());
		try {
			Team team3=(Team)team2.clone();
			t3info=team3.show_info();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(team1.show_info());
		System.out.println(team2.show_info());
		System.out.println(t3info);
		System.out.println(Sam.show_all());
		Sam.change_name("Maciek");
		System.out.println(Sam.show_all());
		
	}
	public static void main(String args[]) {
		new lab();
	}
}
