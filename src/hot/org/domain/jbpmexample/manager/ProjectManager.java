package org.domain.jbpmexample.manager;

import org.domain.jbpmexample.process.ExampleProcess;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;

@Name("projectManager")
public class ProjectManager {

	@In private ExampleProcess exampleProcess;
	
	public String require() {
		exampleProcess.createProcess();
		return "ok";
	}
	
	public String create() {
		return "ok";
	}
	
	public String report() {
		return "ok";
	}
	
	public String close() {
		return "ok";
	}
}
