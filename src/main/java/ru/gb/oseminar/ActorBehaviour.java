package OOP_Course.Lesson2.Seminar.OOPSeminar2.src.main.java.ru.gb.oseminar;

public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
