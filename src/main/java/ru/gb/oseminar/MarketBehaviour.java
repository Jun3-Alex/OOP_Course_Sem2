package OOP_Course.Lesson2.Seminar.OOPSeminar2.src.main.java.ru.gb.oseminar;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void openMarket();
    void closeMarket();
    void update();
}
