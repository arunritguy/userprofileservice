/*
 * Created on 2022-05-30 ( 09:11:36 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.hackfse.skilltracker.userprofileservice.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * JPA entity class for "UserNonTechnicalSkill"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name = "user_non_technical_skill")
public class UserNonTechnicalSkill implements Serializable {

	private static final long serialVersionUID = 1L;

	// --- ENTITY PRIMARY KEY

	private Integer nontechskillid;

	private String skillname;

	private Integer skillvalue;

	private Date createdon;

	private Date updatedon;

	// --- ENTITY LINKS ( RELATIONSHIP )
	private UserProfile userProfile;

	/**
	 * Constructor
	 */
	public UserNonTechnicalSkill() {
		super();
	}

	public UserNonTechnicalSkill(Integer nontechskillid, String skillname, Integer skillvalue, Date createdon,
			Date updatedon, UserProfile userProfile) {
		super();
		this.nontechskillid = nontechskillid;
		this.skillname = skillname;
		this.skillvalue = skillvalue;
		this.createdon = createdon;
		this.updatedon = updatedon;
		this.userProfile = userProfile;
	}

	// --- GETTERS & SETTERS FOR FIELDS
	public void setNontechskillid(Integer nontechskillid) {
		this.nontechskillid = nontechskillid;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "nontechskillid", nullable = false)
	public Integer getNontechskillid() {
		return this.nontechskillid;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	@Column(name = "skillname", nullable = false, length = 100)
	public String getSkillname() {
		return this.skillname;
	}

	public void setSkillvalue(Integer skillvalue) {
		this.skillvalue = skillvalue;
	}

	@Column(name = "skillvalue", nullable = false)
	public Integer getSkillvalue() {
		return this.skillvalue;
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
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid", referencedColumnName = "userid")
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Override
	public String toString() {
		return "UserNonTechnicalSkill [nontechskillid=" + nontechskillid + ", skillname=" + skillname + ", skillvalue="
				+ skillvalue + ", createdon=" + createdon + ", updatedon=" + updatedon + ", userProfile=" + userProfile
				+ "]";
	}

	
}
