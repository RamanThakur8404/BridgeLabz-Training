package com.annotations.roleallowed;
public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted");
    }
}