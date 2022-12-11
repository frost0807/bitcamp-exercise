package Bulletin;

public class Reply {
	private int replyId;
	private String password;
	private String content;
	
	Reply(){}
	Reply(int replyId,String password,String content){
		this.replyId=replyId;
		this.password=password;
		this.content=content;
	}
	
	public boolean equals(Object r) {
		if(r instanceof Reply) {
			return this.replyId==((Reply)r).replyId;
		}
		return false;
	}
	public int getReplyId() {
		return replyId;
	}
	public String getContent() {
		return content;
	}
	public String getPassword() {
		return this.password;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setPassword(String password) {
		this.password=password;
	}
}
