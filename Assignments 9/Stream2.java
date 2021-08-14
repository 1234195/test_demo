package javaStream;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

 class News {

	int newId;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newId = newId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewId() {
		return newId;
	}
	public void setNewId(int newId) {
		this.newId = newId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newId=" + newId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
}
public class Stream2 {

	private static final char[] Map = null;

	public static void main(String[] args) {
		News n1=new News(5,"Anjali","aaa","My Budget");
		News n2=new News(1,"Avni","bbb","Your budget is increased");
		News n3=new News(6,"Shweta","ccc","Your budget is increased");
		News n4=new News(1,"Aaru","vvv","my budget is decreased");
		News n5=new News(5,"Pratik","www","Your budget");
		News n6=new News(5,"Sunanda","mmm","my budget is here");
		News n7=new News(2,"Snehal","ppp","my budget is here");
	
		
		List<News> news=new ArrayList<>();
		news.add(n1);
		news.add(n2);
		news.add(n3);
		news.add(n4);
		news.add(n5);
		news.add(n6);
		news.add(n7);
		int l = 0;
		
		//Question:4
	
		System.out.println("Max comments");
		for(News n:news) {
			if(n.getComment().length()>l) {
				l=n.getComment().length();
			}
		}
		for(News n:news) {
			if(n.getComment().length()==l) {
				System.out.println(n.getNewId());
			}
		}
		
	   //Question:5
		
		Long count=news.stream().filter(P->P.getComment().contains("budget")).count();
		System.out.println("budget in comments "+count+" times");
		
		
	
}
}
	
	
	
	
	
	

