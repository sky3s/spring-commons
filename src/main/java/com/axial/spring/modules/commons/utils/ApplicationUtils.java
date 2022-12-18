package com.axial.spring.modules.commons.utils;

import com.axial.spring.modules.commons.enums.AppEnvironment;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

/**
 * Created on December 2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApplicationUtils {

    private static boolean isSpecificEnvironment(Environment environment, AppEnvironment env) {

        for (String activeProfile : environment.getActiveProfiles()) {
            if (StringUtils.startsWithIgnoreCase(activeProfile, env.getCode())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSpecificEnvironment(Environment environment, String key) {

        for (String activeProfile : environment.getActiveProfiles()) {
            if (StringUtils.startsWithIgnoreCase(activeProfile, key)) {
                return true;
            }
        }
        return false;
    }

}
