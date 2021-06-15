package fixtures;

public class Room extends Fixture {
	public Room[] exits = new Room[2];
	// left and right exits
	public Room(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Room [name=" + name + "]";
	}
	
	public Room getLeftExit() {
		return exits[0];
	}
	public Room getRightExit() {
		return exits[1];
	}
	public void setLeftExit(Room exit) {
		exits[0] = exit;
	}	
	public void setRightExit(Room exit) {
		exits[1] = exit;
	}
}	
	
	
	
//	public Room(String name, String shortDescription, String longDescription) {
//		super(name, shortDescription, longDescription);
//		this.exits = new Room[?]; // size is your choice
//	}
//	
//	public Room[] getExits() {
//		
//	}
//	public Room getExit(String direction) {
//		
//	}

