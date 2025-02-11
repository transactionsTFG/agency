package ucm.tfg.agency.common.dto.patternresult;

import lombok.Getter;

@Getter
public class Result<T> {
    private static final String GENERIC_SUCCESS = "Correcto";
    private final boolean success;
	private final T data;
    private final String message;
    
    private Result(boolean success, T data, String msg) {
        this.success = success;
        this.data = data;
        this.message = msg;
    }
    
    public static <T> Result<T> success(T data) {
        return new Result<>(true, data, GENERIC_SUCCESS);
    }
    
    public static <T> Result<T> failure(String errorMessage) {
        return new Result<>(false, null, errorMessage);
    }
    
}

