package com.buoi3.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

//@NamedQueries(
//		@NamedQuery(
//				name="Post.getListActive",
//				query="SELECT obj FROM Post obj WHERE obj.active = 1"
//				)
//		)

@Entity
@Table(name="posts")

public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="tittle")
	private String tittle;
	
	@Column(name="content")
	private String content;
	
	@Column(name="image")
	private String image;
	
	@Column(name="link")
	private String link;
	
	@Column(name="views")
	private Integer views;
	
	@Column(name="active")
	private Integer active;
	
//	@OneToMany(
//			mappedBy="post",
//			fetch = FetchType.LAZY
//			)
//	private List<Share> shares;
//	
//	@OneToMany(
//			mappedBy="post",
//			fetch = FetchType.LAZY
//			)
//	private List<Favorites> favorite;
//	
//	public List<Favorites> getFavorite() {
//		return favorite;
//	}
//	public void setFavorite(List<Favorites> favorite) {
//		this.favorite = favorite;
//	}
//	public List<Share> getShares() {
//		return shares;
//	}
//	public void setShares(List<Share> shares) {
//		this.shares = shares;
//	}
	public Post() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", tittle=" + tittle + ", content=" + content + ", image=" + image + ", link=" + link
				+ ", views=" + views + ", active=" + active + "]";
	}
	
	
	
}

