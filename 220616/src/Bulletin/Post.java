package Bulletin;

import java.util.ArrayList;
import java.util.Scanner;

public class Post {
	private Scanner sc=new Scanner(System.in);
	private int postId;
	private int replyId;
	private String password;
	private String title;
	private String content;
	private ArrayList<Reply> rList=new ArrayList<>();
	
	Post(){}
	Post(int postId,String password,String title,String content){
		this.replyId=1;
		this.postId=postId;
		this.password=password;
		this.title=title;
		this.content=content;
	}
	public void printReplyAll() {
		for(Reply r:rList) {
			System.out.printf("댓글번호:%d\n내용:%s\n\n",r.getReplyId(),r.getContent());
		}
	}
	public void printReply() {
		if(this.rList.isEmpty()) {
			System.out.println("댓글이 없습니다.");
		} else {
			this.printReplyAll();
		}
		System.out.println("수행할 작업을 선택해주세요 1.새로운 댓글작성 2.댓글삭제 3.댓글수정 4.뒤로가기");
		int replyChoice=UtilScanner.nextInt(sc,1,4);
		
		if(replyChoice==1) {
			System.out.println("댓글을 입력해주세요");
			String tempReplyContent=UtilScanner.nextLine(sc);
			System.out.println("사용할 비밀번호 숫자 8자리를 입력해주세요");
			String tempReplyPassword=UtilScanner.nextLine(sc, 8);
			rList.add(new Reply(this.replyId++,tempReplyPassword,tempReplyContent));
		}else if(replyChoice==2&&!rList.isEmpty()) {
			deleteReply();
			printReply();
		} else if(replyChoice==3&&!rList.isEmpty()) {
			updateReply();
			printReply();
		}
	}
	public void deleteReply() {
		System.out.println("삭제할 댓글의 댓글번호를 입력해주세요");
		
		int deleteChoice=UtilScanner.nextInt(sc);
		Reply rTemp=new Reply();
		rTemp.setReplyId(deleteChoice);
		rTemp=rList.get(rList.indexOf(rTemp));
		
		if(rList.contains(rTemp)) {
			System.out.println("비밀번호를 입력해주세요");
			String password=UtilScanner.nextLine(sc, 8);
			if(rTemp.getPassword().equals(password)) {
				System.out.println("정말로 삭제하시겠습니까? Y/N");
				String yOrN=UtilScanner.nextLine(sc);
				if(yOrN.equalsIgnoreCase("y")) {
					rList.remove(rTemp);
				}
			} else {
				System.out.println("잘못된 비밀번호입니다.");
			}
		}
	}
	public void updateReply() {
		System.out.println("수정할 댓글의 댓글번호를 입력해주세요");
		
		int updateChoice=UtilScanner.nextInt(sc);
		Reply rTemp=new Reply();
		rTemp.setReplyId(updateChoice);
		rTemp=rList.get(rList.indexOf(rTemp));
		
		if(rList.contains(rTemp)) {
			System.out.println("비밀번호를 입력해주세요");
			String password=UtilScanner.nextLine(sc, 8);
			if(rTemp.getPassword().equals(password)) {
				System.out.println("수정할 댓글내용을 입력해주세요");
				rTemp.setContent(UtilScanner.nextLine(sc));
			} else {
				System.out.println("잘못된 비밀번호입니다.");
			}
		}
	}
	public boolean equals(Object p) {
		if(p instanceof Post) {
			return this.postId==((Post)p).postId;
		}
		return false;
	}
	public int getId() {
		return this.postId;
	}
	public String getPassword() {
		return this.password;
	}
	public String getContent() {
		return this.content;
	}
	public String getTitle() {
		return this.title;
	}
	public ArrayList<Reply> getReplyList(){
		return this.rList;
	}
	public void setId(int postId) {
		this.postId = postId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setReplyList(Reply r) {
		this.rList.add(r);
	}
}
