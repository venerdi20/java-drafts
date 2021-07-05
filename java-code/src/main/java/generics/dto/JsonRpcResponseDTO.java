package generics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonRpcResponseDTO<T> {
    private String jsonRpc;
    private T result;
    private JsonRpcErrorDTO error;
    private Integer id;
}
