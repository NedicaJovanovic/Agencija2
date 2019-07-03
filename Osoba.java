package agencija2;

public class Osoba {
	int id;
	String ime;
	String prezime;
	String kontakt;
	
	public Osoba(int id, String ime, String prezime, String kontakt) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.kontakt = kontakt;
	}
	
	public String toString() {
		return String.format("(%d) %s %s - %s", id, ime, prezime, kontakt);
	}
}