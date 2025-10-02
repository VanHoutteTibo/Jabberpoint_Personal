package Application;

import Domain.Presentation;
import Domain.Slide;

import java.util.ArrayList;

public class PresentationFactory {

    public static Presentation createPresentation(ArrayList<Slide> slides, String title)
    {
        PresentationBuilder builder = new PresentationBuilder();
        for (Slide slide : slides) {
            builder.addSlide(slide);
        }
        builder.setTitle(title);
         return builder.createInstance();
    }

    public static Presentation createEmptyPresentation()
    {
        PresentationBuilder builder = new PresentationBuilder();

        return builder.createInstance();
    }
}
