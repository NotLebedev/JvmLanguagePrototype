import org.junit.Test;
import src.compilation.domain.structure.ClassFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author NotLebedev
 */
public class ReflectionClassWrapperTestSuite {

    @Test
    public void testEquals() {

        try {
            assertEquals(ClassFactory.getInstance().forName("java.lang.String"), ClassFactory.getInstance().forName("java.lang.String"));
            assertEquals(ClassFactory.getInstance().forName("java.lang.Integer"), ClassFactory.getInstance().forName("java.lang.Integer"));
            assertEquals(ClassFactory.getInstance().forName("java.lang.Boolean"), ClassFactory.getInstance().forName("java.lang.Boolean"));
            assertEquals(ClassFactory.getInstance().forName("int"), ClassFactory.getInstance().forName("int"));
            assertEquals(ClassFactory.getInstance().forName("float"), ClassFactory.getInstance().forName("float"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assertTrue(!ClassFactory.getInstance().forName("int").equals(ClassFactory.getInstance().forName("java.lang.String")));
            assertTrue(!ClassFactory.getInstance().forName("java.lang.Integer").equals(ClassFactory.getInstance().forName("java.lang.String")));
            assertTrue(!ClassFactory.getInstance().forName("int").equals(ClassFactory.getInstance().forName("java.lang.String")));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
