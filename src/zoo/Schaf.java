package zoo;

public class Schaf {
	
	private int alter;
	private String name;

	
	public Schaf(int alter, String name) {
		
		this.alter = alter;
		this.name = name;
		
	}
	
	public void frissGras() {
		System.out.println("Frisst Gras");
	}
	
	public void machGeräusche() {
		System.out.println("Macht Schaf-Geräusche");
	}

}
