 class Book
{
	String title;
	String author;
	double price;
	double totalPrice;
	
	public void setTitle(String tname)
	{
		title=tname;
		
	}
	public void setAuthor(String aname)
	{
		author=aname;
	}
	public void setPrice(double price)
	{
		
		this.price=price;
		if(price<=500)
		totalPrice=(0.35*price);
		else
		totalPrice=(0.15*price);
		
		
	}
	public String getTitle()
	{
			return title;
	}
	public String getAuthor()
	{
			return author;
	}
	public String toString()
	{
	return ("Title:" + getTitle() + "\n"+ "Author:" + getAuthor() + "\n" + "Price:" + price + "Totalprice" + totalPrice);
		
	}
}
public class Practice19
{
	public static void main(String args[])
	{
		Book b1=new Book();
		Book b2=new Book();
		
		b1.setTitle("Ramayanam");
		b1.setAuthor("valmiki");
		b1.setPrice(500);
		System.out.println(b1.toString());
		
		b2.setTitle("wings of fire");
		b2.setAuthor("abdul kalam");
		b2.setPrice(1000);
		System.out.println(b2.toString());
		
		
		
	}
}
		
		
		