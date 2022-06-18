package pl.pjatk.jazs22020nbp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class JazS22020NbpAdvice {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleBadRequestException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request. Exception message " + ex.getLocalizedMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleServerError502(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("NBP server error. Exception message " + ex.getLocalizedMessage());
    }

}
