package com.bacsystem.lib.exceptions;

import com.bacsystem.lib.enums.ResponseCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * <b>ApplicationException</b>
 * <p>
 * This class specifies the requirements for the {@link ApplicationException} component,
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

@EqualsAndHashCode(callSuper = true)
@Data
public class ApplicationException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -846315222579408700L;

    private final ResponseCode responseCode;
    private final String error;
    private final String message;
    private final String details;


    public ApplicationException(String details, ResponseCode responseCode) {
        super(responseCode.getMessage());
        this.responseCode = responseCode;
        this.error = responseCode.getError();
        this.message = responseCode.getMessage();
        this.details = details;
    }
}
