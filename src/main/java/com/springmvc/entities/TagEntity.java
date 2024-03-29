package com.springmvc.entities;

import java.util.Set;

import javax.persistence.*;

import com.springmvc.models.Tag;

@Entity
@Table(name = "Tag")
public class TagEntity {

	@Id
	@Column(name = "tag_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tag_id;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	//-----------------------------------------------------------
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "tags")
	public Set<PostEntity> posts;
	
	//-----------------------------------------------------------
	
	public static TagEntity newEntity(Tag tag) {
		TagEntity tagEntity = new TagEntity();
		
		tagEntity.setName(tag.getName());
		tagEntity.setTag_id(tag.getTagId());
		
		return tagEntity;
	}
	
	public Set<PostEntity> getPosts() {
		return posts;
	}
	public void setPosts(Set<PostEntity> posts) {
		this.posts = posts;
	}
	public int getTag_id() {
		return tag_id;
	}
	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
