package musicbox.test1;

import java.util.Comparator;

public class AscTitle implements Comparator<MusicDto> {
    @Override
    public int compare(MusicDto o1, MusicDto o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
