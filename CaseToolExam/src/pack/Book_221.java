package pack;

public class Book_221 {
int page_num;
int total_pages;

Book_221(int total_pages){
	this.total_pages=total_pages;
	this.page_num=1;
}
	int go_forward(){
	page_num++;
	return page_num;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
