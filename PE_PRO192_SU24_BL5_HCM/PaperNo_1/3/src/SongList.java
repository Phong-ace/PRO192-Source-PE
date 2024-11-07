
import java.util.TreeSet;

public class SongList extends TreeSet<Song> {

    public void addsong(Song song) {
        this.add(song);
    }

    public Song getSongMaxDuration() {
        Song maxDuration = null;
        for (Song song : this) {
            if (maxDuration == null || song.getDuration() > maxDuration.getDuration()) {
                maxDuration = song;
            }
        }
        return maxDuration;
    }
    
    public void printSongList() {
        for (Song s : this) {
            System.out.println(s.toString());
        }
    }
}
