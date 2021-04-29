package Classes;

import java.io.*;
import java.util.Scanner;

//abstract class CourierCount{
   // public abstract void setCourierCount();
//}
public class ManageCourier{ //extends CourierCount {
    private static Scanner x;


   static int a =0;

public static void setCourierCount()
{
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("\t\t\t\t\t\t\t\t\t|====================================|");
    System.out.println("\t\t\t\t\t\t\t\t\t   Todays courier count : "+a);
    System.out.println("\t\t\t\t\t\t\t\t\t|====================================|");

}
    public static void setCourierCount(int b){
    a=b;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t|====================================|");
        System.out.println("\t\t\t\t\t\t\t\t\t      Todays courier count : "+a);
        System.out.println("\t\t\t\t\t\t\t\t\t|====================================|");
    }

////////////////////////// set customer complain start ////////////////////////
    public void setCustomerComplain(String comYourNumber,String comYourName, String comYourComplain, String comYourEmail) throws IOException {

        File file = new File("CustomerComplain.txt");
        file.createNewFile();
        String fileContent;
        try (Scanner scan = new Scanner(file)) {

        }
        FileWriter writer = new FileWriter(file,true);
        PrintWriter pw=new PrintWriter(writer);
        pw.println(comYourNumber+","+comYourName+","+comYourComplain+","+comYourEmail+","+"Type : complain of customer");
        writer.flush();
        writer.close();
    }

    ////////////////////////// set customer complain end//////// ////////////////////////

    ///////////////////////see all customer complain start///////////////////////////
    public void openCustomerComplainFile() throws IOException {

///////////////////////////////////////////////////
        File productData = new File("CustomerComplain.txt");
        productData.createNewFile();
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int i = 0;
        while((line = br.readLine())!=null){
            String[] valuessfo = line.split(",");
            try {

                System.out.println("\n\t\t\t\t\t\t\t\t\t==============================================================\n\t\t\t\t\t\t\t\t\tCustomer phone number: "+valuessfo[0]+"\n\t\t\t\t\t\t\t\t\tCustomer name: "+valuessfo[1]+" \n\t\t\t\t\t\t\t\t\tcustomer complain: "+valuessfo[2]+"\n\t\t\t\t\t\t\t\t\tCustomer email: "+valuessfo[3]+"\n\t\t\t\t\t\t\t\t\t"+valuessfo[4]);
                i++;
            }catch (ArrayIndexOutOfBoundsException ar){}

        }

        br.close();
        fr.close();


    }
    ///////////////////////see all customer complain end///////////////////////////


    //////////////////////// remove customer complain start///////////////////////////////
    public void removeCustomerComplain(String customerComFilePath, String customerNumberForRemoveComplain){
       // System.out.println("Check-5");
        //String deliveryBoyFilePath="Delivery.txt";senderNumberRemoveCourierSFO
        String tempFile ="tempCustomerComplain.txt";
        File oldFile = new File (customerComFilePath);
        File newFile=new File(tempFile);
        String comCustomerNumber="";
        String comCusName="";
        String comCusComplain="";
        String comCusEmail="";
        String comCusType="";

      //  System.out.println("Check-4");
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(customerComFilePath));
          //  System.out.println("Check-3");
            x.useDelimiter("[,\n]");
           // System.out.println("Check-2");

           // int count=0;
            while (x.hasNext()){

            //    System.out.println("Check-1");
                comCustomerNumber=x.next();
                comCusName=x.next();
                comCusComplain=x.next();
                comCusEmail=x.next();
                comCusType=x.next();

             //   System.out.println("Check1");
                if(!comCustomerNumber.equals(customerNumberForRemoveComplain)){
                    pw.println(comCustomerNumber+","+comCusName+","+comCusComplain+","+comCusEmail+","+comCusType);
                //    System.out.println("Check2");

                }
               // count++;


            }
           // if(count!=0){
             //   System.out.println("Check3");

                FileReader fr = new FileReader(oldFile);
                BufferedReader br = new BufferedReader(fr);
                br.close();
                fr.close();
                x.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File(customerComFilePath);
                newFile.renameTo(dump);
            //    System.out.println("Check4");

            //}




        }catch (Exception ex){
         //   System.out.println("Check5");


        }



    }



    //////////////////////// remove customer complain end////////////////////////////////
}