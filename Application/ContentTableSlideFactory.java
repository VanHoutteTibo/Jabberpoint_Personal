package Application;

import Domain.ContentTableSlide;
import Domain.Slide;

public class ContentTableSlideFactory implements SlideFactory{

    public static SlideFactory getSlideFactory() {
        return new ContentTableSlideFactory();
    }

    @Override
    public Slide createSlide() {
        return new ContentTableSlide();
    }
}
