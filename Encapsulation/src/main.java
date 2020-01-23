
public class main {

	public static void main(String[] args) {
		
//		player Player=new player();
//		Player.name="Tim";
//		Player.health=20;
//		Player.weapon="sword";
//		
//		int damage=10;
//		Player.loseHealth(damage);
//		System.out.println(Player.healthRemaining());
//		
//		damage=11;
//		Player.health=200;
//		Player.loseHealth(damage);
//		System.out.println(Player.healthRemaining());

	EnhancedPlayer player=new EnhancedPlayer("Tim",70,"sword");
	
	System.out.println("Initial health " + player.getHealth());
	
	
}
}
