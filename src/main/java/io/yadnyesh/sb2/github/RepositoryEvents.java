package io.yadnyesh.sb2.github;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class RepositoryEvents {
	private Type type;
	
	private OffsetDateTime creationTime;
	
	private Actor actor;
	
	private Issue issue;
	
	public RepositoryEvents(@JsonProperty("event") Type type,
							@JsonProperty("created_at") OffsetDateTime creationTime,
							@JsonProperty("actor") Actor actor,
							@JsonProperty("issue") Issue issue) {
		this.type = type;
		this.creationTime = creationTime;
		this.actor = actor;
		this.issue = issue;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public OffsetDateTime getCreationTime() {
		return creationTime;
	}
	
	public void setCreationTime(OffsetDateTime creationTime) {
		this.creationTime = creationTime;
	}
	
	public Actor getActor() {
		return actor;
	}
	
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	public Issue getIssue() {
		return issue;
	}
	
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	
	public enum Type {
		
		CLOSED("closed"),
		REOPENED("reopened"),
		SUBSCRIBED("subscribed"),
		UNSUBSCRIBED("unsubscribed"),
		MERGED("merged"),
		REFERENCED("referenced"),
		MENTIONED("mentioned"),
		ASSIGNED("assigned"),
		UNASSIGNED("unassigned"),
		LABELED("labeled"),
		UNLABELED("unlabeled"),
		MILESTONED("milestoned"),
		DEMILESTONED("demilestoned"),
		RENAMED("renamed"),
		LOCKED("locked"),
		UNLOCKED("unlocked"),
		HEAD_REF_DELETED("head_ref_deleted"),
		HEAD_REF_RESTORED("head_ref_restored"),
		CONVERTED_NOTE_TO_ISSUE("converted_note_to_issue"),
		MOVED_COLUMNS_IN_PROJECT("moved_columns_in_project");
		
		private String type;
		
		Type(String type) {
			this.type = type;
		}
		
		static Type valueFrom(String type) {
			for (Type value : values()) {
				if (type.equals(value.type)) {
					return value;
				}
			}
			throw new IllegalArgumentException(
					"'" + type + "' is not a valid event type");
		}
	}
}
