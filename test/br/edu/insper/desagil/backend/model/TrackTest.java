package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Track t;
	private Artist a;
	
	@BeforeEach
	void setUp() {
		a = new Artist("Anitta");
	}

	@Test
	void testZeroSeconds() {
		t = new Track(a, "Atencion", 0);
		assertEquals("0:00", t.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		t = new Track(a, "Atencion", 5);
		assertEquals("0:05", t.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		t = new Track(a, "Atencion", 25);
		assertEquals("0:25", t.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		t = new Track(a, "Atencion", 60);
		assertEquals("1:00", t.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		t = new Track(a, "Atencion", 65);
		assertEquals("1:05", t.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		t = new Track(a, "Atencion", 85);
		assertEquals("1:25", t.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		t = new Track(a, "Atencion", 120);
		assertEquals("2:00", t.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		t = new Track(a, "Atencion", 125);
		assertEquals("2:05", t.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		t = new Track(a, "Atencion", 145);
		assertEquals("2:25", t.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		t = new CollaborationTrack(a, Arrays.asList(new Artist("Becky G")), "Banana", 195);
		assertEquals("Anitta (feat. Becky G)", t.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		t = new CollaborationTrack(a, Arrays.asList(new Artist("Ludmilla"), new Artist("Snoop Dog")), "Onda Diferente", 160);
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", t.getFullArtistName());
	}
}
