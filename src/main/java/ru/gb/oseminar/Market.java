package OOP_Course.Lesson2.Seminar.OOPSeminar2.src.main.java.ru.gb.oseminar;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour, Personal.PersonalBehavior {
    private final List<Actor> queue;
    private final List<Personal> personal;
    public Market(){
        this.queue = new ArrayList<>();
        this.personal = new ArrayList<>();
    }


    public boolean isMarketOpen(){
        return queue.isEmpty() && !personal.isEmpty();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        if (!isMarketOpen()) {
            System.out.println(actor.getName() + " пришел в магазин");
            takeInQueue(actor);
        }else {
            System.out.println("Магазин закрыт");
        }
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for(Actor actor: queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor: queue){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди и готов уходить");
            }
        }
        releaseFromMarket(releasedActors);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors){
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void openMarket() {
        System.out.println("Магазин открыт");
    }

    @Override
    public void closeMarket() {
        if(queue.isEmpty())
            System.out.println("Магазин закрыт");
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void cameToJob(Personal personal) {
        System.out.println(personal.getRole() + " " + personal.getName() + " пришел на работу");
    }

    @Override
    public void leftJob(Personal personal) {
        System.out.println(personal.getRole() + " " + personal.getName() + " ушел с работы");
    }

    @Override
    public void working(Personal personal) {
        System.out.println(personal.getRole() + " " + personal.getName() + " работает");
    }

    public List<Personal> getPersonal() {
        return personal;
    }
}
