package com.buoi3.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@Table(name = "share")
public class Share {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	@Column(name="userId")
	private Integer userId;
	@Column(name="videoId")
	private Integer videoId;
	@Column(name="email")
	private String email;
	@Column(name="shareDate")
	private Date shareDate;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="userId")
//	private User user;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="videoId")
//	private Post post;
	
	
	
	
	
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	public Post getPost() {
//		return post;
//	}
//	public void setPost(Post post) {
//		this.post = post;
//	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getVideoId() {
		return videoId;
	}
	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getShareDate() {
		return shareDate;
	}
	public void setShareDate(Date shareDate) {
		this.shareDate = shareDate;
	}
	
	
	
}
