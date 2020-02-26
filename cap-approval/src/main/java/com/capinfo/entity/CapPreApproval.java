/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.capinfo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


/**
 * 预审Entity
 * @author 孙本进
 * @version 2020-02-25
 */
@Table(name = "cap_pre_approval")
public class CapPreApproval {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name="filler")
	private String filler;		// 填报人（手动填写）
	@Column(name="phone")
	private String phone;		// 手机号（手动填写）
	@Column(name="service_kind")
	private String serviceKind;		// 业务分类（字典service_type:1个人2企业）
	@Column(name="service_type")
	private String serviceType;		// 业务类型（字典service_type)
	@Column(name="service_name")
	private String serviceName;		// 业务名称（字典service_name）
	@Column(name="service_child_type")
	private String serviceChildType;		// 业务子类（字典service_child_type）
	@Column(name="submit_date")
	private Date submitDate;		// 提交日期
	@Column(name="pre_approval_result")
	private String preapprovalResult;		// 预审结果（预审结果preapproval_result:1通过2不通过）
	@Column(name="company_name")
	private String companyName;		// 企业名称
	@Column(name="company_credit_code")
	private String companyCreditCode;		// 企业信用代码
	@Column(name="pre_approval_status")
	private String preapprovalStatus;		// 预审状态（字典preapproval_type:0保存未提交1材料预审中2预审未通过3预审已通过4预审已取消）
	@Column(name="pre_approval_num")
	private String preapprovalNum;		// 预审编号自动生成
	@Column(name="assign_type")
	private String assignType;		// 分派形式（预留字段,字典assign_type:0自动分派-默认，1手动分派）
	@Column(name="proc_ins_id")
	private String procInsId;		// 流程实例id
	@Column(name="task_status")
	private String taskStatus;		// 签收状态（字典task_status：0未签收1已签收）
	@Column(name="pre_approval_dept")
	private String preapprovalDept;		// 预审部门（sys_office的id）
	@Column(name="pre_approval_person")
	private String preapprovalPerson;		// 预审人员（sys_user的id）
	@Column(name="handle_type")
	private String handleType;		// 办理方式（字典handle_type:1直接办理2邮寄办理3现场办理）
	@Column(name="pre_approval_suggestion")
	private String preapprovalSuggestion;		// 预审意见


	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getServiceKind() {
		return serviceKind;
	}

	public void setServiceKind(String serviceKind) {
		this.serviceKind = serviceKind;
	}
	
	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public String getServiceChildType() {
		return serviceChildType;
	}

	public void setServiceChildType(String serviceChildType) {
		this.serviceChildType = serviceChildType;
	}
	
	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	
	public String getPreapprovalResult() {
		return preapprovalResult;
	}

	public void setPreapprovalResult(String preapprovalResult) {
		this.preapprovalResult = preapprovalResult;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyCreditCode() {
		return companyCreditCode;
	}

	public void setCompanyCreditCode(String companyCreditCode) {
		this.companyCreditCode = companyCreditCode;
	}
	
	public String getPreapprovalStatus() {
		return preapprovalStatus;
	}

	public void setPreapprovalStatus(String preapprovalStatus) {
		this.preapprovalStatus = preapprovalStatus;
	}
	
	public String getPreapprovalNum() {
		return preapprovalNum;
	}

	public void setPreapprovalNum(String preapprovalNum) {
		this.preapprovalNum = preapprovalNum;
	}
	
	public String getAssignType() {
		return assignType;
	}

	public void setAssignType(String assignType) {
		this.assignType = assignType;
	}
	
	public String getProcInsId() {
		return procInsId;
	}

	public void setProcInsId(String procInsId) {
		this.procInsId = procInsId;
	}
	
	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	public String getPreapprovalDept() {
		return preapprovalDept;
	}

	public void setPreapprovalDept(String preapprovalDept) {
		this.preapprovalDept = preapprovalDept;
	}
	
	public String getPreapprovalPerson() {
		return preapprovalPerson;
	}

	public void setPreapprovalPerson(String preapprovalPerson) {
		this.preapprovalPerson = preapprovalPerson;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}
	
	public String getPreapprovalSuggestion() {
		return preapprovalSuggestion;
	}

	public void setPreapprovalSuggestion(String preapprovalSuggestion) {
		this.preapprovalSuggestion = preapprovalSuggestion;
	}
	
}