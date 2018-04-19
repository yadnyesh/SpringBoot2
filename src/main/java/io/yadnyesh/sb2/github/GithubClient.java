package io.yadnyesh.sb2.github;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GithubClient {
	public String EVENTS_ISSUES_URL = "https://api.github.com/repos/{owner}/{repo}/issues/events";
	public final RestTemplate restTemplate;
	
	public GithubClient(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public ResponseEntity<RepositoryEvents[]> fetchEvents(String orgName, String repoName) {
		return this.restTemplate.getForEntity(EVENTS_ISSUES_URL, RepositoryEvents[].class, orgName, repoName);
	}
}
