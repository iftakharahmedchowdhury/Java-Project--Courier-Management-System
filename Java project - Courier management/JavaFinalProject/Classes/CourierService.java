package Classes;

import Interface.CustomerInterface;
import Interface.DeliveryBoyInterface;

import java.io.*;
import java.util.Scanner;

public class CourierService implements DeliveryBoyInterface, CustomerInterface {
    private static Scanner x;

   Admin admin[] = new Admin[10];
    DeliveryBoy del1[] = new DeliveryBoy[200];
    //Customers c1[] = new Customers[1000];
    Customers c1[] = new Customers[1000];

    /////////////////
    ////////////////////////////////////

    public boolean insertAdmin(Admin a) {
        boolean flag = false;
        for (int i = 0; i < admin.length; i++) {
            if (admin[i] == null) {
                admin[i] = a;
                flag = true;
                break;
            }
        }
        return flag;
    }

    /////////////////////////////////

    public Admin searchAdminForLogin(String x,String y) {

        Admin a=null;
        for (int i = 0; i < admin.length; i++) {
            //System.out.println("");
            if (admin[i] != null) {
               if (admin[i].getAdminUserName().equals(x) && admin[i].getAdminPassword().equals(y)) {
                   a = admin[i];
                  // System.out.println("print c1"+c1[i]);
               }
            }
        }
        return a;

    }
     ///////////////////////////////////////
     /* public boolean setAdminLogIn(String x, String y) {

        boolean flag = false;

        for (int i = 0; i < admin.length; i++) {
            if (admin[i].equals(x) && admin[i].equals(y)) {

                System.out.println("Log in succesfull");

                flag = true;

            }
            else{
                System.out.println("Enter correct id and pass ");
            }


        }
        return flag;
    }*/
    ///////////////////


    public boolean insertDeliveryBoy(DeliveryBoy e) throws IOException {
        boolean flag = false;
        for (int i = 0; i < del1.length; i++) {
            if (del1[i] == null) {
                del1[i] = e;

                File file = new File("Delivery.txt");
                file.createNewFile();
                String fileContent;
                try (Scanner scan = new Scanner(file)) {

                   // fileContent = (del1[i].getDeliveryBoyId() + "," + del1[i].getDeliveryBoyName() + "," + del1[i].getDeliveryBoyAge()+ "," + del1[i].getDeliveryBoyGender()+ "," + del1[i].getDeliveryBoyAddress()+ "," + del1[i].getDeliveryBoyContactNumber()+ "," + del1[i].getDeliveryBoyEmailAddress()+","+del1[i].getDeliveryBoyPassword());

                   // while (scan.hasNext()) {
                   //    fileContent = (scan.nextLine().concat(fileContent));
                   // }
                }
                FileWriter writer = new FileWriter(file,true);
                PrintWriter pw=new PrintWriter(writer);
              //  writer.write(fileContent);
                pw.println((del1[i].getDeliveryBoyId() + "," + del1[i].getDeliveryBoyName() + "," + del1[i].getDeliveryBoyAge()+ "," + del1[i].getDeliveryBoyGender()+ "," + del1[i].getDeliveryBoyAddress()+ "," + del1[i].getDeliveryBoyContactNumber()+ "," + del1[i].getDeliveryBoyEmailAddress()+","+del1[i].getDeliveryBoyPassword()));
               // writer.write(System.lineSeparator());//System.getProperty("line.separator")
                writer.flush();
                writer.close();

                flag = true;
                break;
            }
        }
        return flag;
    }

    //////////Show all delivery boy////
    public void showAllDeliveryBoyInfo() throws IOException {
        int count=0;
        ///////////////////////////////////////////////txt file method//////////////////////////////
        File productData = new File("Delivery.txt");
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int j = 0;
        while((line = br.readLine())!=null){
            String[] valuessfo = line.split(",");
            try {

                System.out.println("\n\t\t\t\t\t\t\t\t\t===========================================================\n\t\t\t\t\t\t\t\t\tDelivery Boy Id: "+valuessfo[0]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Name : "+valuessfo[1]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Age : "+valuessfo[2]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Gender : "+valuessfo[3]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Address : "+valuessfo[4]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy ContactNumber : "+valuessfo[5]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy EmailAddress : "+valuessfo[6]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Password : "+valuessfo[7]);
                j++;
            }catch (ArrayIndexOutOfBoundsException ar){}

        }
        br.close();
        fr.close();
       // if((line = br.readLine())==null){
          //  System.out.println("No delivery boy found");
        //}else{}






        ///////////////////////////////////////////////txt file method//////////////////////////////


        for (int i = 0; i < del1.length; i++) {
            if (del1[i] != null) {
                //System.out.println("\t\t\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              //  System.out.println("\t\t\t\t\t\t\t\t\tDelivery boy Id: " + del1[i].getDeliveryBoyId());
               // System.out.println("\t\t\t\t\t\t\t\t\tDelivery boy Name: " + del1[i].getDeliveryBoyName());
               // System.out.println("\t\t\t\t\t\t\t\t\tDelivery boy Age" + del1[i].getDeliveryBoyAge());
               // System.out.println("\t\t\t\t\t\t\t\t\tDelivery boy Gender" + del1[i].getDeliveryBoyGender());
               // System.out.println("\t\t\t\t\t\t\t\t\tDelivery boy Address " + del1[i].getDeliveryBoyAddress());
               // System.out.println("\t\t\t\t\t\t\t\t\tDelivery boy  Contact Number " + del1[i].getDeliveryBoyContactNumber());
               // System.out.println("\t\t\t\t\t\t\t\t\tDelivery boy  Email Address " + del1[i].getDeliveryBoyEmailAddress());
              //  System.out.println("\t\t\t\t\t\t\t\t\tDelivery boy  " + del1[i].getDeliveryBoyPassword());

              //  System.out.println("");
                count++;

            } else {
               // System.out.println("\t\t\t\t\t\t\t\t\t======================================");
             //   System.out.println("\t\t\t\t\t\t\t\t\t      No more Delivery Boy found     ");
               // System.out.println("\t\t\t\t\t\t\t\t\t======================================");
                // System.out.println("");
                // break;

            }


        }
       // if(count==0){
          //  System.out.println("\t\t\t\t\t\t\t\t\t======================================");
          //    System.out.println("\t\t\t\t\t\t\t\t\t      No more Delivery Boy found     ");
           //  System.out.println("\t\t\t\t\t\t\t\t\t======================================");
       // }

    }

   /*  private static Scanner x;
    ///////////////delivery boy login
    public static DeliveryBoy verifyDeliveryBoyLogin(String deliveryBoyId, String deliveryBoyPassword, String filepath )
    {
        boolean found= false;
        String tempUserId="";
        String tempPassword="";
        try{
            x=new Scanner(new File(filepath));
            x.useDelimiter("[,EndDetails]");
            while (x.hasNext() && !found){
                tempUserId =x.nextLine();
                tempPassword = x.nextLine();

                if(tempUserId.trim().equals(deliveryBoyId.trim()) && tempPassword.trim().equals(deliveryBoyPassword.trim()));
                {
                    found = true;
                }
            }
            x.close();
            System.out.println(found);


        }catch (Exception w){}
        return null;
    }*/

    //////////////////end delivery boy log in


    //// Remove delivery boy///

    public boolean removeDeliveryBoy(DeliveryBoy e) {

        boolean flag = false;
        ///// text
        String deliveryBoyFilePath="Delivery.txt";
        String tempFile ="temp.txt";
        File oldFile = new File (deliveryBoyFilePath);
        File newFile=new File(tempFile);
        String deliveryBoyId="";
        String deliveryBoyName="";
        String deliveryBoyAge="";
        String deliveryBoyGender="";
        String deliveryBoyAddress="";
        String deliveryBoyContactNumber="";
        String deliveryBoyEmailAddress="";
        String deliveryBoyPassword="";
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(deliveryBoyFilePath));
            x.useDelimiter("[,\n]");


            while (x.hasNext()){
                deliveryBoyId=x.next();
                deliveryBoyName=x.next();
                deliveryBoyAge=x.next();
                deliveryBoyGender=x.next();
                deliveryBoyAddress=x.next();
                deliveryBoyContactNumber=x.next();
                deliveryBoyEmailAddress=x.next();
                deliveryBoyPassword=x.next();
                if(!e.equals(deliveryBoyId)){
                    pw.println(deliveryBoyId+","+deliveryBoyName+","+deliveryBoyAge+","+deliveryBoyGender+","+deliveryBoyAddress+","+deliveryBoyContactNumber+","+deliveryBoyEmailAddress+","+deliveryBoyPassword+","+"EndDetails"+"//");
                }

            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(deliveryBoyFilePath);
            newFile.renameTo(dump);



        }catch (Exception ex){

        }
        ///text///
        for (int i = 0; i < del1.length; i++) {
            if (del1[i] == e) {

                del1[i] = null;


              /*  // txt method
                String deliveryBoyFilePath="Delivery.txt";
                String tempFile ="temp.txt";
                File oldFile = new File (deliveryBoyFilePath);
                File newFile=new File(tempFile);
                String deliveryBoyId="";
                String deliveryBoyName="";
                 String deliveryBoyAge="";
                 String deliveryBoyGender="";
                String deliveryBoyAddress="";
                 String deliveryBoyContactNumber="";
                 String deliveryBoyEmailAddress="";
                 String deliveryBoyPassword="";
                 try{
                     FileWriter fw = new FileWriter(tempFile,true);
                     BufferedWriter bw=new BufferedWriter(fw);
                     PrintWriter pw = new PrintWriter(bw);
                     x=new Scanner(new File(deliveryBoyFilePath));
                     x.useDelimiter("[,\n]");

                     while (x.hasNext()){
                         deliveryBoyId=x.next();
                         deliveryBoyName=x.next();
                         deliveryBoyAge=x.next();
                         deliveryBoyGender=x.next();
                         deliveryBoyAddress=x.next();
                         deliveryBoyContactNumber=x.next();
                         deliveryBoyEmailAddress=x.next();
                         deliveryBoyPassword=x.next();
                         if(!deliveryBoyId.equals(e)){
                             pw.println(deliveryBoyId+","+deliveryBoyName+","+deliveryBoyAge+","+deliveryBoyGender+","+deliveryBoyAddress+","+deliveryBoyContactNumber+","+deliveryBoyEmailAddress+","+deliveryBoyPassword+","+"EndDetails\n");
                         }

                     }
                     x.close();
                     pw.flush();
                     pw.close();
                     oldFile.delete();
                     File dump = new File(deliveryBoyFilePath);
                     newFile.renameTo(dump);



                 }catch (Exception ex){

                 }//////////////////////////////////////////////////////////

                // txt method*/

                flag = true;
                break;
            }
        }
        return flag;
    }//remove delivery boy end

    //search Delivery boy start
    public DeliveryBoy searchDeliveryBoy(String deliveryBoyId) throws FileNotFoundException {
        ////////////////////////txt method ////////////////////////////

        String filepath="Delivery.txt";
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int j = 0;
        File file= new File(filepath);
        try{
            Scanner inputBuffer=new Scanner(file);
            while((line = br.readLine())!=null){
                String line1=inputBuffer.nextLine();
                String[] valueDeliveryBoy =line1.split(",");
                if(valueDeliveryBoy[0].equals(deliveryBoyId)){
                    try{
                       // System.out.println("Sender Phone Number: "+valueTrack[0]+" Your product status : "+valueTrack[1]);
                        System.out.println("\n\t\t\t\t\t\t\t\t\t===========================================================\n\t\t\t\t\t\t\t\t\tDelivery Boy Id: "+valueDeliveryBoy[0]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Name : "+valueDeliveryBoy[1]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Age : "+valueDeliveryBoy[2]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Gender : "+valueDeliveryBoy[3]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Address : "+valueDeliveryBoy[4]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy ContactNumber : "+valueDeliveryBoy[5]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy EmailAddress : "+valueDeliveryBoy[6]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Password : "+valueDeliveryBoy[7]);
                    }catch (ArrayIndexOutOfBoundsException ar){}
                }
            }

            fr.close();
            br.close();


        //}catch (FileNotFoundException fe){
          // fe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        ////////////////////////txt method ////////////////////////////
        DeliveryBoy e = null;

        for (int i = 0; i < del1.length; i++) {
            if (del1[i] != null) {
                if (del1[i].getDeliveryBoyId().equals(deliveryBoyId)) {
                    e = del1[i];
                    break;
                }
            }
        }
        return e;
    }// search delivery boy end

    /////////////////////Customer part start///////////////////////////

    public boolean setCustomer(Customers c) throws IOException { // setCustomer start
        boolean flag = false;
       // File customerFile = new File("Customer.txt");
       // customerFile.createNewFile();
      //  PrintStream writer=new PrintStream(customerFile);

        for (int i = 0; i < c1.length; i++) {

            if (c1[i] == null) {
                c1[i] = c;

                File file = new File("Customer.txt");
                file.createNewFile();
                String fileContent;
                try (Scanner scan = new Scanner(file)) {

                    // fileContent = (del1[i].getDeliveryBoyId() + "," + del1[i].getDeliveryBoyName() + "," + del1[i].getDeliveryBoyAge()+ "," + del1[i].getDeliveryBoyGender()+ "," + del1[i].getDeliveryBoyAddress()+ "," + del1[i].getDeliveryBoyContactNumber()+ "," + del1[i].getDeliveryBoyEmailAddress()+","+del1[i].getDeliveryBoyPassword());

                    // while (scan.hasNext()) {
                    //    fileContent = (scan.nextLine().concat(fileContent));
                    // }
                }
                FileWriter writer = new FileWriter(file,true);
                PrintWriter pw=new PrintWriter(writer);
                //  writer.write(fileContent);
                pw.println((c1[i].getCustomerContactNumber() + "," + c1[i].getCustomerName() + "," + c1[i].getCustomerAge()+ "," + c1[i].getCustomerGender()+ "," + c1[i].getCustomerEmailAdress()+ "," + c1[i].getCustomerAddress()+ "," + c1[i].getCustomerPassword()));
                // writer.write(System.lineSeparator());//System.getProperty("line.separator")
                writer.flush();
                writer.close();

               /* File file = new File("Customer.txt");
                file.createNewFile();
                String fileContent;
                try (Scanner scan = new Scanner(file)) {

                    fileContent = (c1[i].getCustomerContactNumber() + "," + c1[i].getCustomerName() + "," + c1[i].getCustomerAge()+ "," + c1[i].getCustomerGender()+ "," + c1[i].getCustomerEmailAdress()+ "," + c1[i].getCustomerAddress()+ "," + c1[i].getCustomerPassword());

                    while (scan.hasNext()) {
                        fileContent = (scan.nextLine().concat(fileContent));
                    }
                }
                FileWriter writer = new FileWriter("Customer.txt");
           writer.write(fileContent);
           writer.close();*/


                ///Formatter formatter=new Formatter("Customer.txt");

              //  if(formatter==null) {


                 // formatter.format("%s %s %s \r\n", c1[i].getCustomerContactNumber(), c1[i].getCustomerName(), c1[i].getCustomerEmailAdress());


                  //  formatter.close();
                //}






                //int index=0;
              //  for(int index=0 ; index<1000;index++){
               // writer.print(c1[i].getCustomerContactNumber());
               // writer.print(c1[i].getCustomerName());

              //  writer.print(c1[i].getCustomerAge());
              //  writer.print(c1[i].getCustomerGender());
              //  writer.print(c1[i].getCustomerAddress());
              //  writer.print(c1[i].getCustomerEmailAdress());



               //     break;
              //  }
              //  writer.flush();
               // writer.close();

                flag = true;
                break;
            }

        }
        return flag;
    }// set customer end

    // set customer by txt file

    // set customer by txt file


    public Customers searchCustomer(String customerSearchPhoneNumber) {
        Customers c = null;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != null) {
                if (c1[i].getCustomerContactNumber().equals(customerSearchPhoneNumber)) {
                    c = c1[i];

                }
            }
        }
        return c;

    }


    public boolean removeCustomer(Customers c) {///remove Customer
        boolean flag = false;
        //////////////txt method//////////////////////



        //////////////txt method//////////////////////

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c) {
                c1[i] = null;
                flag = true;
            }
        }
        return flag;

    }// remove customer end

    /////////////customer log in

    public boolean customerLogin(String x, String y) {

        boolean flag = false;

        for (int i = 0; i < c1.length; i++) {
            if (c1[i].equals(x) && c1[i].equals(y)) {
                System.out.println("\t\t\t\t\t\t\t\t\t======================================");
                System.out.println("\t\t\t\t\t\t\t\t\t      Log in successfully    ");
                System.out.println("\t\t\t\t\t\t\t\t\t======================================");


                flag = true;

            }
            else{
                System.out.println("\t\t\t\t\t\t\t\t\t======================================");
                System.out.println("\t\t\t\t\t\t\t\t\t  Please Enter correct id and pass    ");
                System.out.println("\t\t\t\t\t\t\t\t\t======================================");

            }


        }
        return flag;
    }



    public Customers searchCustomerForLogin(String customerContactNumber1,String customerPasswordForLogIn) {
       // Customers c =new Customers();
        Customers c=null;
        for (int i = 0; i < c1.length; i++) {
            System.out.println("");
            if (c1[i] != null) {

               // System.out.println(c1[i].getCustomerContactNumber());
               // System.out.println(c1[i].getCustomerPassword());
               // System.out.println(customerContactNumber1);
               // System.out.println(customerPasswordForLogIn);
               if (c1[i].getCustomerContactNumber().equals(customerContactNumber1) && c1[i].getCustomerPassword().equals(customerPasswordForLogIn)) {
                //if (c1[i].getCustomerContactNumber()==customerContactNumber1 && c1[i].getCustomerPassword()==customerPasswordForLogIn) {
                 //  System.out.println("yes");


                    c = c1[i];
                    break;
                  // System.out.println("print c1"+c1[i]);
               }
            }
        }
        return c;

    }

    //////////////courier send part/////////////////
    public void courierSendFromHome(String confirmYourPhoneNumber, String senderName, String receiverName, String receiverContactNumber, String pickUpAddress, String receiverAddress, String courierDetails) throws IOException {

        File file = new File("SendDeliveryFromHome.txt");
        file.createNewFile();
        String fileContent;
        try (Scanner scan = new Scanner(file)) {

        }
        FileWriter writer = new FileWriter(file,true);
        PrintWriter pw=new PrintWriter(writer);
        //  writer.write(fileContent);
        pw.println(confirmYourPhoneNumber+","+senderName+","+receiverName+","+receiverContactNumber+","+pickUpAddress+","+receiverAddress+","+courierDetails);
        // writer.write(System.lineSeparator());//System.getProperty("line.separator")
        writer.flush();
        writer.close();



    }

   /* public void openFileSendFromHome()throws IOException{
        File productData = new File("SendDeliveryFromHome.txt");
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int i = 0;
        while((line = br.readLine())!=null){
            String[] valuessfh = line.split(",");
           try {

               System.out.println("\n\t\t\t\t\t\t\t\t\t==========================================================\n\t\t\t\t\t\t\t\t\tSender Phone number: " + valuessfh[0] + " \n\t\t\t\t\t\t\t\t\tSender Name: " + valuessfh[1] + " \n\t\t\t\t\t\t\t\t\tReceiver Name" + valuessfh[2] + " \n\t\t\t\t\t\t\t\t\tReceiver Contact Number : " + valuessfh[3] + " \n\t\t\t\t\t\t\t\t\tPic Up address :" + valuessfh[4] + " \n\t\t\t\t\t\t\t\t\tReceiver Address" + valuessfh[5] + " \n\t\t\t\t\t\t\t\t\tCourier Address : " + valuessfh[6]);
               i++;
           }catch (ArrayIndexOutOfBoundsException ar){}

        }

       br.close();
        fr.close();

    }*/
   public void openFileSendFromHome() throws IOException {

///////////////////////////////////////////////////
       File productData = new File("SendDeliveryFromHome.txt");
       FileReader fr = new FileReader(productData);
       BufferedReader br = new BufferedReader(fr);
       String line = "";
       int i = 0;

       while((line = br.readLine())!=null){

           String[] valuessfo = line.split(",");
           try {

               System.out.println("\n\t\t\t\t\t\t\t\t\t==============================================================\n\t\t\t\t\t\t\t\t\tSender Phone number: "+valuessfo[0]+" \n\t\t\t\t\t\t\t\t\tSender Name: "+valuessfo[1]+" \n\t\t\t\t\t\t\t\t\tReceiver Name"+valuessfo[2]+" \n\t\t\t\t\t\t\t\t\tReceiver Contact Number : "+valuessfo[3]+" \n\t\t\t\t\t\t\t\t\tPic Up address :"+valuessfo[4]+" \n\t\t\t\t\t\t\t\t\tReceiver Address"+valuessfo[5]+" \n\t\t\t\t\t\t\t\t\tCourier Address : "+valuessfo[6]);
               i++;
           }catch (ArrayIndexOutOfBoundsException ar){}

       }

       br.close();
       fr.close();


   }

    public void courierSendFromOffice(String confirmYourPhoneNumberOfc, String senderNameofc, String receiverNameofc, String receiverContactNumberofc, String pickUpAddressofc, String receiverAddressofc, String courierDetailsofc) throws IOException {

        File file = new File("SendDeliveryFromOffice.txt");
        file.createNewFile();
        String fileContent;
        try (Scanner scan = new Scanner(file)) {

            // fileContent = (del1[i].getDeliveryBoyId() + "," + del1[i].getDeliveryBoyName() + "," + del1[i].getDeliveryBoyAge()+ "," + del1[i].getDeliveryBoyGender()+ "," + del1[i].getDeliveryBoyAddress()+ "," + del1[i].getDeliveryBoyContactNumber()+ "," + del1[i].getDeliveryBoyEmailAddress()+","+del1[i].getDeliveryBoyPassword());

            // while (scan.hasNext()) {
            //    fileContent = (scan.nextLine().concat(fileContent));
            // }
        }
        FileWriter writer = new FileWriter(file,true);
        PrintWriter pw=new PrintWriter(writer);
        //  writer.write(fileContent);
        pw.println(confirmYourPhoneNumberOfc+","+senderNameofc+","+receiverNameofc+","+receiverContactNumberofc+","+pickUpAddressofc+","+receiverAddressofc+","+courierDetailsofc);
        // writer.write(System.lineSeparator());//System.getProperty("line.separator")
        writer.flush();
        writer.close();


    }


    public void openFileSendFromOffice() throws IOException {
        /*
        Scanner file = new Scanner(new File("SendDeliveryFromOffice.txt"));
        while(file.hasNext()){
            String sfh=file.nextLine();
            String[] valuessfh =sfh.split(",");
            System.out.println("Sender Phone number: "+valuessfh[0]+" Sender Name: "+valuessfh[1]+" Receiver Name"+valuessfh[2]+" Receiver Contact Number : "+valuessfh[3]+" Pic Up address :"+valuessfh[4]+" Receiver Address"+valuessfh[5]+" Courier Address : "+valuessfh[6]);


        }*/
///////////////////////////////////////////////////
        File productData = new File("SendDeliveryFromOffice.txt");
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int i = 0;

        while((line = br.readLine())!=null){

            String[] valuessfo = line.split(",");
            try {

                System.out.println("\n\t\t\t\t\t\t\t\t\t==============================================================\n\t\t\t\t\t\t\t\t\tSender Phone number: "+valuessfo[0]+" \n\t\t\t\t\t\t\t\t\tSender Name: "+valuessfo[1]+" \n\t\t\t\t\t\t\t\t\tReceiver Name"+valuessfo[2]+" \n\t\t\t\t\t\t\t\t\tReceiver Contact Number : "+valuessfo[3]+" \n\t\t\t\t\t\t\t\t\tPic Up address :"+valuessfo[4]+" \n\t\t\t\t\t\t\t\t\tReceiver Address"+valuessfo[5]+" \n\t\t\t\t\t\t\t\t\tCourier Address : "+valuessfo[6]);
                i++;
            }catch (ArrayIndexOutOfBoundsException ar){}

        }

        br.close();
        fr.close();


    }


    /////////////////////store Home delivery information from receive customer/////////////////
    public void recHomeDelivery(String recSenderNumber, String recReceiverPhoneNumber, String recReceiverAddress) throws IOException {
        File file = new File("ReceiverHomeDelivery.txt");
        file.createNewFile();
        String fileContent;
        try (Scanner scan = new Scanner(file)) {

        }
        FileWriter writer = new FileWriter(file,true);
        PrintWriter pw=new PrintWriter(writer);
        pw.println(recSenderNumber+","+recReceiverPhoneNumber+","+recReceiverAddress+","+"Type : Home Delivery");
        writer.flush();
        writer.close();
    }



/////////////////////store receive  delivery from office information from receive customer/////////////////

    public void receiveDeliveryFromOffice(String recSenderNumber, String recReceiverPhoneNumber2, String recReceiverAddress2) throws IOException {


        File file = new File("ReceiveDeliveryFromOffice.txt");
        file.createNewFile();
        String fileContent;
        try (Scanner scan = new Scanner(file)) {

        }
        FileWriter writer = new FileWriter(file,true);
        PrintWriter pw=new PrintWriter(writer);
        pw.println(recSenderNumber+","+recReceiverPhoneNumber2+","+recReceiverAddress2+","+"Type : Receive from office");
        writer.flush();
        writer.close();
    }
    /////////////////////see all receive home delivery start///////////////////////////


    public void openFileReceiveHomeDelivery() throws IOException {

///////////////////////////////////////////////////
        File productData = new File("ReceiverHomeDelivery.txt");
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int i = 0;
        while((line = br.readLine())!=null){
            String[] valuessfo = line.split(",");
            try {

                System.out.println("\n\t\t\t\t\t\t\t\t\t===========================================================\n\t\t\t\t\t\t\t\t\tSender Phone number: "+valuessfo[0]+" \n\t\t\t\t\t\t\t\t\tReceiver phone number : "+valuessfo[1]+" \n\t\t\t\t\t\t\t\t\tDelivery Address : "+valuessfo[2]);
                i++;
            }catch (ArrayIndexOutOfBoundsException ar){}

        }

        br.close();
        fr.close();


    }


    /////////////////////see all receive home delivery end///////////////////////////
    /////////////////////see all receive delivery from office start///////////////////////////

    public void openFileReceiveDeliveryFromOffice() throws IOException {

///////////////////////////////////////////////////
        File productData = new File("ReceiveDeliveryFromOffice.txt");
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int i = 0;
        while((line = br.readLine())!=null){
            String[] valuessfo = line.split(",");
            try {

                System.out.println("\n\t\t\t\t\t\t\t\t\t===========================================================\n\t\t\t\t\t\t\t\t\tSender Phone number: "+valuessfo[0]+" \n\t\t\t\t\t\t\t\t\tReceiver phone number : "+valuessfo[1]+" \n\t\t\t\t\t\t\t\t\tDelivery Address : "+valuessfo[2]+"\n\t\t\t\t\t\t\t\t\t"+valuessfo[3]);
                i++;
            }catch (ArrayIndexOutOfBoundsException ar){}

        }

        br.close();
        fr.close();


    }
    /////////////////////see all receive delivery from office end///////////////////////////


}

