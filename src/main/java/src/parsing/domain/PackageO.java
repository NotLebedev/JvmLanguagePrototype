package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.Interfaces.Value;
import src.parsing.packageManagement.PackageManager;

/**
 * Object containing package, no value-like access expected
 */
public class PackageO extends Value {

    private String path = null;

    public boolean updatePath(String next) {

        String newPath;

        if(path != null)
            newPath = path + "." + next;
        else
            newPath = next;


        if(PackageManager.isPackage(newPath)) {

            path = newPath;
            return true;

        }else
            return false;

    }

    public String getPath() {
        return path;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {
        // Empty
    }

    @Override
    public String getTypeString() {
        return null;
    }

    @Override
    public ClassO getType() {
        return null;
    }

}
