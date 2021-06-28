package sx.example.swagger;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * Created by masc on 28.06.2021.
 */
public interface JavaApi {
    @ApiResponses(value = {@ApiResponse()})
    void test();
}
