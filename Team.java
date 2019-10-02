package lab3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
		
		  
			try {
				String fileContent = temp;
				  Calendar cal = Calendar.getInstance();
			        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
				    FileWriter fileWriter;
				    String date=sdf.format(cal.getTime());
				    fileContent+=date;
				    //String filename=team_name+"_"+date+".txt"; Nieznany b³¹d z dat¹ w nazwie pliku
				    String filename=team_name+".txt";
				fileWriter = new FileWriter(filename);
		        Writer output = null;
		        File file = new File(filename);
		        file.createNewFile();
		        output = new BufferedWriter(new FileWriter(file));
		        output.close();
				PrintWriter printWriter = new PrintWriter(fileWriter);
			    printWriter.print(fileContent);
			    printWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    return temp;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		} 


	}
