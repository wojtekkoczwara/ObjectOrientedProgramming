package DataBase.musicDatabase;

import DataBase.musicDatabase.model.Artist;
import DataBase.musicDatabase.model.DataSource;
import DataBase.musicDatabase.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class MusicDataBase {


    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        if(!dataSource.open()){
            System.out.println("Can't open data source");
            return;
        }

//        List<Artist> artists = dataSource.queryArtists();
        List<Artist> artists = dataSource.queryArtistsAndOrder(DataSource.ORDER_BY_DESC);
        if (artists == null){
            System.out.println("no artists");
            return;
        }
//        artists.stream().forEach(artist -> System.out.println(artist.getId() + " " +  artist.getName()));

//        List<String> albumsForArtist = dataSource.queryAlbumsForArtist("Iron Maiden", DataSource.ORDER_BY_DESC);
//        albumsForArtist.stream().forEach(System.out::println);

        List<SongArtist> songArtists = dataSource.queryArtistsForSOng("She's On Fire", DataSource.ORDER_BY_DESC);
        if(songArtists == null){
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (SongArtist artist: songArtists
             ) {
            System.out.println("Artist name = " + artist.getArtistName() + " Album name = " + artist.getAlbumName() + " Track = " +artist.getTrack());
        }

        dataSource.querySourceMetadata();

        int count = dataSource.getCountAndMin(DataSource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);
        dataSource.createViewForSongArtists();


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entered a song title: ");
//        String title = scanner.nextLine();
//
//        songArtists = dataSource.querySongInfoViewRefactoredForSafetyAndPerformance(title);
//        if(songArtists.isEmpty()){
//            System.out.println("Couldn't find the artist for the song");
//            return;
//        }
//
//        for (SongArtist songArtist: songArtists
//             ) {
//            System.out.println("FROM VIEW - Artist name = " + songArtist.getArtistName() + " Album name = " + songArtist.getAlbumName() + " Track number = " + songArtist.getTrack());
//        }

        dataSource.insertSong("Bird Dog", "Everly Brothers", "All Time Greatest Hits", 7);
        dataSource.close();

    }

    //SELECT name, album, track FROM artist_list WHERE title = "title"

}
