package com.bacsystem.lib.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CommonUtilsTest {

    @Test
    void givenIsValidateId_whenId_thenReturnSuccess() {
        final Long id = 150L;
        final boolean result = CommonUtils.isValidateId(id);
        Assertions.assertTrue(result);
    }

    @Test
    void givenIsValidateId_whenId_thenReturnError() {
        final Long id = 0L;
        final boolean result = CommonUtils.isValidateId(id);
        Assertions.assertFalse(result);
    }
}

