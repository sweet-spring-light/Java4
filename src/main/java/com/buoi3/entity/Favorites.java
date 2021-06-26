package com.buoi3.entity;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "favorites")
public class Favorites implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="userId")
	private Integer userId;
	@Column(name="videoId")
	private Integer videoId;
	@Column(name="likeDate")
	private Date likeDate;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="userId")
//	private User user;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="videoId")
//	private Post post;

	public Favorites() {
		
	}

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

	public Date getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(Date likeDate) {
		this.likeDate = likeDate;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Post getPost() {
//		return post;
//	}
//
//	public void setPost(Post post) {
//		this.post = post;
//	}
	
	

}
