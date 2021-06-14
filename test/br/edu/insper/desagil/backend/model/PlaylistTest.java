package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist p;

	@BeforeEach
	void setUp() {
		p = new Playlist(123);
	}

	@Test
	void testRoundDownToZero() {
		p.putRating("kingkong", 1);
		p.putRating("godzilla", 2);
		p.putRating("titioavo", 3);
		p.putRating("munhanho", 3);
		assertEquals(2.0, p.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		p.putRating("george", 1);
		p.putRating("clifford", 2);
		p.putRating("caillou", 1);
		assertEquals(1.5, p.averageRatings(), DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		p.putRating("finn", 1);
		p.putRating("jake", 2);
		p.putRating("bubblegum", 2);
		assertEquals(1.5, p.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToOne() {
		p.putRating("michaelscarn", 1);
		p.putRating("prisonmike", 1);
		p.putRating("georgeforemangrill", 2);
		p.putRating("goldenface", 3);
		assertEquals(2.0, p.averageRatings(), DELTA);
	}
}
