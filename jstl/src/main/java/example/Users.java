package example;

import java.util.List;
import java.util.ArrayList;

public class Users 
{
	private List<User> data = new ArrayList<User>();
	public Users()
	{
		data.add(new User(1, "Author 1"));
		data.add(new User(2, "Author 2"));
	}
	public List<User> getData()
	{
		return data;
	}
	public void setData(List<User> data)
	{
		this.data = data;
	}
}
