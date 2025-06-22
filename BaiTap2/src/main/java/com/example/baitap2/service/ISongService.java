package com.example.baitap2.service;

import com.example.baitap2.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void save(Song song);
}
