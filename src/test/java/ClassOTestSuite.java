import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import src.parsing.domain.ClassO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author NotLebedev
 */
public class ClassOTestSuite {

    @Test
    public void testEquals() {

        try {
            assertEquals(new ClassO("java.lang.String"), new ClassO("java.lang.String"));
            assertEquals(new ClassO("java.lang.Integer"), new ClassO("java.lang.Integer"));
            assertEquals(new ClassO("java.lang.Boolean"), new ClassO("java.lang.Boolean"));
            assertEquals(new ClassO("int"), new ClassO("int"));
            assertEquals(new ClassO("float"), new ClassO("float"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assertTrue(!new ClassO("int").equals(new ClassO("java.lang.String")));
            assertTrue(!new ClassO("java.lang.Integer").equals(new ClassO("java.lang.String")));
            assertTrue(!new ClassO("int").equals(new ClassO("java.lang.String")));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
