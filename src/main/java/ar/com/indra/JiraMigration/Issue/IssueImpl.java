package ar.com.indra.JiraMigration.Issue;

import java.util.ArrayList;
import java.util.List;

import ar.com.indra.JiraMigration.Connection.Connection;
import net.rcarz.jiraclient.JiraClient;

public class IssueImpl  {


	String id;
	String number;
	String project;
	String reporter;
	String assignee;
	String creator;
	String type;
	String summary;
	String priority;
	String status;
	String created;
	String updated;
	String votes;
	String watches;
	String description;
	List comentarios;

	public IssueImpl() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getVotes() {
		return votes;
	}

	public void setVotes(String votes) {
		this.votes = votes;
	}

	public String getWatches() {
		return watches;
	}

	public void setWatches(String watches) {
		this.watches = watches;
	}

	public void createIssue() {
		// TODO Auto-generated method stub

	}

	public void addComment() {
		// TODO Auto-generated method stub

	}

}
