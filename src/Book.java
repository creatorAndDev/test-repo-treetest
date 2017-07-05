public class Book implements Comparable<Book> {
	String title;
	public int compareTo(Book s){
		return title.compareTo(s.getTitle());
	}
	private String getTitle() {
		return title;
	}
	public Book(String t) {
		title = t;
	}
	public String toString(){
		return title;
	}
}
