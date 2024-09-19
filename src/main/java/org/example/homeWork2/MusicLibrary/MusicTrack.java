package org.example.homeWork2.MusicLibrary;

public class MusicTrack {
    private String title;
    private String artist;
    private String genre;

    public MusicTrack(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return "MusicTrack{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}