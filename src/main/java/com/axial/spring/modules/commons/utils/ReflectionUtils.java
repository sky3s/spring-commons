package com.axial.spring.modules.commons.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

/**
 * Created on December 2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ReflectionUtils {

    /*
    public static Class<?> getFieldType(Class<?> mainClassType, String fieldName) {

        try {
            return mainClassType.getDeclaredField(fieldName).getType();
        } catch (NoSuchFieldException | SecurityException ex) {
            throw ExceptionHelper.newValidationException(CoreMessages.CLASS_FIELD_NOT_EXIST, fieldName);
        }
    }

    public static boolean checkForFieldString(Class<?> classType, String fieldName) {

        return checkForFieldType(classType, fieldName, String.class);
    }

    public static Object getEnumField(Class<?> classType, String fieldName, String fieldValue) {

        final Class<?> enumClass = getFieldType(classType, fieldName);
        final Object enumVal = ReflectionUtils.executeFindByCodeForEnum(enumClass, fieldValue);
        if (Objects.isNull(enumVal)) {
            throw ExceptionHelper.newValidationException(CoreMessages.ENUM_CODE_VALUE_INVALID, fieldValue, getEnumValues(enumClass));
        }
        return enumVal;
    }

    public static String getEnumValues(Class<?> enumClass) {

        return new StringBuilder().append("[").append(StringUtils.join(enumClass.getEnumConstants(), ", ")).append("]").toString();
    }

    public static boolean checkForFieldType(Class<?> classType, String fieldName, Class<?> queryType) {

        final Class<?> cls = getFieldType(classType, fieldName);
        return cls.isAssignableFrom(queryType);
    }

    public static boolean checkForFieldEnum(Class<?> classType, String fieldName) {

        final Class<?> cls = getFieldType(classType, fieldName);
        return cls.isEnum();
    }

    public static boolean checkForFieldTypesMatch(Class<?> classType, String fieldName, List<String> fieldValueList) {

        return fieldValueList.stream().map(fieldValue -> checkForFieldTypesMatch(classType, fieldName, fieldValue)).noneMatch(res -> !res);
    }

    public static boolean checkForFieldTypesMatch(Class<?> classType, String fieldName, String fieldValue) {

        final ObjectMapper objectMapper = new ObjectMapper();

        try {
            final Class<?> cls = getFieldType(classType, fieldName);
            objectMapper.readValue(fieldValue, cls);
            return true;
        } catch (JsonProcessingException ex) {
            // Field type mismatch
        }
        return false;
    }

    public static Object executeFindByCodeForEnum(Class<?> enumClass, String enumCode) {

        final String enumCodeName = "code";
        final String methodName = "findByCode";
        Class<?> codeClass = null;

        try {

            if (!enumClass.isEnum()) {
                throw ExceptionHelper.newValidationException(CoreMessages.ONLY_ENUM_CLASSES_ALLOWED);
            }

            codeClass = enumClass.getDeclaredField(enumCodeName).getType();
            if (Objects.isNull(codeClass)) {
                throw ExceptionHelper.newValidationException(CoreMessages.ENUM_CODE_TYPE_INCOMPATIBLE);
            }

            final Method mtd = enumClass.getDeclaredMethod(methodName, codeClass);
            return mtd.invoke(enumClass, enumCode);
        } catch (NoSuchMethodException | SecurityException ex) {
            throw ExceptionHelper.newValidationException(CoreMessages.CLASS_METHOD_NOT_EXIST, methodName);
        } catch (IllegalAccessException | InvocationTargetException ex) {
            throw ExceptionHelper.newValidationException(CoreMessages.METHOD_INVOCATION_FAILED, methodName, codeClass, enumCode);
        } catch (NoSuchFieldException e) {
            throw ExceptionHelper.newValidationException(CoreMessages.CLASS_FIELD_NOT_EXIST, enumCodeName);
        }

    }
     */

}
