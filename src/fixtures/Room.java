package fixtures;

public class Room extends Fixture {
	public Room[] exits = new Room[4];
	// Four potential exits, North,South,East,West. In this 2-D case, north is up.
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; 
	}
	
	public Room(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Room [name=" + name + "]";
	}
	
	public Room getNorthExit() {
		return exits[0];
	}
	
	public Room getSouthExit() {	
		return exits[1];
	}

	public Room getEastExit() {
		return exits[2];
	}
	
	public Room getWestExit() {	
		return exits[3];
	}
	
	public void setNorthExit(Room exit) {
		exits[0] = exit;
	}
	
	public void setSouthExit(Room exit) {
		exits[1] = exit;
	}
	
	public void setEastExit(Room exit) {
		exits[2] = exit;
	}
	
	public void setWestExit(Room exit) {
		exits[3] = exit;
	}
}	
	
	
	

//	
//	public Room[] getExits() {
//		
//	}
//	public Room getExit(String direction) {
//		
//	}

