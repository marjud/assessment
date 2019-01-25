import java.util.Scanner;

public class Main {
	static Treasure t = new Treasure();
	static Potato p = new Potato();
	static Watch w = new Watch();
	static Spear s = new Spear();
	
	public static int compass;
	public String message;
	public final static int moveNorth = 25;
	public final static int moveSouth = 15;
	public final static int moveWest = 25;
	public final static int moveEast = 15;
	public static int map = 100;
	static int treasure = t.location;
	static int potato = p.location;
	static int watch = w.location;
	static int spear = s.location;
	static int spearDamage = s.damage;
	public static int health = 100;
	static boolean play = true;
	
	public static void userPlay() {
		do {
			System.out.print("You can sense vibrations coming from the dark forest, do you wish to enter?");
			Scanner scan = new Scanner(System.in);
			String userResponse = scan.next();
			userResponse = userResponse.toUpperCase();
			
			if (userResponse.equals("YES")) {
				System.out.println("A green mist poisons the air in the forest,\r\n" + 
						"A deathly roar echos for eternity.\r\n" + 
						"You notice a small watch-like device in your left hand.\r\n" + 
						"The fog has a mist element, can't stay here long.");
				play = true;
				gamePlay();
			}else if (userResponse.equals("NO")) {
				play = false;
				System.out.println("Good choice, bye!");
			}else {
				System.out.println("Invalid input");
			}
				
		}
		while(play == true);
	}
	
	public static void gamePlay() {
		if (play == true && health > 0) {
			System.out.println("Your compass will guide you, find the treasure to heal the toxic forest, Enter: North, South, East or West into the command line.\n"
					+ "Health: " + health);
			Scanner scan = new Scanner(System.in);
			String direction =  scan.next();
			direction = direction.toUpperCase();
			while (treasure !=0 && health > 0) {
				if(direction.equals("NORTH")) {
					map = updatedMap(map, moveNorth);
					treasure = updatedMap(map, treasure);
					potato = updatedMap(map, potato);
					watch = updatedMap(map, watch);
					health = health -2;
					System.out.println("...What's that smell?\n"
							+ treasure +"m\n"
									+ potato + "m\n"
											+ watch +"m");
					
					System.out.println("Getting closer to something \n"
							+ "Health: " + health + " North, East, South, West");
					
					Scanner s = new Scanner(System.in);
					String direction2 =  scan.next();
					direction2 = direction2.toUpperCase();
					if(direction2.equals("NORTH")) {
						map = updatedMap(map, moveNorth);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -20;
					}
				}
				
				
							
				else if(direction.equals("SOUTH")) {
					map = updatedMap(map, moveSouth);
					treasure = updatedMap(map, treasure);
					potato = updatedMap(map, potato);
					watch = updatedMap(map, watch);
					health = health -80;
					System.out.println("...\n"
							+ treasure +"m\n"
									+ potato + "m\n"
											+ watch +"m");
					System.out.println("A dragon has swooped in and flamed the ground around you \n"
							+ "Health: " + health + " Spear aquired, action needed\n"
									+ "e - throw spear\n"
									+ "f - throw spear");
					
					
					Scanner s = new Scanner(System.in);
					String action =  scan.next();
					action = action.toUpperCase();
					if(action.equals("F")) {
						play = false;
						System.out.println("Throw missed, the mixture of the toxic fumes and fire was not good, as you choked to death");
				} 
					else if(action.equals("E")) {
						System.out.print("WHAT A HIT SON! But get moving, North, East, South, West");
						Scanner sc = new Scanner(System.in);
						String direction2 =  scan.next();
						direction2 = direction2.toUpperCase();
						if(direction2.equals("NORTH")) {
							map = updatedMap(map, moveWest);
							treasure = updatedMap(map, treasure);
							potato = updatedMap(map, potato);
							watch = updatedMap(map, watch);
							health = health -5;
							System.out.println("?\n"
									+ treasure +"m\n"
											+ potato + "m\n"
													+ watch +"m");
							
						}
						else if(direction2.equals("WEST")) {
							map = updatedMap(map, moveWest);
							treasure = updatedMap(map, treasure);
							potato = updatedMap(map, potato);
							watch = updatedMap(map, watch);
							health = health -2;
							System.out.println("?\n"
									+ treasure +"m\n"
											+ potato + "m\n"
													+ watch +"m");
					}
						
						else if(direction2.equals("EAST")) {
							map = updatedMap(map, moveWest);
							treasure = updatedMap(map, treasure);
							potato = updatedMap(map, potato);
							watch = updatedMap(map, watch);
							health = health -2;
							System.out.println("?\n"
									+ treasure +"m\n"
											+ potato + "m\n"
													+ watch +"m");
							
						}
						else if(direction2.equals("SOUTH")) {
							map = updatedMap(map, moveWest);
							treasure = updatedMap(map, treasure);
							potato = updatedMap(map, potato);
							watch = updatedMap(map, watch);
							health = health -2;
							System.out.println("?\n"
									+ treasure +"m\n"
											+ potato + "m\n"
													+ watch +"m");
						}
						
						
					else {
						err("");
					}
				}
					
					
					
				else if(direction.equals("WEST")) {
					map = updatedMap(map, moveWest);
					treasure = updatedMap(map, treasure);
					potato = updatedMap(map, potato);
					watch = updatedMap(map, watch);
					health = health -2;
					System.out.println("?\n"
							+ treasure +"m\n"
									+ potato + "m\n"
											+ watch +"m");
					
					Scanner sc = new Scanner(System.in);
					String direction3 =  scan.next();
					direction3 = direction3.toUpperCase();
					if(direction3.equals("NORTH")) {
						map = updatedMap(map, moveWest);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -5;
						System.out.println("?\n"
								+ treasure +"m\n"
										+ potato + "m\n"
												+ watch +"m");
						
					}
					else if(direction3.equals("WEST")) {
						map = updatedMap(map, moveWest);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -2;
						System.out.println("?\n"
								+ treasure +"m\n"
										+ potato + "m\n"
												+ watch +"m");
				}
					
					else if(direction3.equals("EAST")) {
						map = updatedMap(map, moveWest);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -2;
						System.out.println("?\n"
								+ treasure +"m\n"
										+ potato + "m\n"
												+ watch +"m");
						
					}
					else if(direction3.equals("SOUTH")) {
						map = updatedMap(map, moveWest);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -2;
						System.out.println("?\n"
								+ treasure +"m\n"
										+ potato + "m\n"
												+ watch +"m");
					}
					
					
				else {
					err("");
				}
			}
					
											
				else if(direction.equals("EAST")) {
					map = updatedMap(map, moveEast);
					treasure = updatedMap(map, treasure);
					potato = updatedMap(map, potato);
					watch = updatedMap(map, watch);
					health = health -2;
					System.out.println(".\n"
							+ treasure +"m\n"
									+ potato + "m\n"
											+ watch +"m");
					Scanner sc = new Scanner(System.in);
					String direction3 =  scan.next();
					direction3 = direction3.toUpperCase();
					if(direction3.equals("NORTH")) {
						map = updatedMap(map, moveWest);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -5;
						System.out.println("?\n"
								+ treasure +"m\n"
										+ potato + "m\n"
												+ watch +"m");
						
					}
					else if(direction3.equals("WEST")) {
						map = updatedMap(map, moveWest);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -2;
						System.out.println("?\n"
								+ treasure +"m\n"
										+ potato + "m\n"
												+ watch +"m");
				}
					
					else if(direction3.equals("EAST")) {
						map = updatedMap(map, moveWest);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -2;
						System.out.println("?\n"
								+ treasure +"m\n"
										+ potato + "m\n"
												+ watch +"m");
						
					}
					else if(direction3.equals("SOUTH")) {
						map = updatedMap(map, moveWest);
						treasure = updatedMap(map, treasure);
						potato = updatedMap(map, potato);
						watch = updatedMap(map, watch);
						health = health -2;
						System.out.println("?\n"
								+ treasure +"m\n"
										+ potato + "m\n"
												+ watch +"m");
					}
					
					
				else {
					err("");
				}
				}
				else {
					err("");
				}
			
			}
		}
	}
}
		

	public static void main(String[] args) {
		userPlay();
		
	}



	private static int updatedMap(int map, int move) {
		return map - move;
	}
	private static String err(String error) {
		error = ("Please enter a valid diretion: North, East, South or West");
		return error;
	}
}


