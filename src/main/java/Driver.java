import java.lang.reflect.Method;
import java.sql.ResultSet;

public class Driver {
    public static void main(String[] args) {

        Class cls = ResultSet.class;
        Method[] methods = cls.getMethods();

        System.out.println(cls.getName() + " is accessible here and has following methods.");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
