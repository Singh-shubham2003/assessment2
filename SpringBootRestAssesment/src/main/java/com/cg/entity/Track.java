package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "abes_track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id")
    private Long id;

    @Column(name = "track_title")
    private String title;

    @Column(name = "album_name")
    private String albumName;

    @Column(name = "release_dt")
    private LocalDate releaseDate;

    // Constructors
    public Track() {}

    public Track(String title, String albumName, LocalDate releaseDate) {
        this.title = title;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

	@Override
	public String toString() {
		return "Track [id=" + id + ", title=" + title + ", albumName=" + albumName + ", releaseDate=" + releaseDate
				+ "]";
	}
    
}