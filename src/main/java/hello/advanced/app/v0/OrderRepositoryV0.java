package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {
    public static final String EX = "ex";

    public void save(String itemId) {
        if(EX.equals(itemId)) {
            throw new IllegalArgumentException("예외 발생");
        }
        sleep(1000);
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
