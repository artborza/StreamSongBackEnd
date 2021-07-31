package com.example.StreamSong.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.StreamSong.model.Song;
import com.example.StreamSong.repository.SongRepository;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/app")
public class SongController {
	
	  @Autowired
	  SongRepository songRepository;
	  
	  @PostConstruct
	  public void init() {
		 
	  }
	  
	  @GetMapping("/menu1")
	  public ResponseEntity<List<Song>> getAllSongList(@RequestParam(required = false) String title) {
	    try {
	      List<Song> songList = new ArrayList<Song>();
	      
	      if (title == null)
	    	  songRepository.findAll().forEach(songList::add);
	      else
	    	  songRepository.findByTitleContaining(title).forEach(songList::add);

	      if (songList.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      for (int i = 0; i < songList.size(); i++) {
	    	  
			
	      }
	      return new ResponseEntity<>(songList, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/menu2")
	  public ResponseEntity<List<Song>> getAllSongNotDuplicateList(@RequestParam(required = false) String title) {
	    try {
	      List<Song> songList = new ArrayList<Song>();
	      System.out.println(songList.size()+" 3/ๅ_/ๅ_");
	      if (title == null)
	    	  songRepository.findNotDuplicateSongs().forEach(songList::add);
	      else
	    	  songRepository.findNotDuplicateSongs().forEach(songList::add);

	      if (songList.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      for (int i = 0; i < songList.size(); i++) {
	    	  
			
	      }
	      return new ResponseEntity<>(songList, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/menu3")
	  public ResponseEntity<List<Song>> getLikeSoungs(@RequestParam(required = false) String title) {
	    List<Song> songList = songRepository.findLikeSongs();
	    if (songList!=null) {
	      return new ResponseEntity<>(songList, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  @GetMapping("/menu5")
	  public ResponseEntity<List<Song>> getLikeSoungs2(@RequestParam(required = false) String title) {
	    List<Song> songList = songRepository.findLikeSongs();
	    if (songList!=null) {
	      return new ResponseEntity<>(songList, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  
	  @GetMapping("/playlist2/{id}")
	  public ResponseEntity<List<Song>> getPlaylisyBySongId(@PathVariable("id") long id) {
	    Optional<Song> songData = songRepository.findById(id);
	    System.out.println(songData.get().getTitle());
	    List<Song> songList = songRepository.findByPlaylistId(songData.get().getPlaylist().getId());
	    if (songData.isPresent()) {
	      return new ResponseEntity<>(songList, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  
	  @GetMapping("/playlist/{id}")
	  public ResponseEntity<List<Song>> getPlaylisyByPlaylisyId(@PathVariable("id") long id) {
	    List<Song> songList = songRepository.findByPlaylistId(id);
	    if (songList!=null) {
	      return new ResponseEntity<>(songList, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

	 

	  @PutMapping("/songUpdate/{id}")
	  public ResponseEntity<Song> updateSong(@PathVariable("id") long id, @RequestBody Song song) {
	    Optional<Song> songData = songRepository.findById(id);
	    if (songData.isPresent()) {
	      Song _tutorial = songData.get();
	      _tutorial.setIsLike(song.getIsLike());
	      return new ResponseEntity<>(songRepository.save(_tutorial), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

	  @DeleteMapping("/tutorials/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
	    try {
	      songRepository.deleteById(id);
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  @DeleteMapping("/tutorials")
	  public ResponseEntity<HttpStatus> deleteAllTutorials() {
	    try {
	      songRepository.deleteAll();
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	  }

//	  @GetMapping("/tutorials/published")
//	  public ResponseEntity<List<Song>> findByPublished() {
//	    try {
//	      List<Song> song = songRepository.findByPublished(true);
//
//	      if (song.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//	      return new ResponseEntity<>(song, HttpStatus.OK);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }

}
