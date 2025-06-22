package com.example.baitap2.service;

import com.example.baitap2.model.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongService implements ISongService {
    private final List<Song> songs = new ArrayList<Song>();

    @Override
    public List<Song> findAll() {
        return songs;
    }

    @Override
    public void save(Song song) {
        songs.add(song);
    }
}
