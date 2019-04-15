package src.parsing.domain.structure;

import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.structure.interfaces.AbstractField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author NotLebedev
 */
public class ReflectionFieldWrapper implements AbstractField {

    private final Field containedField;
    private final AbstractClass ownerClass;

    public ReflectionFieldWrapper(Class<?> cls, AbstractClass ownerClass, String fieldName) throws NoSuchFieldException {

        containedField = cls.getField(fieldName);
        this.ownerClass = ownerClass;

    }

    public String getName() {
        return containedField.getName();
    }

    public boolean isStatic() {

        return (containedField.getModifiers() & Modifier.STATIC) != 0;

    }

    public AbstractClass getOwnerClass() {
        return ownerClass;
    }

    public ReflectionClassWrapper getType() {
        return ClassFactory.getInstance().forClass(containedField.getType());
    }

}
