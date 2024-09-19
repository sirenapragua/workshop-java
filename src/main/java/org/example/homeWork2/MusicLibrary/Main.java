package org.example.homeWork2.MusicLibrary;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MusicTrack track1 = new MusicTrack("Du Hast", "Rammstein", "Industrial Metal");
        MusicTrack track2 = new MusicTrack("The Metal", "Sabaton", "Power Metal");
        MusicTrack track3 = new MusicTrack("Ich Will", "Rammstein", "Industrial Metal");
        MusicTrack track4 = new MusicTrack("Future World", "Helloween", "Power Metal");

        MusicLibrary library = new MusicLibrary();
        library.addTrack(track1);
        library.addTrack(track2);
        library.addTrack(track3);
        library.addTrack(track4);

        System.out.println("Библиотека после добавления треков:");
        library.printLibrary();

        library.removeTrack(track2);
        System.out.println("\nБиблиотека после удаления трека 'The Metal':");
        library.printLibrary();

        System.out.println("\nТреки жанра Industrial Metal:");
        Set<MusicTrack> industrialMetalTracks = library.getTracksByGenre("Industrial Metal");
        for (MusicTrack track : industrialMetalTracks) {
            System.out.println(track);
        }
    }
}