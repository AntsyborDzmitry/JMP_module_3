import beans.Person;
import factories.AbstractManagerFactory;
import factories.PersonManagerFromDBFactory;
import factories.PersonManagerFromFileFactory;
import managers.PersonManager;

public class Main {
    public static void main(String[] args) {
        AbstractManagerFactory dbManager = new PersonManagerFromDBFactory();
        PersonManager pm =dbManager.createPersonManager();
        Person p = pm.readPerson();
        System.out.println("read last ->    "+p.getName()+" , " + p.getAge());
        p = pm.readPerson("Vitalya");
        System.out.println("read by name ->   "+p.getName()+" , " + p.getAge());
        Person p1 = new Person("123",12);
        pm.writePerson(new Person("Dima",34));
        p = pm.readPerson("Dima");
        System.out.println("set and read by name ->   "+p.getName()+" , " + p.getAge());
        /*************************************************************************************/

        AbstractManagerFactory FileManager = new PersonManagerFromFileFactory();
        PersonManager pmF =dbManager.createPersonManager();
        pmF.writePerson(p1);
    }
}
