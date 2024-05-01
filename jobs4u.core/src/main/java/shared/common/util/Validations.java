/*
package shared.common.util;

import lombok.experimental.UtilityClass;
import sem4pi.shared.exception.ValidationException;

@UtilityClass
public class Validations {


    public static void notNull(Object... objs) throws ValidationException{
        for (Object obj : objs) {
            if (obj == null) {
                throw new ValidationException("Object is null");
            }
        }
    }

    public static void notBlank(String ... obj) throws ValidationException{
        notNull(obj);
        for(String str: obj){
            if(str.isBlank()){
                throw new ValidationException("String is blank");
            }
        }
    }

    public static void assertTrue(boolean condition) throws ValidationException{
        notNull(condition);
        if (!condition){
            throw new ValidationException("Condition is false, but should have been true");
        }
    }

    public static void assertFalse(boolean condition) throws ValidationException{
        notNull(condition);
        if(condition){
            throw new ValidationException("Condition is true, but should have been false");
        }
    }

    public static void matches(String str, String regex) throws ValidationException{
        notNull(str,regex);
        if(!str.matches(regex)){
            throw new ValidationException(String.format("String \"%s\" does not match regex \"%s\"", str,regex));
        }
    }



}


 */