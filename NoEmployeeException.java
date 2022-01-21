package pro.sky.javacourse2.hw24;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoEmployeeException extends RuntimeException {
}
