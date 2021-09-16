import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;

public class StudentTester {
	
	Student student;
	Servis servis;
	Course kurs;
	
	public static void main(String[] args){
		StudentTester tester=new StudentTester();
		tester.setUp();
		System.out.println(tester.testirajProsecenUspehPredmetSiteStudenti()?"pass":"fail");
		System.out.println(tester.testirajProsecenUspehStudent()?"pass":"fail");
	}

	public void setUp(){
		//Kreirame objekti student i kurs koi ke se koristat za testiranje
		student=new Student();
		kurs=new Course();
		//Kreirame mock objekt od servisot 
		servis= mock(Servis.class);
		//go postavuvame servisot za troshoci za dadeniot student i dadeniot kurs
		student.setServis(servis);
		kurs.setServis(servis);
	}

	//presmetuvanje na prosecen uspeh po predmet za site studenti
	
	public boolean testirajProsecenUspehPredmetSiteStudenti() {
		//Kreirame lista na studenti koi slusaat odreden predmet
		List<Student> studenti = new ArrayList<Student>();
		Student ema = new Student();
		Student ivana = new Student();
		Student sandra = new Student();
		studenti.add(ema);
		studenti.add(ivana);
		studenti.add(sandra);
		
		ema.setIndeks(163067);
		ivana.setIndeks(163000);
		sandra.setIndeks(161000);
		
	//Kreirame lista na studenti 
		
		List<Course> kursevi = new ArrayList<Course>();
		Course skit = new Course();
		//go postavuvame predmetot za koj se presmetuva prosek
	
		kursevi.add(skit);
		
		//kaj kursevite se postavuvaat studenti
		ema.setKursevi(kursevi);
		ivana.setKursevi(kursevi);
		sandra.setKursevi(kursevi);
		
		//kaj predmetot se postavuvaat studentite
		skit.setStudenti(studenti);
		student.setKursevi(kursevi);
		when(servis.getOcena(ema.getIndeks(), skit)).thenReturn(6);
		when(servis.getOcena(ivana.getIndeks(), skit)).thenReturn(7);
		when(servis.getOcena(sandra.getIndeks(), skit)).thenReturn(10);
		double prosek = student.getProsecenUspehPredmetSiteStudenti();	
		//System.out.println(prosek);
		return prosek == 7.666666666666667;
		
	}
	
	
	//testiranje na prosecen uspeh na eden student
	public boolean testirajProsecenUspehStudent(){
		//Kreirame lista na kursevi koi sakame da gi dodademe kaj daden student
				//t.e. lista na predmeti koi studentot gi slusa
		List<Course> predmeti = new ArrayList<Course>();
		Course skit = new Course();
		Course mt = new Course();
		Course emt = new Course();
		predmeti.add(skit);
		predmeti.add(mt);
		predmeti.add(emt);
		
		//Kreirame lista na studenti 
		
		List<Student> studenti = new ArrayList<Student>();
		Student ema = new Student();
		//go postavuvame indeksot za studentot za koj se presmetuva prosek
		ema.setIndeks(163067);
		studenti.add(ema);
		//gi dodavame predmetite kaj dadeniot student
		ema.setKursevi(predmeti);
		kurs.setStudenti(studenti);
		when(servis.getOcena(ema.getIndeks(), skit)).thenReturn(8);
		when(servis.getOcena(ema.getIndeks(), mt)).thenReturn(10);
		when(servis.getOcena(ema.getIndeks(), emt)).thenReturn(6);
		double prosek = kurs.getProsecenUspehStudent();		
		return prosek==8.00;
		
	}

}
