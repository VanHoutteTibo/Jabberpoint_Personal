import java.util.ArrayList;

public class PresentationBuilder implements Builder {

    private final ArrayList<Slide> slides;
    private String title;

    public PresentationBuilder() {
        slides = new ArrayList<>();
    }

    @Override
    public void addSlide(Slide slide)
    {
        slides.add(slide);
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public Presentation createInstance()
    {
        var presentation = new Presentation();
        for(var slide : slides)
        {
            presentation.append(slide);
        }
        presentation.setTitle(title);
        return presentation;
    }
}
