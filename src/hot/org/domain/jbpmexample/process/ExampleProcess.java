package org.domain.jbpmexample.process;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.bpm.CreateProcess;

@Name("exampleProcess")
@AutoCreate
public class ExampleProcess {

	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String demandType;

	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String customer;
	
	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String product;
	
	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String projectDescription;
	
	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String projectDuration;
	
	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String comments;
	
	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String hours;

	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String managerReport;
	
	@In(scope = ScopeType.BUSINESS_PROCESS, required = false)
	@Out(scope = ScopeType.BUSINESS_PROCESS, required = false)
	private String consultantReport;
	
	@CreateProcess(definition = "jBPMExample")
	public void createProcess() {}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getManagerReport() {
		return managerReport;
	}

	public void setManagerReport(String managerReport) {
		this.managerReport = managerReport;
	}

	public String getConsultantReport() {
		return consultantReport;
	}

	public void setConsultantReport(String consultantReport) {
		this.consultantReport = consultantReport;
	}

	public String getDemandType() {
		return demandType;
	}

	public void setDemandType(String demandType) {
		this.demandType = demandType;
	}
}
