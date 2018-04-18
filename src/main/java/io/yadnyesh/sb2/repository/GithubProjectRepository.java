package io.yadnyesh.sb2.repository;

import io.yadnyesh.sb2.events.GithubProject;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface GithubProjectRepository implements PagingAndSortingRepository<GithubProject, Long> {

}
