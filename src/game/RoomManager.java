package game;
import fixtures.Room;


public class RoomManager {
	
	Room startingRoom;
	Room[] allRooms;
	
	
	
	public void init() {
		Room kit = new Room("Kitchen");
		Room lr = new Room("Living Room");
		Room br = new Room("Bedroom");
		Room dr = new Room("Dining Room");
		
		allRooms = new Room[4];
		allRooms[0] = kit;
		allRooms[1] = lr;
		allRooms[2] = br;
		allRooms[3] = dr;
		
		
		lr.setRightExit(kit);
		kit.setLeftExit(lr);
		
		startingRoom = lr;
//		
//	    Room foyer = new Room(
//			"The Foyer",
//			"a small foyer",
//			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
//			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
//			+ "To the north is a small room, where you can see a piano.");
//			this.rooms[0] = foyer;
//	        this.startingRoom = foyer;
	}
}
