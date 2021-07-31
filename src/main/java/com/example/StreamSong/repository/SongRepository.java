package com.example.StreamSong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.StreamSong.model.Song;

public interface SongRepository extends JpaRepository<Song, Long> {
	
	List<Song> findByTitleContaining(String title);
	
	@Query("SELECT t FROM Song t WHERE t.playlist.id = ?1")
	List<Song> findByPlaylistId(Long playlistId);
	
	@Query("SELECT t FROM Song t WHERE t.isLike = true")
	List<Song> findLikeSongs();

	@Query("SELECT t FROM Song t WHERE t.id in (SELECT max(a.id) FROM Song a GROUP BY a.title) ")
	List<Song> findNotDuplicateSongs();

}
