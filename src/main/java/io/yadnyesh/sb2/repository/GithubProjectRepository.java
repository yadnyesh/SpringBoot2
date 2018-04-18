package io.yadnyesh.sb2.repository;

import io.yadnyesh.sb2.events.GithubProject;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GithubProjectRepository extends PagingAndSortingRepository<GithubProject, Long> {
	GithubProject findByRepoName(String repoName);
}
