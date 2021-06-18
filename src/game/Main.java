package game;
import game.RoomManager;
import fixtures.Room;
import java.util.Scanner;



public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static Scanner menuScanner = new Scanner(System.in);	
	
	public static void main (String[] args) {

		//Set up rooms and player
		
		RoomManager rm = new RoomManager();
		Player playerA = new Player();
		rm.init(playerA);
		
		//Establish a player and give them a current room                       
		//Getters/setters for current room
		
		Room currentRoom = rm.startingRoom;
		
		boolean quit = false;
		System.out.println("Room: " + currentRoom.name);
		System.out.println(currentRoom.shortDescription);
		
		while(!quit) {

			System.out.println("What would you like to do?\n"
					+ "1. Look around \n"
					+ "2. Go to a new room \n"
					+ "3. Quit \n");
			
			//multi-word commands go, turn, move, look, etc. then the direction or object
			//split on whitespace
			
			int menuInput = menuScanner.nextInt();
			if (menuInput == 1) {

				System.out.println(currentRoom.longDescription);
				continue;
			} else if (menuInput == 2) {
				
				System.out.println("Which direction would you like to go? Please enter as a two-word statement ('go north', 'go west', etc.)");
				String optionInput = scan.nextLine();
				String[] direction = optionInput.split("\\s+");
				
				Room nextRoom = null;
					if(direction[1].trim().toLowerCase().equals("north")) {
						nextRoom =currentRoom.getNorthExit();	
					}else if(direction[1].trim().toLowerCase().equals("south")) {
						nextRoom =currentRoom.getSouthExit();		
					}else if(direction[1].trim().toLowerCase().equals("east")) {
						nextRoom =currentRoom.getEastExit();		
					}else if(direction[1].trim().toLowerCase().equals("west")) {
						nextRoom =currentRoom.getWestExit();		
					}else {
						System.out.println("I'm sorry, that was not an acceptable input.");
						continue;
					}
					
					if (nextRoom !=null) {
						currentRoom = nextRoom;
						System.out.println("Room: " + currentRoom.name);
						System.out.println(currentRoom.shortDescription);
					continue;
					} else {
						System.out.println("There isn't a room in that direction.");
						continue;
					}
				
				
			}else if (menuInput == 3) {
				
				System.out.println("Goodbye!");
				quit = true;
				continue;
					
			

			}
		}
	}
}

