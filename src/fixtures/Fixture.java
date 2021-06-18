package fixtures;

public class Fixture {
	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixture () {
		
	}
	
	public Fixture (String name) {
		this.name = name;
	}
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	
	
}
