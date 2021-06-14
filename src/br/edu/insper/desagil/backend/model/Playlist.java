package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}
	
	public int getId() {
		return id;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public Map<String, Integer> getRatings() {
		return ratings;
	}

	public void addTrack(Track track) {
		tracks.add(track);
	}
	
	public void putRating(String user, int rating) {
		ratings.put(user, rating);
	}
	
	public double averageRatings() {
		int sum = 0;
		for (int rating : ratings.values()) {
			sum += rating;
		}
		double average = (double) sum/ratings.size();
		int i = (int) average;
		double d = average - i;
		if (d < 0.26) {
			d = 0.0;
		} else if (d < 0.74) {
			d = 0.5;
		} else {
			d = 1.0;
		}
		return i + d;
	}
	
}
