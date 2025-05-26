package com.bacsystem.lib.exceptions.handlers;

import com.bacsystem.lib.base.response.ApplicationHandlerResponse;
import com.bacsystem.lib.base.response.ResponseBase;
import com.bacsystem.lib.exceptions.ApplicationException;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

/**
 * <b>ApplicationGlobalHandler</b>
 * <p>
 * This class specifies the requirements for the {@link ApplicationGlobal} component,
 * developed in accordance with the development standards established by bxcode.
 * Collaboration is encouraged for the enhancement and expansion of the api-bs-landing-components-microservice.
 * </p>
 * <p>
 * <b>Description:</b>
 * </p>Here!</p>
 *
 * @author bxcode
 * @author dbacilio88@outllok.es
 * @since 4/18/2025
 */

@Log4j2
@RestControllerAdvice
@AllArgsConstructor
public class ApplicationGlobal {
    private final ApplicationHandlerResponse applicationHandlerResponse;

    @ExceptionHandler(ApplicationException.class)
    public Mono<ResponseEntity<Object>> handlerException(ApplicationException exception) {
        return applicationHandlerResponse.failure(
                ResponseBase.builder()
                        .code(exception.getResponseCode().getCode())
                        .message(exception.getMessage())
                        .details(exception.getDetails())
                        .build(), exception.getResponseCode().getCode()
        );
    }
}
