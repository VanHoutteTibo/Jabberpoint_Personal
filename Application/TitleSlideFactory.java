package Application;

import Domain.Slide;
import Domain.TitleSlide;

public class TitleSlideFactory implements SlideFactory {

    public static SlideFactory getSlideFactory() {
        return new TitleSlideFactory();
    }

    @Override
    public Slide createSlide() {
        return new TitleSlide();
    }
}
