package Arrays.Interfaces.Exercise46Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        Song song = new Song(title, duration);
        if(findSong(song.getTitle()) == null){
            this.songs.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist){
        if(trackNumber > this.songs.size() || trackNumber <= 0){
            return false;
        }
        String songTitle = songs.get(trackNumber -1).getTitle();
        Song song = findSong(songTitle);
        if(song != null){
            playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, List<Song> playlist){
        Song song = findSong(songTitle);
        if(song != null){
            playlist.add(song);
            return true;
        }
        else return false;
    }

    private Song findSong(String songTitle){
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if(song.getTitle().equals(songTitle)){
                return songs.get(i);
            }
        }
        return null;
    }
}
