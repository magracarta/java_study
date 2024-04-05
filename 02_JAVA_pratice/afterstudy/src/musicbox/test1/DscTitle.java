package musicbox.test1;

import java.util.Comparator;

public class DscTitle implements Comparator<MusicDto> {
    @Override
    public int compare(MusicDto o1, MusicDto o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
