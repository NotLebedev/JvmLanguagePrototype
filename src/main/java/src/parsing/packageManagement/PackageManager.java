package src.parsing.packageManagement;

public class PackageManager {

    private static Package[] packages = Package.getPackages();

    public static boolean isPackage(String name) {

        for (Package aPackage : packages) {

            if(aPackage.getName().startsWith(name))
                return true;

        }

        return false;

    }

}
