package uy.gub.agesic.pge.core.xml.util;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

class SecurityActions {
    static ClassLoader getContextClassLoader() {
        SecurityManager sm = System.getSecurityManager();
        if (sm == null) {
            return Thread.currentThread().getContextClassLoader();
        }
        return AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public ClassLoader run() {
                return Thread.currentThread().getContextClassLoader();
            }
        });
    }

    static Class<?> loadClass(final ClassLoader cl, final String name) throws PrivilegedActionException, ClassNotFoundException {
        SecurityManager sm = System.getSecurityManager();
        if (sm == null) {
            return cl.loadClass(name);
        }
        return AccessController.doPrivileged(new PrivilegedExceptionAction<Class<?>>() {
            public Class<?> run() throws PrivilegedActionException {
                try {
                    return cl.loadClass(name);
                } catch (Exception e) {
                    throw new PrivilegedActionException(e);
                }
            }
        });
    }

    static String getSystemProperty(final String name, final String defaultValue) {
        PrivilegedAction<String> action = new PrivilegedAction<String>() {
            public String run() {
                return System.getProperty(name, defaultValue);
            }
        };
        return AccessController.doPrivileged(action);
    }
}