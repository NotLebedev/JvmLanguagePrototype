package src.parsing.domain.structure;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.interfaces.AbstractClass;

/**
 * Object containing package, no value-like access expected
 */
public class PackageO implements Value {

    private String path = null;

    private static final Package[] packages = Package.getPackages();

    public boolean updatePath(String next) {

        String newPath;

        if(path != null)
            newPath = path + "." + next;
        else
            newPath = next;


        if(isPackage(newPath)) {

            path = newPath;
            return true;

        } else
            return false;

    }

    public String getPath() {
        return path;
    }

    private static boolean isPackage(String name) {

        for (Package aPackage : packages) {

            if(aPackage.getName().startsWith(name))
                return true;

        }

        return false;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {
        // Empty
    }

    @Override
    public AbstractClass getType() {
        return null;
    }

}
