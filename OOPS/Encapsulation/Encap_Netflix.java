class Encap_Webseries
{ 
	private String name;
	private int episodes;
	private double ratings;
	private boolean aCertified;
	Encap_Webseries(String name,int episodes,double ratings,boolean aCeritified)
	{
		this.name=name;
		this.episodes=episodes;
		this.ratings=ratings;
		this.aCertified=aCertified;
	}	
	//getter methods
	public String getName()
	{
		return name;
	}
	public int getEpisodes()
	{
		return episodes;
	}
	public double getRatings()
	{
		return ratings ;
	}
	public boolean getACertified()
	{
		return aCertified;
	}
	//setter methods
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEpisodes(int epispdes)
	{
		this.episodes=episodes;
	}
	public void setRatings(double ratings)
	{
		this.ratings=ratings;
	}
	public void setACertified(boolean aCertified)
	{
		this.aCertified=aCertified;
	}
}
	
class Encap_Netflix
{
	public static void main(String[] args) 
	{
		Encap_Webseries w1=new Encap_Webseries("Dark",8,9.2,true);
		System.out.println(w1.getName());
		System.out.println(w1.getEpisodes());
		System.out.println(w1.getRatings());
		System.out.println(w1.getACertified());
		System.out.println("-----after change-----");
		w1.setName("Stranger Things");
		System.out.println(w1.getName());
		w1.setEpisodes(18);
		System.out.println(w1.getEpisodes());
		w1.setRatings(10);
		System.out.println(w1.getRatings());
		w1.setACertified(false);
		System.out.println(w1.getACertified());
		
		
		
		
	}
}
