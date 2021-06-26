package com.buoi3.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

//@NamedQueries(
//		@NamedQuery(
//				name="User.getListActive",
//				query="SELECT obj FROM User obj WHERE obj.status = 1"
//				)
//		)


@Entity
@Table(name = "users")

public class User {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="number")
	private String number;
	@Column(name="gender")
	private String gender;
	@Column(name="roler")
	private Integer roler;
	
	@Column(name = "status")
	private Integer status;
	
//	@OneToMany(
//			mappedBy="user",
//			fetch = FetchType.LAZY
//			)
//	private List<Share> shares;
//	
//	@OneToMany(
//			mappedBy="user",
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
	public User() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getRoler() {
		return roler;
	}
	public void setRoler(Integer roler) {
		this.roler = roler;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	
}

