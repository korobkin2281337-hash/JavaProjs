package task2.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateProductRequest {
    private final String name;

    @JsonCreator
    public UpdateProductRequest(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}
