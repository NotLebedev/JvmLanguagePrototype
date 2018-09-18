import org.junit.jupiter.api.Test;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.Variable;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.utils.TypeMatcher;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NotLebedev
 */
public class TypeMatcherTestSuite {

    @Test
    public void testMatches() {

        assertSingleMatch("int", "int");
        assertSingleMatch("long", "long");

        assertSingleMatch("char", "int");
        assertSingleMatch("int", "short");
        assertSingleMatch("byte", "short");

        assertSingleMatch("int", "java.lang.Integer");
        assertSingleMatch("byte", "java.lang.Byte");
        assertSingleMatch("boolean", "java.lang.Boolean");

        assertSingleMatch("int", "java.lang.Short");
        assertSingleMatch("short", "java.lang.Character");
        assertSingleMatch("byte", "java.lang.Integer");

        assertSingleNotMatch("int", "long");
        assertSingleNotMatch("boolean", "java.lang.String");
        assertSingleNotMatch("java.lang.Byte", "java.lang.Integer");
        assertSingleNotMatch("int", "java.lang.Long");


    }

    private void assertSingleMatch(String class1, String class2) {

        var tm = TypeMatcher.getInstance();

        assertTrue(tm.matches(ClassFactory.getInstance().forCorrectName(class1), ClassFactory.getInstance().forCorrectName(class2)));

    }

    private void assertSingleNotMatch(String class1, String class2) {

        var tm = TypeMatcher.getInstance();

        assertFalse(tm.matches(ClassFactory.getInstance().forCorrectName(class1), ClassFactory.getInstance().forCorrectName(class2)));

    }

    @Test
    public void testEqual() throws ClassNotFoundException, IncompatibleTypesException {

        testSingleEqual(new Variable("int", "", 0), new Variable("int", "", 0));
        testSingleEqual(new Variable("java.lang.String", "", 0), new Variable("java.lang.String", "", 0));
        testSingleEqual(new Variable("java.lang.StringBuilder", "", 0), new Variable("java.lang.StringBuilder", "", 0));
        testSingleEqual(new Variable("long", "", 0), new Variable("long", "", 0));

    }

    private void testSingleEqual(Value val1, Value val2) throws IncompatibleTypesException {

        assertEquals(TypeMatcher.getInstance().match(val1, val2), val2);

    }

    @Test
    public void testB2P() throws ClassNotFoundException, IncompatibleTypesException {

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
    public void testP2B() throws ClassNotFoundException, IncompatibleTypesException {

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

    @Test
    public void testSingleWordGroup() throws ClassNotFoundException, IncompatibleTypesException {

        var tm = TypeMatcher.getInstance();

        assertNotNull(tm.match(new Variable("char", "", 0), new Variable("int", "", 0)));
        assertNotNull(tm.match(new Variable("byte", "", 0), new Variable("short", "", 0)));
        assertNotNull(tm.match(new Variable("byte", "", 0), new Variable("int", "", 0)));
        assertNotNull(tm.match(new Variable("byte", "", 0), new Variable("char", "", 0)));

    }

}
