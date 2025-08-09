import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 21), new User("João", 32),
                new User("Eduardo", 40), new User("Ana", 19));
        var comsumer = new Consumer<User>() {
            @Override
            public void accept(final User user) {
                System.out.println(user);

            }

        };
        users.forEach(comsumer);
    }
}
