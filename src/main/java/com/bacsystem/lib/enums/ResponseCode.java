package com.bacsystem.lib.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * <b>ResponseCode</b>
 * <p>
 * This class specifies the requirements for the {@link ResponseCode} component,
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
@Getter
@AllArgsConstructor
public enum ResponseCode {

    OK(HttpStatus.OK.value(), "", ""),
    CREATED(HttpStatus.CREATED.value(), "", ""),
    BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), "", ""),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED.value(), "", ""),
    FORBIDDEN(HttpStatus.FORBIDDEN.value(), "", ""),
    NOT_FOUND(HttpStatus.NOT_FOUND.value(), "", ""),
    PRECONDITION_FAILED(HttpStatus.PRECONDITION_FAILED.value(), "", ""),
    UNSUPPORTED_MEDIA_TYPE(HttpStatus.UNSUPPORTED_MEDIA_TYPE.value(), "", ""),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), "", ""),
    NOT_IMPLEMENTED(HttpStatus.NOT_IMPLEMENTED.value(), "", ""),
    UNPROCESSABLE_ENTITY(HttpStatus.UNPROCESSABLE_ENTITY.value(), "", ""),
    SERVICE_UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE.value(), "", ""),
    GATEWAY_TIMEOUT(HttpStatus.GATEWAY_TIMEOUT.value(), "", ""),
    NO_CONTENT(HttpStatus.NO_CONTENT.value(), "", ""),
    ;

    private final int code;
    private final String error;
    private final String message;

}
