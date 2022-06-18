package pl.pjatk.jazs22020nbp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class JazS22020NbpAdvice {
    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<String> handleBadRequestException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request. Exception message " + ex.getLocalizedMessage());
    }

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<String> handleNotFoundException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Page not found. Exception message " + ex.getLocalizedMessage());
    }

}
