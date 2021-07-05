package generics;

import generics.dto.JsonRpcErrorDTO;
import generics.dto.JsonRpcRequestDTO;
import generics.dto.JsonRpcResponseDTO;


public class Example1 {
    public static void main(String[] args) {
        JsonRpcRequestDTO<Person> request = new JsonRpcRequestDTO<>();
        Person person = new Person();
        person.setBirthday("01/08/1985");
        person.setFirstName("Ivan");
        person.setLastName("Ivanov");
        request.setParams(person);
        request.setId(1);
        request.setJsonRpc("2.0");
        request.setMethod("Qwerty");
        System.out.println(request);

        JsonRpcResponseDTO<Person, ErrorData> response = new JsonRpcResponseDTO<>();
        response.setId(request.getId());
        response.setResult(person);
        response.setJsonRpc(request.getJsonRpc());
        System.out.println(response);

        JsonRpcResponseDTO<Person, ErrorData> errorResponse = new JsonRpcResponseDTO<>();
        errorResponse.setId(request.getId());
        JsonRpcErrorDTO<ErrorData> error = new JsonRpcErrorDTO<>();
        error.setCode(-32601);
        error.setMessage("Method not found");
        ErrorData errorData = new ErrorData();
        errorData.setComment("Все плохо, ничего не работает!");
        error.setData(errorData);
        errorResponse.setError(error);
        errorResponse.setJsonRpc(request.getJsonRpc());
        System.out.println(errorResponse);
    }
}
