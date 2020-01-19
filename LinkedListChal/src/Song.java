public class Song {
	
	private String title;
	private double duration;
	public Song(String title, double duration)
	{
		super();
		this.title = title;
		this.duration = duration;
	}
	public String getTitle()
	{
		return title;
	}
	@Override
    public String toString()      //toString method return name of the class which overriden and some hashcode here.
    {
    	return this.title + ":" + this.duration;   	
    }
	
}
