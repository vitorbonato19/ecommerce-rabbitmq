package ms_orders.ms.orders.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public void testeApi() {
        Logger logger = Logger.getLogger("ms_orders.ms.orders.controller");
        logger.info("Request was a ok!");
    }
}
