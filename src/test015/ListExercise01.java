package test015;

import java.util.List;
import java.util.ArrayList;

public class ListExercise01 {

	public static void main(String[] args) {

		List<Book> list = new ArrayList<Book>();
		list.add(new Book("锟斤拷楼锟斤拷", "锟斤拷雪锟斤拷", 120));
		list.add(new Book("锟斤拷锟斤拷锟斤拷锟斤拷", "锟睫癸拷锟斤拷", 220));
		list.add(new Book("水浒达拷", "施锟斤拷锟斤拷", 100));
		list.add(new Book("锟斤拷锟轿硷拷", "锟斤拷卸锟�", 150));

//		for (Book book: list) {
//			System.out.println(book.getPrice());
//		}

		List<Book> temp = new ArrayList<Book>();
		temp.add(new Book("null", "null", -1));
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getPrice() < list.get(j + 1).getPrice()) {
//					temp = list[j];
//					list[j] = list[j+1];
//					list[j+1] = list[j];
				}
			}
		}
	}
}

class Book {
	private String name;
	private String author;
	private double price;

	public Book(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}

}