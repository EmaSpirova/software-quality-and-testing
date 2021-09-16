import java.util.List;

public class Course {

	private List<Student> studenti;
	private String imePredmet;
	private Servis servis;
	private List<Course> kursevi;
	
	public List<Student> getStudenti() {
		return studenti;
	}
	public void setStudenti(List<Student> studenti) {
		this.studenti = studenti;
	}
	public String getImePredmet() {
		return imePredmet;
	}
	public void setImePredmet(String imePredmet) {
		this.imePredmet = imePredmet;
	}
	public Servis getServis() {
		return servis;
	}
	public void setServis(Servis servis) {
		this.servis = servis;
	}

	
	public double getProsecenUspehStudent(){

		double zbir = 0.00;
		double prosek = 0.00;
		for(Student student : studenti) {
			for(Course kurs : student.getKursevi()) {
				zbir+=servis.getOcena(student.getIndeks(), kurs);
				prosek = zbir/student.getKursevi().size();

			}
		}
		//System.out.println(zbir);
		//System.out.println(prosek);
		return prosek;
	}
	
	
	
}
