package com.example.StreamSong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "song")
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "cover")
	private String cover;

	@Column(name = "preview")
	private String preview;
	
	@Column(name = "isLike")
	private Boolean isLike;
	
	@ManyToOne
    @JoinColumn(name="playlist_id")
    private Playlist playlist;
	
	public Song() {
		
	}
	public Song(Song song) {
		super();
	}

	public Song( String title, String cover, String preview) {
		super();
		this.title = title;
		this.cover = cover;
		this.preview = preview;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}
	
	public Playlist getPlaylist() {
		return playlist;
	}
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	public Boolean getIsLike() {
		return isLike;
	}
	public void setIsLike(Boolean isLike) {
		this.isLike = isLike;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + cover + ", published=" + preview + "]";
	}
	
	

}
