package article.service;

import article.model.Article;
import article.model.ArticleContent;

public class ArticleData {

	private Article article;
	private ArticleContent content;

	public ArticleData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticleData(Article article, ArticleContent content) {
		super();
		this.article = article;
		this.content = content;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getContent() {
		return content.getContent();
	}

	public void setContent(ArticleContent content) {
		this.content = content;
	}

}
