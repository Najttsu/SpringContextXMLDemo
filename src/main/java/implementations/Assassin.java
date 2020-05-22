package implementations;

import interfaces.IPerson;
import org.springframework.beans.factory.InitializingBean;

public class Assassin implements IPerson, InitializingBean {

    public void goTo(int x, int y) {

        System.out.printf("Moves stealthily %d; %d\n", x, y);

    }

    public void afterPropertiesSet() throws Exception {

    }
}
