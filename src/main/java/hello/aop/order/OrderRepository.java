package hello.aop.order;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public String save(String itemId) {
        if(itemId.equals("ex")){
            throw new IllegalStateException("μμΈλ°μ!");
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
