//Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.
import java.util.Random;

class Song {
    private String title;
    private String artist;

    // Constructor
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

class MusicLibrary {
    private Song[] songs;
    private int numSongs;

    // Constructor
    public MusicLibrary(int maxSongs) {
        songs = new Song[maxSongs];
        numSongs = 0;
    }

    // Method to add a song to the library
    public void addSong(Song song) {
        if (numSongs < songs.length) {
            songs[numSongs] = song;
            numSongs++;
            System.out.println("Song added to the library: " + song.getTitle() + " by " + song.getArtist());
        } else {
            System.out.println("Cannot add more songs. Library is full.");
        }
    }

    // Method to remove a song from the library
    public void removeSong(String songTitle) {
        boolean found = false;
        for (int i = 0; i < numSongs; i++) {
            if (songs[i].getTitle().equalsIgnoreCase(songTitle)) {
                found = true;
                System.out.println("Song removed from the library: " + songs[i].getTitle() + " by " + songs[i].getArtist());
                for (int j = i; j < numSongs - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songs[numSongs - 1] = null;
                numSongs--;
                break;
            }
        }
        if (!found) {
            System.out.println("Song not found in the library: " + songTitle);
        }
    }

    // Method to play a random song
    public void playRandomSong() {
        if (numSongs == 0) {
            System.out.println("No songs in the library to play.");
            return;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(numSongs);
        Song randomSong = songs[randomIndex];
        System.out.println("Playing a random song: " + randomSong.getTitle() + " by " + randomSong.getArtist());
    }
}

 class pro15 {
    public static void main(String[] args) {
        // Creating a MusicLibrary instance
        MusicLibrary musicLibrary = new MusicLibrary(10); // Assuming maximum 10 songs in the library

        // Adding songs to the library
        Song song1 = new Song("Song A", "Artist X");
        Song song2 = new Song("Song B", "Artist Y");
        Song song3 = new Song("Song C", "Artist Z");

        musicLibrary.addSong(song1);
        musicLibrary.addSong(song2);
        musicLibrary.addSong(song3);

        // Removing a song from the library
        musicLibrary.removeSong("Song B");

        // Playing a random song
        musicLibrary.playRandomSong();
    }
}
