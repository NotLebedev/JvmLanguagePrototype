package src.parsing.domain.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author NotLebedev
 */
public class ReflectionFieldWrapper {

    private final Field containedField;

    public ReflectionFieldWrapper(Class<?> cls, String fieldName) throws NoSuchFieldException {
        containedField = cls.getField(fieldName);
    }

    public String getName() {
        return containedField.getName();
    }

    public boolean isStatic() {

        return (containedField.getModifiers() & Modifier.STATIC) != 0;

    }

    public ReflectionClassWrapper getType() {
        return ClassFactory.getInstance().forClass(containedField.getType());
    }

}
