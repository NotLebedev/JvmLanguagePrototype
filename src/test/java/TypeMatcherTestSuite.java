import org.junit.jupiter.api.Test;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.Variable;
import src.parsing.domain.utils.TypeMatcher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author NotLebedev
 */
public class TypeMatcherTestSuite {

    @Test
    public void testEqual() throws ClassNotFoundException {

        testSingleEqual(new Variable("int", "", 0), new Variable("int", "", 0));
        testSingleEqual(new Variable("java.lang.String", "", 0), new Variable("java.lang.String", "", 0));
        testSingleEqual(new Variable("java.lang.StringBuilder", "", 0), new Variable("java.lang.StringBuilder", "", 0));
        testSingleEqual(new Variable("long", "", 0), new Variable("long", "", 0));

    }

    private void testSingleEqual(Value val1, Value val2) {

        assertEquals(TypeMatcher.getInstance().match(val1, val2), val2);

    }

    @Test
    public void testB2P() throws ClassNotFoundException {

        var tm = TypeMatcher.getInstance();

        assertNotNull(tm.match(new Variable("int", "", 0), new Variable("java.lang.Integer", "", 0)));
        assertNotNull(tm.match(new Variable("byte", "", 0), new Variable("java.lang.Byte", "", 0)));
        assertNotNull(tm.match(new Variable("short", "", 0), new Variable("java.lang.Short", "", 0)));
        assertNotNull(tm.match(new Variable("long", "", 0), new Variable("java.lang.Long", "", 0)));
        assertNotNull(tm.match(new Variable("char", "", 0), new Variable("java.lang.Character", "", 0)));
        assertNotNull(tm.match(new Variable("boolean", "", 0), new Variable("java.lang.Boolean", "", 0)));
        assertNotNull(tm.match(new Variable("float", "", 0), new Variable("java.lang.Float", "", 0)));
        assertNotNull(tm.match(new Variable("double", "", 0), new Variable("java.lang.Double", "", 0)));

    }

    @Test
    public void testP2B() throws ClassNotFoundException {

        var tm = TypeMatcher.getInstance();

        assertNotNull(tm.match(new Variable("java.lang.Integer", "", 0), new Variable("int", "", 0)));
        assertNotNull(tm.match(new Variable("java.lang.Byte", "", 0), new Variable("byte", "", 0)));
        assertNotNull(tm.match(new Variable("java.lang.Short", "", 0), new Variable("short", "", 0)));
        assertNotNull(tm.match(new Variable("java.lang.Long", "", 0), new Variable("long", "", 0)));
        assertNotNull(tm.match(new Variable("java.lang.Character", "", 0), new Variable("char", "", 0)));
        assertNotNull(tm.match(new Variable("java.lang.Boolean", "", 0), new Variable("boolean", "", 0)));
        assertNotNull(tm.match(new Variable("java.lang.Float", "", 0), new Variable("float", "", 0)));
        assertNotNull(tm.match(new Variable("java.lang.Double", "", 0), new Variable("double", "", 0)));

    }

}
