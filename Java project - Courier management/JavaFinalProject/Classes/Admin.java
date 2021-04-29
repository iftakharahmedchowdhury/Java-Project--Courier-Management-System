package Classes;

public class Admin{
 //   Admin admin[] = new Admin[10];

    private String adminUserName;
    private String adminPassword;

    public Admin() {
    }

    public Admin(String adminUserName, String adminPassword) {
        this.adminUserName = adminUserName;
        this.adminPassword = adminPassword;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    void showInfo(){
        System.out.println(adminUserName);
        System.out.println(adminPassword);
    }

  /*  public void checkAdmin(String a,String b){
        if(a.equals(adminUserName) && b.equals(adminPassword)){
            System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------|");
            System.out.println("\t\t\t\t\t\t\t\t\t|    successfully login       |");
            System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------|");
        }
        else{
            System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------------------|");
            System.out.println("\t\t\t\t\t\t\t\t\t|Please enter correct User name and password   |");
            System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------------------|");




        }



    }*/

}