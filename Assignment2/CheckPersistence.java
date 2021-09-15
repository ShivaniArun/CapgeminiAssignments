package Assignment2;

public class CheckPersistence {
    public static void main(String[] args) {
        Persistence p1 = new DatabasePersistence();
        p1.persist();
        Persistence p2 = new FilePersistence();
        p2.persist();
    }
}
abstract class Persistence {
    abstract void persist();
}
class FilePersistence extends Persistence {
    @Override
    void persist() {
        System.out.println("Saved in File");
    }
}
class DatabasePersistence extends Persistence {
    @Override
    void persist() {
        System.out.println("Saved in Database");
    }
}