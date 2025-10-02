package Application;

import Domain.Slide;
import Domain.TitleSlide;

public class TitleSlideFactory implements SlideFactory {
    @Override
    public Slide createSlide() {
        return new TitleSlide();
    }
}
