package zoo;

public class Schaf {
	
	private int alter;
	private String name;
	private int größe;

	
	public Schaf(int alter, String name, int größe) {
		
		this.alter = alter;
		this.name = name;
		this.größe = größe;
		
	}
	
	public void frissGras() {
		System.out.println("Frisst Gras");
	}
	
	public void machGeräusche() {
		System.out.println("Macht Schaf-Geräusche");
	}

}
