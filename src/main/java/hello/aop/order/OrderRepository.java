package hello.aop.order;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public String save(String itemId) {
        if(itemId.equals("ex")){
            throw new IllegalStateException("예외발생!");
        }
        sleep(1000);
        return "ok";
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
