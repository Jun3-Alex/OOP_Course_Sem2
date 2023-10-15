package OOP_Course.Lesson2.Seminar.OOPSeminar2.src.main.java.ru.gb.oseminar;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Personal cashier = new Cashier("Ivan", "Cashier");
        Personal cashier2 = new Cashier("Vladimir", "Cashier");
        market.cameToJob(cashier);
        market.cameToJob(cashier2);
        market.openMarket();
        market.working(cashier);
        market.working(cashier2);
        Human human1 = new Human("Anton");
        Human human2 = new Human("Kirill");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
        market.leftJob(cashier);
        market.leftJob(cashier2);
        market.closeMarket();
    }
}
