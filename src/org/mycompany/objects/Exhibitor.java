package org.mycompany.objects;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Exhibitor implements Serializable{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="exhibitor_id_seq")
//	@SequenceGenerator(name="exhibitor_id_seq", sequenceName="exhibitor_id_seq", allocationSize=1)
//	@Column(name="ID")
	private int id;
	
	private Integer importBatchId;
	private Integer editionId;
	private String name;
	private String shortName;
	private String publishedName;
	private boolean featured;
	private boolean firsttime;
	private String customref1;
	private String customref2;
	private String statusClientAndBilling = "";
	private Date dueDateClientAndBilling;
	private String statusOrder = "";
	private Date dueDateOrder;
	private String statusAccount = "";
	private Date dueDateAccount;
	private String statusFollowupNotes;
	private Date dueDateFollowupNotes;
	private String statusConfirmation;
	private Date dueDateConfirmation;
	private String initialDescription;
	private String fullDescription;
	private String foreignId;
	private String orderEmailSubject;
	private String orderEmailBody;
	private String orderSalesRep;
	private boolean mainExhibitor;
	private boolean deleted;
	private String color;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getImportBatchId() {
		return importBatchId;
	}
	public void setImportBatchId(Integer importBatchId) {
		this.importBatchId = importBatchId;
	}
	public Integer getEditionId() {
		return editionId;
	}
	public void setEditionId(Integer edition_id) {
		this.editionId = edition_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getPublishedName() {
		return publishedName;
	}
	public void setPublishedName(String publishedName) {
		this.publishedName = publishedName;
	}
	public boolean isFeatured() {
		return featured;
	}
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	public boolean isFirsttime() {
		return firsttime;
	}
	public void setFirsttime(boolean firsttime) {
		this.firsttime = firsttime;
	}
	public String getCustomref1() {
		return customref1;
	}
	public void setCustomref1(String customref1) {
		this.customref1 = customref1;
	}
	public String getCustomref2() {
		return customref2;
	}
	public void setCustomref2(String customref2) {
		this.customref2 = customref2;
	}
	public String getStatusClientAndBilling() {
		return statusClientAndBilling;
	}
	public void setStatusClientAndBilling(String statusClientAndBilling) {
		this.statusClientAndBilling = statusClientAndBilling;
	}
	public Date getDueDateClientAndBilling() {
		return dueDateClientAndBilling;
	}
	public void setDueDateClientAndBilling(Date dueDateClientAndBilling) {
		this.dueDateClientAndBilling = dueDateClientAndBilling;
	}
	public String getStatusOrder() {
		return statusOrder;
	}
	public void setStatusOrder(String statusOrder) {
		this.statusOrder = statusOrder;
	}
	public Date getDueDateOrder() {
		return dueDateOrder;
	}
	public void setDueDateOrder(Date dueDateOrder) {
		this.dueDateOrder = dueDateOrder;
	}
	public String getStatusAccount() {
		return statusAccount;
	}
	public void setStatusAccount(String statusAccount) {
		this.statusAccount = statusAccount;
	}
	public Date getDueDateAccount() {
		return dueDateAccount;
	}
	public void setDueDateAccount(Date dueDateAccount) {
		this.dueDateAccount = dueDateAccount;
	}
	public String getStatusFollowupNotes() {
		return statusFollowupNotes;
	}
	public void setStatusFollowupNotes(String statusFollowupNotes) {
		this.statusFollowupNotes = statusFollowupNotes;
	}
	public Date getDueDateFollowupNotes() {
		return dueDateFollowupNotes;
	}
	public void setDueDateFollowupNotes(Date dueDateFollowupNotes) {
		this.dueDateFollowupNotes = dueDateFollowupNotes;
	}
	public String getStatusConfirmation() {
		return statusConfirmation;
	}
	public void setStatusConfirmation(String statusConfirmation) {
		this.statusConfirmation = statusConfirmation;
	}
	public Date getDueDateConfirmation() {
		return dueDateConfirmation;
	}
	public void setDueDateConfirmation(Date dueDateConfirmation) {
		this.dueDateConfirmation = dueDateConfirmation;
	}
	public String getInitialDescription() {
		return initialDescription;
	}
	public void setInitialDescription(String initialDescription) {
		this.initialDescription = initialDescription;
	}
	public String getFullDescription() {
		return fullDescription;
	}
	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}
	public String getForeignId() {
		return foreignId;
	}
	public void setForeignId(String foreignId) {
		this.foreignId = foreignId;
	}
	public String getOrderEmailSubject() {
		return orderEmailSubject;
	}
	public void setOrderEmailSubject(String orderEmailSubject) {
		this.orderEmailSubject = orderEmailSubject;
	}
	public String getOrderEmailBody() {
		return orderEmailBody;
	}
	public void setOrderEmailBody(String orderEmailBody) {
		this.orderEmailBody = orderEmailBody;
	}
	public String getOrderSalesRep() {
		return orderSalesRep;
	}
	public void setOrderSalesRep(String orderSalesRep) {
		this.orderSalesRep = orderSalesRep;
	}
	public boolean isMainExhibitor() {
		return mainExhibitor;
	}
	public void setMainExhibitor(boolean mainExhibitor) {
		this.mainExhibitor = mainExhibitor;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Exhibitor [id=" + id + ", importBatchId=" + importBatchId
				+ ", edition_id=" + editionId + ", name=" + name
				+ ", shortName=" + shortName + ", publishedName="
				+ publishedName + ", featured=" + featured + ", firsttime="
				+ firsttime + ", customref1=" + customref1 + ", customref2="
				+ customref2 + ", statusClientAndBilling="
				+ statusClientAndBilling + ", dueDateClientAndBilling="
				+ dueDateClientAndBilling + ", statusOrder=" + statusOrder
				+ ", dueDateOrder=" + dueDateOrder + ", statusAccount="
				+ statusAccount + ", dueDateAccount=" + dueDateAccount
				+ ", statusFollowupNotes=" + statusFollowupNotes
				+ ", dueDateFollowupNotes=" + dueDateFollowupNotes
				+ ", statusConfirmation=" + statusConfirmation
				+ ", dueDateConfirmation=" + dueDateConfirmation
				+ ", initialDescription=" + initialDescription
				+ ", fullDescription=" + fullDescription + ", foreignId="
				+ foreignId + ", orderEmailSubject=" + orderEmailSubject
				+ ", orderEmailBody=" + orderEmailBody + ", orderSalesRep="
				+ orderSalesRep + ", mainExhibitor=" + mainExhibitor
				+ ", deleted=" + deleted + ", color=" + color + "]";
	}
	
	
}
