import java.util.Scanner;

public class UserInterface {
	
	private Scanner ui; 
	private Player player; 
	private Map map; 
	
	public UserInterface(){
		player = new Player(50,50,50); 
		map = new Map(); 
		ui = new Scanner(System.in); 		
	}
	
	public void startMenu(){
		System.out.println("Hello, Welcome to ruins of Karthaal. Lets setup your character.");
		System.out.println("What's your name?");
		player.setName(ui.next());
		if(player.getName().equals("superuser")){
			player.setHealth(100000);
			player.setGold(100000);
			player.setMagicka(100000);
			player.setLevel(99);
		}
	}
}
