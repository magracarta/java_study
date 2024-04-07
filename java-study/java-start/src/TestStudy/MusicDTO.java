package TestStudy;

public class MusicDTO {

    private static int nextId = 1;
    private int id;
    private String title;
    private String artist;

    public MusicDTO(int id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }

    public MusicDTO(String title, String artist) {
        this.id = nextId++;
        this.title = title;
        this.artist = artist;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MusicDTO.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "MusicDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
