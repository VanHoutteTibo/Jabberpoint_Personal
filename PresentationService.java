public class PresentationService {

    public static void addEmptySlide(Presentation presentation)
    {
        Slide slide = new Slide();
        presentation.append(slide);
    }
}
