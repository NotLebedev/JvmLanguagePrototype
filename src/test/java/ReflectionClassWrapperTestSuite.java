import org.junit.Test;
import src.parsing.domain.structure.ReflectionClassWrapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author NotLebedev
 */
public class ReflectionClassWrapperTestSuite {

    @Test
    public void testEquals() {

        try {
            assertEquals(new ReflectionClassWrapper("java.lang.String"), new ReflectionClassWrapper("java.lang.String"));
            assertEquals(new ReflectionClassWrapper("java.lang.Integer"), new ReflectionClassWrapper("java.lang.Integer"));
            assertEquals(new ReflectionClassWrapper("java.lang.Boolean"), new ReflectionClassWrapper("java.lang.Boolean"));
            assertEquals(new ReflectionClassWrapper("int"), new ReflectionClassWrapper("int"));
            assertEquals(new ReflectionClassWrapper("float"), new ReflectionClassWrapper("float"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assertTrue(!new ReflectionClassWrapper("int").equals(new ReflectionClassWrapper("java.lang.String")));
            assertTrue(!new ReflectionClassWrapper("java.lang.Integer").equals(new ReflectionClassWrapper("java.lang.String")));
            assertTrue(!new ReflectionClassWrapper("int").equals(new ReflectionClassWrapper("java.lang.String")));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
