package io.yadnyesh.sb2.github;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Issue {
	private String htmlUrl;
	private int number;
	private String title;
	
	public Issue(@JsonProperty("html_url") String htmlUrl, @JsonProperty("number") int number, @JsonProperty("title") String title) {
		this.htmlUrl = htmlUrl;
		this.number = number;
		this.title = title;
	}
	
	public String getHtmlUrl() {
		return htmlUrl;
	}
	
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Issue{" + "htmlUrl='" + htmlUrl + '\'' + ", number=" + number + ", title='" + title + '\'' + '}';
	}
}
