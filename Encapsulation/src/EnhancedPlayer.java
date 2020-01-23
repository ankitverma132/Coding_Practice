public class EnhancedPlayer {

	private String name;
	private int health=1000;
	private String weapon;
	
	public EnhancedPlayer(String name, int health, String weapon) 
	{
		super();
		this.name = name;
		if(this.health>=0 && this.health<=100)
		{ 	
		this.health = health;
	    System.out.println("hmm");
	    }
		this.weapon = weapon;
	}
	public void loseHealth(int damage)
	{
		this.health=this.health-damage;
		if(this.health<=0)
		   System.out.println("knocked out");	
	}
	public int getHealth() {
		return health;
	}
}
