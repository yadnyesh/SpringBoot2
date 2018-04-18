package io.yadnyesh.sb2.github;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Actor {
	
	private String login;
	private String avatarUrl;
	private String htmlUrl;
	
	public Actor(@JsonProperty("login") String login, @JsonProperty("avatar_url") String avatarUrl, @JsonProperty("html_url") String htmlUrl) {
		this.login = login;
		this.avatarUrl = avatarUrl;
		this.htmlUrl = htmlUrl;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getAvatarUrl() {
		return avatarUrl;
	}
	
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	
	public String getHtmlUrl() {
		return htmlUrl;
	}
	
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}
	
	@Override
	public String toString() {
		return "Actor{" + "login='" + login + '\'' + ", avatarUrl='" + avatarUrl + '\'' + ", htmlUrl='" + htmlUrl + '\'' + '}';
	}
}
