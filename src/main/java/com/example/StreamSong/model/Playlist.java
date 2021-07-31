package com.example.StreamSong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PLAY_LIST")
public class Playlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "IMAGE")
	private String image;

	@Column(name = "NAME_ENGLISH")
	private String nameEnglish;
	
	@Column(name = "NAME_THAI")
	private String nameThai;
	
	@Column(name = "isLike")
	private String isLike;
	
	public Playlist(String name, String image, String nameEnglish, String nameThai) {
		super();
		this.name = name;
		this.image = image;
		this.nameEnglish = nameEnglish;
		this.nameThai = nameThai;
	}
	
	public Playlist() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNameEnglish() {
		return nameEnglish;
	}

	public void setNameEnglish(String nameEnglish) {
		this.nameEnglish = nameEnglish;
	}

	public String getNameThai() {
		return nameThai;
	}

	public void setNameThai(String nameThai) {
		this.nameThai = nameThai;
	}

	public String getIsLike() {
		return isLike;
	}

	public void setIsLike(String isLike) {
		this.isLike = isLike;
	}
	
}
