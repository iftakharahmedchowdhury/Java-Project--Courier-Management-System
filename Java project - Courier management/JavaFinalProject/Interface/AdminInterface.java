package Interface;

import Classes.Admin;

interface AdminInterface {
   // boolean setAdminLogIn(String adminUserName,String adminPassword);
    Admin searchAdminForLogin(String adminUserName, String adminPassword);
    boolean insertAdmin(Admin a);

}
