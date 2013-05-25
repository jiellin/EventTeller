package db.data;

import java.util.Date;

public class Topic {
	
	private Integer id;
	private String title;
	private String keyWords;
	private String summary;
	private String imgs;
	private Date   startTime;
	private Date   endTime;
	private String articles;
	private String relations;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getArticles() {
		return articles;
	}
	public void setArticles(String articles) {
		this.articles = articles;
	}
	public String getRelations() {
		return relations;
	}
	public void setRelations(String relations) {
		this.relations = relations;
	}
	
	

}
