package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return this.artist;
	}
	public String getName() {
		return this.name;
	}
	public int getDuration() {
		return this.duration;
	}
	
	public String getDurationString() {
		int min = this.duration/60;
		int sec = this.duration - (min)*60;
		if (sec < 10) {
			return Integer.toString(min) + ":0" + Integer.toString(sec);
		}
		return Integer.toString(min) + ":" + Integer.toString(sec);
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}

}
