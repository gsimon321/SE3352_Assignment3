package ModelViewController;

import java.util.ArrayList;

public class Viewer {
	private Page page; //comment pox private variable
	private ViewPage view; //private variable for the view this controller will update
	
	public void CommentController(Page page) {// controller Method to set thew page the student is viewing
		this.page = page;
	}
	
	public void updateView() { //method to update the view of the page
		view.presentContent(page);
	}
}
