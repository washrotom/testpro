package homework;

public class BookMgr extends Book {
	Book Booklist [];
	
	BookMgr(Book Booklist[]){
		this.Booklist = Booklist;
	}

	
	public void printBookList() {
	for(int i=0; Booklist.length > i; i++) {
		System.out.println(Booklist[i].getTitle());
	}
	}
	
	public void printTotalPrice() {
		int sum = 0;
	for(int i=0; Booklist.length > i; i++) {
		sum = sum + Booklist[i].getPrice();
	}
	System.out.println(sum);
	}
}
