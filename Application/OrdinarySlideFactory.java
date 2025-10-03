package Application;

import Domain.OrdinarySlide;
import Domain.Slide;

public class OrdinarySlideFactory implements SlideFactory {

    public static SlideFactory getSlideFactory() {
        return new OrdinarySlideFactory();
    }

    @Override
    public Slide createSlide() {
        return new OrdinarySlide();
    }
}
