package com.annotations.roleallowed;
import java.lang.reflect.Method;

public class SecurityManager {

    public static void invoke(Object obj, String methodName, String role)
            throws Exception {

        Method m = obj.getClass().getMethod(methodName);

        if (m.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed ra = m.getAnnotation(RoleAllowed.class);
            if (!ra.value().equals(role)) {
                System.out.println("Access Denied!");
                return;
            }
        }
        m.invoke(obj);
    }

    public static void main(String[] args) throws Exception {
        AdminService service = new AdminService();
        invoke(service, "deleteUser", "USER");
        invoke(service, "deleteUser", "ADMIN");
    }
}