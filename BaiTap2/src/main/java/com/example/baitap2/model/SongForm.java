package com.example.baitap2.model;

import org.springframework.web.multipart.MultipartFile;

public class SongForm {
    private String name;
    private String artist;
    private String genre;
    private MultipartFile file;

    public SongForm() {
    }

    public SongForm(String name, String artist, String genre, MultipartFile file) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
