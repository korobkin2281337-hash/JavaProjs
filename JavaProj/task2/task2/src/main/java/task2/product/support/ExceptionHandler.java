package task2.product.support;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import task2.product.support.exception.ProductNotFound;
import task2.shared.api.response.ErrorMessageResponse;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ProductNotFound.class)
    public ResponseEntity<ErrorMessageResponse> handle(ProductNotFound ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ErrorMessageResponse(ex.getMessage()));
    }
}
