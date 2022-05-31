/*
 * Created on 2022-05-30 ( 09:11:36 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.hackfse.skilltracker.userprofileservice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * JPA entity class for "UserProfile"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name = "user_profile")
public class UserProfile implements Serializable {

	private static final long serialVersionUID = 1L;

	// --- ENTITY PRIMARY KEY

	private Integer userid;

	// --- ENTITY DATA FIELDS

	private String name;

	private String associateid;

	private Long mobile;

	private String email;

	private Date createdon;

	private Date updatedon;

	// --- ENTITY LINKS ( RELATIONSHIP )

	private List<UserNonTechnicalSkill> listOfUserNonTechnicalSkill;

	private List<UserTechnicalSkill> listOfUserTechnicalSkill;

	/**
	 * Constructor
	 */
	public UserProfile() {
		super();
	}

	public UserProfile(Integer userid, String name, String associateid, Long mobile, String email, Date createdon,
			Date updatedon, List<UserNonTechnicalSkill> listOfUserNonTechnicalSkill,
			List<UserTechnicalSkill> listOfUserTechnicalSkill) {
		super();
		this.userid = userid;
		this.name = name;
		this.associateid = associateid;
		this.mobile = mobile;
		this.email = email;
		this.createdon = createdon;
		this.updatedon = updatedon;
		this.listOfUserNonTechnicalSkill = listOfUserNonTechnicalSkill;
		this.listOfUserTechnicalSkill = listOfUserTechnicalSkill;
	}

	// --- GETTERS & SETTERS FOR FIELDS
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid", nullable = false)
	public Integer getUserid() {
		return this.userid;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "name", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setAssociateid(String associateid) {
		this.associateid = associateid;
	}

	@Column(name = "associateid", nullable = false, length = 30)
	public String getAssociateid() {
		return this.associateid;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Column(name = "mobile", nullable = false)
	public Long getMobile() {
		return this.mobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	@CreationTimestamp
	@Column(name = "createdon", nullable = false)
	public Date getCreatedon() {
		return this.createdon;
	}

	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}

	@UpdateTimestamp
	@Column(name = "updatedon", nullable = false)
	public Date getUpdatedon() {
		return this.updatedon;
	}

	// --- GETTERS FOR LINKS
	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL)
	public List<UserNonTechnicalSkill> getListOfUserNonTechnicalSkill() {
		return this.listOfUserNonTechnicalSkill;
	}

	public void setListOfUserNonTechnicalSkill(List<UserNonTechnicalSkill> listOfUserNonTechnicalSkill) {
		this.listOfUserNonTechnicalSkill = listOfUserNonTechnicalSkill;
	}

	public void setListOfUserTechnicalSkill(List<UserTechnicalSkill> listOfUserTechnicalSkill) {
		this.listOfUserTechnicalSkill = listOfUserTechnicalSkill;
	}

	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL)
	public List<UserTechnicalSkill> getListOfUserTechnicalSkill() {
		return this.listOfUserTechnicalSkill;
	}

	@Override
	public String toString() {
		return "UserProfile [userid=" + userid + ", name=" + name + ", associateid=" + associateid + ", mobile="
				+ mobile + ", email=" + email + ", createdon=" + createdon + ", updatedon=" + updatedon
				+ ", listOfUserNonTechnicalSkill=" + listOfUserNonTechnicalSkill + ", listOfUserTechnicalSkill="
				+ listOfUserTechnicalSkill + "]";
	}

	

}