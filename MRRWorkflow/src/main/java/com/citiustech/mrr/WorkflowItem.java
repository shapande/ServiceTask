package com.citiustech.mrr;

import java.util.Date;
import javax.persistence.Column;

/**
 * This class was automatically generated by the data modeler tool.
 */
@javax.persistence.Entity
public class WorkflowItem implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(generator = "WORKFLOWITEM_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.SequenceGenerator(name = "WORKFLOWITEM_ID_GENERATOR", sequenceName = "WORKFLOWITEM_ID_SEQ")
	@javax.persistence.Column(name = "WorkflowItemId")
	private java.lang.Integer workflowItemId;

	@javax.persistence.Column(name = "ProjectId")
	private java.lang.Integer projectId;

	@javax.persistence.Column(name = "MemberId")
	private java.lang.Integer memberId;

	@javax.persistence.Column(name = "MeasureCode")
	private java.lang.String measureCode;

	@javax.persistence.Column(name = "SubMeasureGroupId")
	private java.lang.Integer subMeasureGroupId;

	@javax.persistence.Column(name = "VisitSSUI")
	private java.lang.Integer visitSSUI;

	@javax.persistence.Column(name = "DenominatorInclusionDate")
	private java.util.Date denominatorInclusionDate;

	@javax.persistence.Column(name = "MedicalRecordId")
	private java.lang.Integer medicalRecordId;

	@javax.persistence.Column(name = "ChaseItemId")
	private java.lang.Integer chaseItemId;

	@javax.persistence.Column(name = "StatusCode")
	private java.lang.String statusCode;

	@javax.persistence.Column(name = "DueDate")
	private java.util.Date dueDate;

	@javax.persistence.Column(name = "AssignedTo")
	private java.lang.String assignedTo;

	@javax.persistence.Column(name = "ReportingFromDate")
	private java.util.Date reportingFromDate;

	@javax.persistence.Column(name = "ReportingToDate")
	private java.util.Date reportingToDate;

	@javax.persistence.Column(name = "ActiveFlag")
	private java.lang.Boolean activeFlag;

	@javax.persistence.Column(name = "ProcessInstanceId")
	private java.lang.Long processInstanceId;

	@javax.persistence.Column(name = "WorkflowContainerId")
	private java.lang.Integer workflowContainerId;

	@javax.persistence.Column(name = "WorkflowInProgress")
	private java.lang.Boolean workflowInProgress;

	@javax.persistence.Column(name = "CreatedBy")
	private java.lang.String createdBy;

	@javax.persistence.Column(name = "CreatedDate")
	private java.util.Date createdDate;

	@javax.persistence.Column(name = "ModifiedBy")
	private java.lang.String modifiedBy;

	@javax.persistence.Column(name = "ModifiedDate")
	private java.util.Date modifiedDate;

	@javax.persistence.Column(name = "DeletedFlag")
	private java.lang.Boolean deletedFlag;

	@javax.persistence.Transient
	private java.lang.String defaultRule;

	@javax.persistence.Column(name = "ActionPerformed")
	private java.lang.String action;

	@javax.persistence.Column(name = "SectionFilled")
	private java.lang.String sectionFilled;

	@javax.persistence.Column(name = "GroupId")
	private java.lang.Integer groupId;
 
    @javax.persistence.Column(name = "TaskName")
	private java.lang.String taskName;

	public WorkflowItem() {
	}

	public java.lang.Integer getWorkflowItemId() {
		return this.workflowItemId;
	}

	public void setWorkflowItemId(java.lang.Integer workflowItemId) {
		this.workflowItemId = workflowItemId;
	}

	public java.lang.Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(java.lang.Integer projectId) {
		this.projectId = projectId;
	}

	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(java.lang.Integer memberId) {
		this.memberId = memberId;
	}

	public java.lang.String getMeasureCode() {
		return this.measureCode;
	}

	public void setMeasureCode(java.lang.String measureCode) {
		this.measureCode = measureCode;
	}

	public java.lang.Integer getSubMeasureGroupId() {
		return this.subMeasureGroupId;
	}

	public void setSubMeasureGroupId(java.lang.Integer subMeasureGroupId) {
		this.subMeasureGroupId = subMeasureGroupId;
	}

	public java.lang.Integer getVisitSSUI() {
		return this.visitSSUI;
	}

	public void setVisitSSUI(java.lang.Integer visitSSUI) {
		this.visitSSUI = visitSSUI;
	}

	public java.util.Date getDenominatorInclusionDate() {
		return this.denominatorInclusionDate;
	}

	public void setDenominatorInclusionDate(
			java.util.Date denominatorInclusionDate) {
		this.denominatorInclusionDate = denominatorInclusionDate;
	}

	public java.lang.Integer getMedicalRecordId() {
		return this.medicalRecordId;
	}

	public void setMedicalRecordId(java.lang.Integer medicalRecordId) {
		this.medicalRecordId = medicalRecordId;
	}

	public java.lang.Integer getChaseItemId() {
		return this.chaseItemId;
	}

	public void setChaseItemId(java.lang.Integer chaseItemId) {
		this.chaseItemId = chaseItemId;
	}

	public java.lang.String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(java.lang.String statusCode) {
		this.statusCode = statusCode;
	}

	public java.lang.String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(java.lang.String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public java.util.Date getReportingFromDate() {
		return this.reportingFromDate;
	}

	public void setReportingFromDate(java.util.Date reportingFromDate) {
		this.reportingFromDate = reportingFromDate;
	}

	public java.util.Date getReportingToDate() {
		return this.reportingToDate;
	}

	public void setReportingToDate(java.util.Date reportingToDate) {
		this.reportingToDate = reportingToDate;
	}

	public java.lang.Boolean getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(java.lang.Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public java.lang.Long getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(java.lang.Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public java.lang.Integer getWorkflowContainerId() {
		return this.workflowContainerId;
	}

	public void setWorkflowContainerId(java.lang.Integer workflowContainerId) {
		this.workflowContainerId = workflowContainerId;
	}

	public java.lang.Boolean getWorkflowInProgress() {
		return this.workflowInProgress;
	}

	public void setWorkflowInProgress(java.lang.Boolean workflowInProgress) {
		this.workflowInProgress = workflowInProgress;
	}

	public java.lang.String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	public java.util.Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public java.lang.String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(java.lang.String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public java.util.Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public java.lang.Boolean getDeletedFlag() {
		return this.deletedFlag;
	}

	public void setDeletedFlag(java.lang.Boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public java.lang.String getDefaultRule() {
		return this.defaultRule;
	}

	public void setDefaultRule(java.lang.String defaultRule) {
		this.defaultRule = defaultRule;
	}

	public java.util.Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(java.util.Date dueDate) {
		this.dueDate = dueDate;
	}

	public java.lang.String getAction() {
		return this.action;
	}

	public void setAction(java.lang.String action) {
		this.action = action;
	}

	public java.lang.String getSectionFilled() {
		return this.sectionFilled;
	}

	public void setSectionFilled(java.lang.String sectionFilled) {
		this.sectionFilled = sectionFilled;
	}

	public java.lang.Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(java.lang.Integer groupId) {
		this.groupId = groupId;
	}

	public java.lang.String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(java.lang.String taskName) {
		this.taskName = taskName;
	}

	public WorkflowItem(java.lang.Integer workflowItemId,
			java.lang.Integer projectId, java.lang.Integer memberId,
			java.lang.String measureCode, java.lang.Integer subMeasureGroupId,
			java.lang.Integer visitSSUI,
			java.util.Date denominatorInclusionDate,
			java.lang.Integer medicalRecordId, java.lang.Integer chaseItemId,
			java.lang.String statusCode, java.util.Date dueDate,
			java.lang.String assignedTo, java.util.Date reportingFromDate,
			java.util.Date reportingToDate, java.lang.Boolean activeFlag,
			java.lang.Long processInstanceId,
			java.lang.Integer workflowContainerId,
			java.lang.Boolean workflowInProgress, java.lang.String createdBy,
			java.util.Date createdDate, java.lang.String modifiedBy,
			java.util.Date modifiedDate, java.lang.Boolean deletedFlag,
			java.lang.String defaultRule, java.lang.String action,
			java.lang.String sectionFilled, java.lang.Integer groupId,
			java.lang.String taskName) {
		this.workflowItemId = workflowItemId;
		this.projectId = projectId;
		this.memberId = memberId;
		this.measureCode = measureCode;
		this.subMeasureGroupId = subMeasureGroupId;
		this.visitSSUI = visitSSUI;
		this.denominatorInclusionDate = denominatorInclusionDate;
		this.medicalRecordId = medicalRecordId;
		this.chaseItemId = chaseItemId;
		this.statusCode = statusCode;
		this.dueDate = dueDate;
		this.assignedTo = assignedTo;
		this.reportingFromDate = reportingFromDate;
		this.reportingToDate = reportingToDate;
		this.activeFlag = activeFlag;
		this.processInstanceId = processInstanceId;
		this.workflowContainerId = workflowContainerId;
		this.workflowInProgress = workflowInProgress;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.deletedFlag = deletedFlag;
		this.defaultRule = defaultRule;
		this.action = action;
		this.sectionFilled = sectionFilled;
		this.groupId = groupId;
		this.taskName = taskName;
	}

}