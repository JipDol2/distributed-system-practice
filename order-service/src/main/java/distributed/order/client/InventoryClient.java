package distributed.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inventory-service", url = "http://localhost:8082/inventory")
public interface InventoryClient {

    @GetMapping("/health")
    String health();
}
