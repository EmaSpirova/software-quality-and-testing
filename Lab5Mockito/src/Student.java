import java.util.List;

public class Student {
	private Servis servis;
	private List<Course> kursevi;
	private long indeks;
	
	

	public Servis getServis() {
		return servis;
	}



	public void setServis(Servis servis) {
		this.servis = servis;
	}



	public List<Course> getKursevi() {
		return kursevi;
	}



	public void setKursevi(List<Course> kursevi) {
		this.kursevi = kursevi;
	}



	public long getIndeks() {
		return indeks;
	}



	public void setIndeks(long indeks) {
		this.indeks = indeks;
	}

	public double getProsecenUspehPredmetSiteStudenti(){

		double zbir = 0.00;
		double prosek = 0.00;
		for(Course kurs : kursevi) {
			for(Student student : kurs.getStudenti()) {
				zbir+=servis.getOcena(student.getIndeks(), kurs);
				prosek = zbir/kurs.getStudenti().size();

			}
		}
		//System.out.println("zbirot e: " + zbir);
		//System.out.println(prosek);
		return prosek;
	}


}
