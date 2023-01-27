package entities;

public class estudantesEx1 {
	private String name;
	private String email;
	private int room;
	public estudantesEx1(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public estudantesEx1() {
		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setRoom(int room)
	{
		this.room = room;
	}
	public int getRoom()
	{
		return room;
	}

}
