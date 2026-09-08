package in.strikes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {

    public PaymentService() {
        System.out.println("Paymentservice created");
    }
    public void pay() {
        System.out.println("Payment done");
    }
}
