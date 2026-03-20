package com.cg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Track;

public interface TrackRepo extends JpaRepository<Track, Long> {
    List<Track> findByTitle(String title);
}
