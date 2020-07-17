package uy.gub.agesic.pge.context;

import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;

class SecurityActions {

    static Class<?> loadClass(final Class<?> theClass, final String fullQualifiedName) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            return AccessController.doPrivileged(new PrivilegedAction<Class<?>>() {
                public Class<?> run() {
                    ClassLoader classLoader = theClass.getClassLoader();
                    Class<?> clazz = SecurityActions.loadClass(classLoader, fullQualifiedName);

                    if (clazz == null) {
                        classLoader = Thread.currentThread().getContextClassLoader();
                        clazz = SecurityActions.loadClass(classLoader, fullQualifiedName);
                    }
                    return clazz;
                }
            });
        }

        ClassLoader classLoader = theClass.getClassLoader();
        Class<?> clazz = loadClass(classLoader, fullQualifiedName);
        if (clazz == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
            clazz = loadClass(classLoader, fullQualifiedName);
        }
        return clazz;
    }

    static Class<?> loadClass(final ClassLoader classLoader, final String fullQualifiedName) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null)
            return AccessController.doPrivileged(new PrivilegedAction<Class<?>>() {
                public Class<?> run() {
                    try {
                        return classLoader.loadClass(fullQualifiedName);
                    } catch (ClassNotFoundException e) {
                        return null;
                    }
                }
            });
        try {
            return classLoader.loadClass(fullQualifiedName);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    static String getSystemProperty(final String key, final String defaultValue) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            return AccessController.doPrivileged(new PrivilegedAction<String>() {
                public String run() {
                    return System.getProperty(key, defaultValue);
                }
            });
        }
        return System.getProperty(key, defaultValue);
    }

    static URL loadResource(final Class<?> clazz, final String resourceName) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            return AccessController.doPrivileged(new PrivilegedAction<URL>() {
                public URL run() {
                    ClassLoader clazzLoader = clazz.getClassLoader();
                    URL url = clazzLoader.getResource(resourceName);
                    if (url == null) {
                        clazzLoader = Thread.currentThread().getContextClassLoader();
                        url = clazzLoader.getResource(resourceName);
                    }
                    return url;
                }
            });
        }

        ClassLoader clazzLoader = clazz.getClassLoader();
        URL url = clazzLoader.getResource(resourceName);
        if (url == null) {
            clazzLoader = Thread.currentThread().getContextClassLoader();
            url = clazzLoader.getResource(resourceName);
        }
        return url;
    }

    static String getProperty(final String key, final String defaultValue) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            return AccessController.doPrivileged(new PrivilegedAction<String>() {
                public String run() {
                    return System.getProperty(key, defaultValue);
                }
            });
        }
        return System.getProperty(key, defaultValue);
    }
}