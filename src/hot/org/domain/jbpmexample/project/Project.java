package org.domain.jbpmexample.project;

import org.jboss.seam.annotations.Name;

@Name("project")
public class Project {
	
	private String projectName;
	private String estimatedTime;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
}
