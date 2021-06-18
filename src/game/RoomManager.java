package game;
import fixtures.Room;
import fixtures.Fixture;


public class RoomManager {
	
	Room startingRoom;
	Room[] allRooms;
	
	
	
	public void init(Player playerA) {
		Room bedRoom = new Room("Bedroom",
				"You are in your bedroom. There's an alarm next to your bed, a PC on a desk in the opposite end, and a dresser in the corner.",
				"You are in your bedroom. There's an alarm next to your bed, a PC on a desk in the opposite end, and a dresser in the corner."
				+ " There is only one door,\nit's on the west side of the room leading into the living room.\n");

		
		Room livingRoom = new Room("Living Room",
				"You are in the living room, there's a couch and a TV is mounted on the wall. "
				+ "The TV is on and appears to be stuck on a channel with nothing but static...",
				"You are in the living room. There is a door to the kitchen on the south side of the room,"
				+ " and a door to the bedroom on the east side of the room. That TV is still stuck on a random channel.");


				
		Room kitchen = new Room("Kitchen",
				"You are now in the kitchen. There's a fridge, some cabinets, and a table with a piece of paper on it. ",		
				"You are in the kitchen, there is a door leading to the Dining Room on the north side of the room, "
				+ "and a door to the Study on the east side of the room. You also see a fridge, some cabinets, and that piece of paper is"
				+ " still on the table...");	

		
		Room study = new Room("Study",
				"You are in your study. There's a desk, a ceiling fan, and a large bookcase.",
				"Inside the study there is only the single door to the kitchen, located on the west side of the room. On your desk are "
				+ "a stack of papers, the ceiling fan has four different settings, and a large collection of books on the bookshelf."
				+ "There is one in particular standing out among the rest...");
		
		
//		bedRoom.setNorthExit(study);
//		bedRoom.setSouthExit(study);
//		bedRoom.setEastExit(study);
		bedRoom.setWestExit(livingRoom);
		
//		livingRoom.setNorthExit(kitchen);
		livingRoom.setSouthExit(kitchen);
		livingRoom.setEastExit(bedRoom);
//		livingRoom.setWestExit(kitchen);
		
		kitchen.setNorthExit(livingRoom);
//		kitchen.setSouthExit(livingRoom);
		kitchen.setEastExit(study);
//		kitchen.setWestExit(livingRoom);
		
		
		//TODO: SET north exit to secret room when the criteria have been met
		// Three boolean values, triggered by interacting with things in the other rooms
//		study.setNorthExit(bedRoom);
//		study.setSouthExit(bedRoom);
//		study.setEastExit(bedRoom);
		study.setWestExit(kitchen);
		
		
		allRooms = new Room[4];
		allRooms[0] = bedRoom;
		allRooms[1] = livingRoom;
		allRooms[2] = kitchen;
		allRooms[3] = study;
			
		
		
		startingRoom = bedRoom;                                                                                                                                                                                           

	}
}
