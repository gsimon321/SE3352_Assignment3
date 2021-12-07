package ModelViewController;

import java.util.ArrayList;

import org.w3c.dom.Comment;

public class Comments {
	
	private ArrayList<Comment> comments = new ArrayList<Comment>(); //list to hold all comments
	private CommentBox commentBox; //comment pox private variable
	private ViewPage view; //private variable for the view this controller will update
	
	public void CommentController(Comment comment, CommentBox commentBox) {// controller Method to populate comment boxes 
		this.commentBox = comments;
	}
	

	public void editComment(Comment comment, int commentID) {//method used to edit an existing comment
		for(int i = 0; i < comments.Length; i++) {
			if commentID = comments[i].commentID{
				comments[i] = comment;
			}
		}
	}
	
	public void addComment(Comment comment) { //method to create a new comment
		comments.add(comment);
	}
	
	public void getComments() { //method to get comments in the comment box
		return commentBox;
	}
	
	public void updateView() { //method to update the view with the comments 
		view.presentContent(commentbox.getComments);
	}
}
