package generics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonRpcRequestDTO<T> {
    private String jsonRpc;
    private String method;
    private T params;
    private Integer id;
}
