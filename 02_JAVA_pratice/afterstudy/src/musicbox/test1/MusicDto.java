package musicbox.test1;


public class MusicDto {
    private static int nextid =1;
    private int id;
    private String artist;
    private String title;

    public MusicDto(String artist, String title) {
        this.id = MusicDto.nextid++;
        this.artist = artist;
        this.title = title;
    }

    public MusicDto(int id, String artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
    }

    public static int getNextid() {
        return nextid;
    }

    public static void setNextid(int nextid) {
        MusicDto.nextid = nextid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MusicDto{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }


}
