package ModelViewController;

import java.util.ArrayList;

public class CreatingPage {
	private ArrayList<Page> pages = new ArrayList<Page>(); //list to hold all pages
	private Page page; //comment pox private variable
	private ViewPage view; //private variable for the view this controller will update
	
	public void CommentController(Page page) {// controller Method to populate comment boxes 
		this.page = page;
	}
	
	public void addPage(Page page) { //method to create a new comment
		pages.add(page);
	}
	
	public void updateView() { //method to update the view of the page
		view.presentContent(page.getContent);
	}

}
