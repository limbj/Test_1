package article.service;

public class DeleteRequest {

	private String userId;
	private int articleNumber;

	public DeleteRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DeleteRequest(String userId, int articleNumber) {
		super();
		this.userId = userId;
		this.articleNumber = articleNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}

}
