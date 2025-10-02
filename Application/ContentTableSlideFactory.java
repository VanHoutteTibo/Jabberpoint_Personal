package Application;

import Domain.ContentTableSlide;
import Domain.Slide;

public class ContentTableSlideFactory implements SlideFactory{
    @Override
    public Slide createSlide() {
        return new ContentTableSlide();
    }
}
