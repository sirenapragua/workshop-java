package org.example.homeWork2.MusicLibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MusicLibrary {
    private Map<String, Set<MusicTrack>> library;

    public MusicLibrary() {
        this.library = new HashMap<>();
    }

    public void addTrack(MusicTrack track) {
        library.computeIfAbsent(track.getGenre(), k -> new HashSet<>()).add(track);
    }

    public void removeTrack(MusicTrack track) {
        Set<MusicTrack> tracks = library.get(track.getGenre());
        if (tracks != null) {
            tracks.remove(track);
            if (tracks.isEmpty()) {
                library.remove(track.getGenre());
            }
        }
    }

    public Set<MusicTrack> getTracksByGenre(String genre) {
        return library.getOrDefault(genre, new HashSet<>());
    }

    public void printLibrary() {
        for (Map.Entry<String, Set<MusicTrack>> entry : library.entrySet()) {
            System.out.println("Жанр: " + entry.getKey());
            for (MusicTrack track : entry.getValue()) {
                System.out.println("  " + track);
            }
        }
    }

    @Override
    public String toString() {
        return "MusicLibrary{" + "library=" + library + '}';
    }
}
