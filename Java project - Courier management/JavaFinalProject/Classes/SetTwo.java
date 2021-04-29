package Classes;

import java.io.*;
import java.util.Scanner;

public class SetTwo {
    private static Scanner x;
    Scanner sc = new Scanner(System.in);

    public static void editSetStatus(String SetStatusFilePath, String DeliverySenderPhonenumber, String satus) throws IOException { //IOException

        FileReader fr = new FileReader(SetStatusFilePath);
        BufferedReader br = new BufferedReader(fr);
        String line1 = "";
        int i = 0;

        while ((line1 = br.readLine()) != null) {

          //  RemoveElement r6 = new RemoveElement();
           // r6.removeSetStatus(SetStatusFilePath, DeliverySenderPhonenumber);
            System.out.println("test under if value 1");

            System.out.println("Check-5");
            //String deliveryBoyFilePath="Delivery.txt";senderNumberRemoveCourierSFO
            String tempFile ="tempStatus.txt";
            File oldFile = new File (SetStatusFilePath);
            File newFile=new File(tempFile);
            String confirmYourPhoneNumberOfc="";
            String status="";
            System.out.println("test under if value 2");
            System.out.println("Check-4");
            try{
                FileWriter fw = new FileWriter(tempFile,true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                x=new Scanner(new File(SetStatusFilePath));
                System.out.println("Check-3");
                x.useDelimiter("[,\n]");
                System.out.println("Check-2");

               // int count=0;
                System.out.println("test under if value 3");
                while (x.hasNext()){

                    System.out.println("Check-1");
                    confirmYourPhoneNumberOfc=x.next();
                    status=x.next();

                    System.out.println("Check1");
                    if(!confirmYourPhoneNumberOfc.equals(DeliverySenderPhonenumber)){
                        pw.println(confirmYourPhoneNumberOfc+","+status);
                        System.out.println("Check2");
                        System.out.println("test under if value 4");

                    }
                   // count++;


                }
               // if(count!=0){
                    System.out.println("Check3");

                    x.close();
                    pw.flush();
                    pw.close();
                    oldFile.delete();
                    File dump = new File(SetStatusFilePath);
                    newFile.renameTo(dump);
                    System.out.println("Check4");

                    ///////////////////////////////////////////


                ////////////////////////////////////


              //  }




            }catch (Exception ex){
                System.out.println("Check5");


            }
           /* System.out.println("test under if value 5");
            File file = new File(SetStatusFilePath);
            file.createNewFile();

            FileWriter writer = new FileWriter(file, true);
            PrintWriter pw1 = new PrintWriter(writer);
            //  writer.write(fileContent);

            pw1.println(DeliverySenderPhonenumber + "," + satus);
            // writer.write(System.lineSeparator());//System.getProperty("line.separator")
            writer.flush();
            writer.close();*/


        }



            System.out.println("test under if value 6");
            File file = new File("SetStatusDelivery.txt");
            file.createNewFile();

            FileWriter writer = new FileWriter(file,true);
            PrintWriter pw1=new PrintWriter(writer);
            //  writer.write(fileContent);

            pw1.println(DeliverySenderPhonenumber+","+satus);
            // writer.write(System.lineSeparator());//System.getProperty("line.separator")
            writer.flush();
            writer.close();



    }
}
