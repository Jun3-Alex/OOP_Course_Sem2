package OOP_Course.Lesson2.Seminar.OOPSeminar2.src.main.java.ru.gb.oseminar;

public class Cashier extends Personal implements Personal.PersonalBehavior {
    public Cashier(String name, String role) {
        super(name, role);
    }

    @Override
    public String getRole() {
        return super.getRole();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void cameToJob(Personal cashier) {

    }

    @Override
    public void leftJob(Personal cashier){

    }

    @Override
    public void working(Personal cashier) {

    }
}
