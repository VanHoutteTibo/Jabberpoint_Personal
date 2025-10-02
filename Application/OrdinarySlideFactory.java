package Application;

import Domain.OrdinarySlide;
import Domain.Slide;

public class OrdinarySlideFactory implements SlideFactory {

    @Override
    public Slide createSlide() {
        return new OrdinarySlide();
    }
}
