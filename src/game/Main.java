package game;
import game.RoomManager;
import fixtures.Room;
import java.util.Scanner;


public class Main {
	private static Scanner scan = new Scanner(System.in);
	
//	
//	public static void printRoom(Player player) {
//		
//	}
//	public static String collectInput() {
//		
//	}
//	public static String parse(String[], Player player) {
//		
//	}
//	
	
	
	public static void main (String[] args) {

		//Set up rooms and player
		
		RoomManager rm = new RoomManager();
		rm.init();
		
		//Establish a player and give them a current room
		//Getters/setters for current room
		
		Room currentRoom = rm.startingRoom;
		
		
		boolean quit = false;
				
		while(!quit) {
			System.out.println(currentRoom);
			System.out.println("Where do you want to go? Left or Right?"
					+ "\nOr do you want to quit?");
			
			//multi-word commands go, turn, move, look, etc. then the direction or object
			//split on whitespace
			
			String input = scan.next();
			
			if (input.trim().toLowerCase().equals("quit")) {
				quit = true;
				continue;
				
			}
			Room nextRoom = null;
			if(input.equals("left")) {
				nextRoom =currentRoom.getLeftExit();
				
			}else if(input.equals("right")) {
				nextRoom =currentRoom.getRightExit();
				
			}
			
			if (nextRoom !=null) {
				currentRoom = nextRoom;
			}
		}
	}
}
