package com.springmvc.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.springmvc.models.UserInfo;

@Entity
@Table(name = "`User`")
public class UserEntity {

	@Id
	@Column(name = "`user_id`")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@Column(nullable = true)
	private String first_name;
	
	@Column(nullable = false)
	private String last_name;
	
	@Column(nullable = true)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthday;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate registration_day;
	
	@Column(nullable = false)
	private int total_post;
	
	@Column(nullable = true)
	private String image;
	
	@Column(nullable = true)
	private String phone_number;

	@Column(nullable = false)
	private String email;
	
	@Column(nullable = true)
	private String address;
	
	@Column(nullable = false)
	private String password;
	
	//---------------------------------------
	
	@OneToMany(mappedBy="user")
    public Set<PostEntity> posts;
	
	@OneToMany(mappedBy = "user")
	private Set<ReplyCommentEntity> reply_comments;
	
	@OneToMany(mappedBy = "user")
	private Set<CommentEntity> comments;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "User_Role", joinColumns = { 
			@JoinColumn(name = "`user_id`", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "`role_id`", 
					nullable = false, updatable = false) })
	private Set<RoleEntity> roles;

	//---------------------------------------
	
	public static UserEntity newEntity(UserInfo user) {
		UserEntity entity = new UserEntity();
		
		entity.setUser_id(user.getUserId());
		entity.setEmail(user.getEmail());
		entity.setFirst_name(user.getFirstName());
		entity.setLast_name(user.getLastName());
		entity.setPassword(user.getPassword());
		entity.setRegistration_day(user.getRegistrationDay());
		entity.setTotal_post(user.getTotalPost());
		entity.setImage(user.getImage());
		entity.setBirthday(user.getBirthday());
		entity.setPhone_number(user.getPhoneNumber());
		entity.setAddress(user.getAddress());
		
		return entity;
	}
	
	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public LocalDate getRegistration_day() {
		return registration_day;
	}
	
	public String getFormatRegistration_day(String pattern) {
		return registration_day.format(DateTimeFormatter.ofPattern(pattern));
	}

	public void setRegistration_day(LocalDate registration_day) {
		this.registration_day = registration_day;
	}

	public int getTotal_post() {
		return total_post;
	}

	public void setTotal_post(int total_post) {
		this.total_post = total_post;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<PostEntity> getPosts() {
		return posts;
	}

	public void setPosts(Set<PostEntity> posts) {
		this.posts = posts;
	}

	public Set<ReplyCommentEntity> getReply_comments() {
		return reply_comments;
	}

	public void setReply_comments(Set<ReplyCommentEntity> reply_comments) {
		this.reply_comments = reply_comments;
	}

	public Set<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(Set<CommentEntity> comments) {
		this.comments = comments;
	}
		
}
