package com.example.StreamSong.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StreamSong.model.Playlist;
import com.example.StreamSong.model.Song;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
	
}
