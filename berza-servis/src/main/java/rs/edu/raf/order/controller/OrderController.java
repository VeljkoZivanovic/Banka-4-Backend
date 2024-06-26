package rs.edu.raf.order.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.edu.raf.order.dto.OrderDto;
import rs.edu.raf.order.dto.OrderRequest;
import rs.edu.raf.order.service.OrderService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/orders")
@Tag(name = "Orders", description = "Operations related to orders.")
@AllArgsConstructor
@SecurityRequirement(name = "jwt")
@CrossOrigin(origins = "*")
public class OrderController {

    private final OrderService orderService;

    @ApiOperation(value = "Returns all orders.")
    @GetMapping("/all")
    public ResponseEntity<List<OrderDto>> getAllOrders() {
        return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
    }

    @ApiOperation(value = "Returns orders for user.")
    @GetMapping("/{userId}")
    public ResponseEntity<List<OrderDto>> GetOrdersForUser(@PathVariable Long userId) {
        return new ResponseEntity<>(orderService.getOrdersForUser(userId), HttpStatus.OK);
    }

    @ApiOperation(value = "Places order.")
    @PostMapping("/place-order")
    public ResponseEntity<OrderDto> placeOrder(@RequestBody @Validated OrderRequest order) {
        return new ResponseEntity<>(orderService.placeOrder(order), HttpStatus.OK);
    }

    @ApiOperation(value = "Approximates order value.")
    @PostMapping("/approximate-order-value")
    public ResponseEntity<BigDecimal> approximateOrderValue(@RequestBody @Validated OrderRequest order) {
        return new ResponseEntity<>(orderService.approximateOrderValue(order), HttpStatus.OK);
    }

}
