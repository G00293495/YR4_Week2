package ie.atu.week2.week2_refresher;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "inventory-service", url = "https://localhost:8081")
public interface ProductClient {

}
