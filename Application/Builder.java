package Application;

import Domain.Slide;

public interface Builder {

    void addSlide(Slide slide);

    void setTitle(String title);
}
