
public class Song implements Comparable<Song>{
    private String name;
    private int duration;

    public Song() {
    }

    public Song(String name, int duration) {
        this.name = name.toUpperCase();
        if (duration < 1) {
            this.duration = 1;
        }
        else
            this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return getName() + "," + getDuration();
    }

    @Override
    public int compareTo(Song o) {
        return this.name.compareTo(o.name);
    }
}
