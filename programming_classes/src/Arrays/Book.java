package Arrays;

public class Book implements Comparable {
	private String name;
	private int price;
	private String author;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int compareTo(Object o) {
		Book b = (Book) o;
		if (this.price > b.price) {
			return 1;
		} else if(this.price < b.price){
			return -1;
		}
		return 0;
	}
}