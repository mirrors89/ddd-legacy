package kitchenpos.application.fake;

import kitchenpos.domain.RidersClient;

import java.math.BigDecimal;
import java.util.UUID;

public class FakeRidersClient implements RidersClient {
    @Override
    public void requestDelivery(UUID orderId, BigDecimal amount, String deliveryAddress) {

    }
}
