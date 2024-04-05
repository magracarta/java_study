package musicbox.test1;

import java.util.Comparator;

public class DscArtist implements Comparator<MusicDto> {
    @Override
    public int compare(MusicDto o1, MusicDto o2) {
        return o2.getArtist().compareTo(o1.getArtist());
    }
}
