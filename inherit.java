class Book
{

	String title;
	String author;
	int noOfPgs;
	int price;

	Book(String tit,String aut,int pg,int pr)
	{
		title = tit;
		author = aut;
		noOfPgs = pg;
		price = pr;
	}
	void display()
	{
	System.out.println("\n\n\n*******Book Information***********\n");
        System.out.println("Title of the Book: "+title);
	System.out.println("Author of the Book: "+author);
	System.out.println("Number of pages in the Book: "+noOfPgs);
	System.out.println("Price of the Book: "+price);

	}
		
}

class ScientificBook extends Book
{
	String subject;
	String publisher;

	ScientificBook(String tit,String aut,int pg,int pr,String sub,String pub)
	{
		super(tit,aut,pg,pr);
		subject = sub;
		publisher = pub;
	}
	void scidisplay()
	{
	 display();
	 System.out.println("Subject of the Book: "+subject);
	 System.out.println("Publisher of the Book: "+publisher);

	}
}

class ComicBook extends Book
{
	String type;
	boolean iscolored = false;

	ComicBook(String tit,String aut,int pg,int pr,String typ,boolean isclrd)
	{
		super(tit,aut,pg,pr);
		type = typ;
		iscolored = isclrd;
	}
	void comicdisplay()
	{
	 display();
	 System.out.println("type of comic Book: "+type);
	 System.out.println("is book coloured : "+iscolored);

	}
}

public class inherit 
{
	public static void main(String[] args)
	{
	Book b1 = new Book("Harry Potter","J.K.Rowling",3923,1999);
	ScientificBook b2 = new ScientificBook("cosmos","Carl Sagan",396,399,"Cosmology","Random House");
	ComicBook b3 = new ComicBook("Marvel-Verse: Iron Man","David Michelinie",120 ,306,"sci-fi",true);
	b1.display();
	b2.scidisplay();
	b3.comicdisplay();
	}
}