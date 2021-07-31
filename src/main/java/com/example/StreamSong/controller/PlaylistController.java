package com.example.StreamSong.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.StreamSong.model.Song;
import com.example.StreamSong.repository.PlaylistRepository;
import com.example.StreamSong.repository.SongRepository;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/app")
public class PlaylistController {
		
	  @Autowired
	  PlaylistRepository playlistRepository;
	  @Autowired
	  SongRepository songRepository;
	
	 
//	  @GetMapping("/menu1")
//	  public ResponseEntity<List<Song>> getAllSongList(@RequestParam(required = false) String title) {
//	    try {
//	    	System.out.println("1");
//	      List<Song> songList = new ArrayList<Song>();
//
//	      if (title == null)
//	    	  songRepository.findAll().forEach(songList::add);
//	      else
//	    	  songRepository.findByTitleContaining(title).forEach(songList::add);
//
//	      if (songList.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//
//	      return new ResponseEntity<>(songList, HttpStatus.OK);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
//	  @PostConstruct
//	  public void init() {
//		  JSONParser parser = new JSONParser();
//		    try {
//		        Object obj = parser.parse(new FileReader("/Users/thummanoon/Downloads/StreamSong/src/main/java/JsonFile/catagory.json"));
//		        JSONObject jsonObj = new JSONObject((Map) (parser.parse(new FileReader("/Users/thummanoon/Downloads/StreamSong/src/main/java/JsonFile/catagory.json"))));
//		        JSONObject jsonObj2 = (JSONObject) jsonObj.get("tracks");
//		        List<JSONObject> list = (List) jsonObj2.get("items");
//		        System.out.println("3:"+list.size());
//		        for (int i = 0; i < list.size(); i++) {
//		        	JSONObject sub = (JSONObject) list.get(i);
//		        	System.out.println(sub.get("track"));
//		        	JSONObject a = (JSONObject) sub.get("track");
//		        	System.out.println("5:"+sub.get("track"));
//		        	JSONObject b = (JSONObject) a.get("album");
//		        	System.out.println("6:"+a.get("album"));
//		        	List<JSONObject> list2 =  (List<JSONObject>) b.get("images");
//		        	Song catagory = new Song();
//		        	System.out.println("4:"+list2.size());
//		        	JSONObject sub3 =  list2.get(1);
//		        	catagory.setCover(sub3.get("url").toString());
//		        	catagory.setTitle(a.get("name").toString());
//		        	if(a.get("preview_url") != null) {
//		        		catagory.setPreview(a.get("preview_url").toString());
//		        	}
//		        	Optional<Playlist> dbCustomer = playlistRepository.findById((long) 84);
//		        	dbCustomer.ifPresent(existingCustomer -> {
//		        		catagory.setPlaylist(existingCustomer);
//		        	});
//
//		        	Song _catagory = songRepository.save(catagory);
//				}
//		       
//		    } catch (FileNotFoundException e) {
//		        e.printStackTrace();
//		    } catch (IOException e) {
//		        e.printStackTrace();
//		    } catch (ParseException e) {
//		        e.printStackTrace();
//		    }
//	       
////	     Song _song = songRepository.save(song);
//	  }
	  
}
