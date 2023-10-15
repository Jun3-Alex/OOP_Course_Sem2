package OOP_Course.Lesson2.Seminar.OOPSeminar2.src.main.java.ru.gb.oseminar;

public abstract class Personal{
    protected String role;
    protected String name;
    public Personal(String name, String role) {
        this.name = name;
        this.role = role;
    };

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public interface PersonalBehavior { ;

        void cameToJob(Personal personal);

        void leftJob(Personal personal);

        void working(Personal personal);
    }
}
