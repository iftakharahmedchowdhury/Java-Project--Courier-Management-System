package Classes;

import java.io.*;
import java.util.*;

public class RemoveElement {
    private static Scanner x;
    private static Scanner y;
    /////////////////////removeSendDeliveryFromHome start//////////////////
   /* public static void removeSendDeliveryFromHome(String sendDeliveryFromHomePath,String senderNumberRemoveCourier ){ //IOException
     //   System.out.println("Check-5");
        //String deliveryBoyFilePath="Delivery.txt";
        String tempSCFH = "tempDeliveryFromHome.txt";
        File oldFile = new File(sendDeliveryFromHomePath);
        File newFile = new File(tempSCFH);
        String confirmYourPhoneNumber = "";
        String senderName = "";
        String receiverName = "";
        String receiverContactNumber = "";
        String pickUpAddress = "";
        String receiverAddress = "";
        String courierDetails = "";

     //   System.out.println("Check-4");
         try{
        FileWriter fw = new FileWriter(tempSCFH, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        x = new Scanner(new File(sendDeliveryFromHomePath));
       // System.out.println("Check-3");
        x.useDelimiter("[,\n]");
      //  System.out.println("Check-2");

        //  int count=0;

        while (x.hasNext()) {

         //   System.out.println("Check-1");
            confirmYourPhoneNumber = x.next();
            senderName = x.next();
            receiverName = x.next();
            receiverContactNumber = x.next();
            pickUpAddress = x.next();
            receiverAddress = x.next();
            courierDetails = x.next();

          //  System.out.println("Check1");
            if (!confirmYourPhoneNumber.equals(senderNumberRemoveCourier)) {
                pw.println(confirmYourPhoneNumber + "," + senderName + "," + receiverName + "," + receiverContactNumber + "," + pickUpAddress + "," + receiverAddress + "," + courierDetails);
          //      System.out.println("Check2");

            }

         //   System.out.println("Check3");

            x.close();
            pw.flush();
            pw.close();
           // bw.close();
           // fw.close();

            oldFile.delete();

            File dump = new File(sendDeliveryFromHomePath);
            newFile.renameTo(dump);

          //  System.out.println("Check4");

          //  System.out.println("Check5");


             }
        }catch (Exception ecc){

         }
    }*/
    public void removeSendDeliveryFromHome(String sendDeliveryFromHomePath, String senderNumberRemoveCourier) {
        //  System.out.println("Check-5");
        //String deliveryBoyFilePath="Delivery.txt";senderNumberRemoveCourierSFO
        String tempFile ="tempSendFromHome.txt";
        File oldFile = new File (sendDeliveryFromHomePath);
        File newFile=new File(tempFile);
        String confirmYourPhoneNumberOfc="";
        String senderNameofc="";
        String receiverNameofc="";
        String receiverContactNumberofc="";
        String pickUpAddressofc="";
        String receiverAddressofc="";
        String courierDetailsofc="";

        //   System.out.println("Check-4");
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(sendDeliveryFromHomePath));
            //   System.out.println("Check-3");
            x.useDelimiter("[,\n]");
            //   System.out.println("Check-2");

            int count=0;
            while (x.hasNext()){

                //    System.out.println("Check-1");
                confirmYourPhoneNumberOfc=x.next();
                senderNameofc=x.next();
                receiverNameofc=x.next();
                receiverContactNumberofc=x.next();
                pickUpAddressofc=x.next();
                receiverAddressofc=x.next();
                courierDetailsofc=x.next();
                //   System.out.println("Check1");
                if(!confirmYourPhoneNumberOfc.equals(senderNumberRemoveCourier)){
                    pw.println(confirmYourPhoneNumberOfc+","+senderNameofc+","+receiverNameofc+","+receiverContactNumberofc+","+pickUpAddressofc+","+receiverAddressofc+","+courierDetailsofc);
                    //      System.out.println("Check2");

                }
                count++;


            }
            if(count!=0){
                //    System.out.println("Check3");

                x.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File(sendDeliveryFromHomePath);
                newFile.renameTo(dump);
                //  System.out.println("Check4");
            }




        }catch (Exception ex){
            // System.out.println("Check5");


        }



    }



    ///////////////////removeSendDeliveryFromHome end //////////////////////////

    ///////////////////removeSendDeliveryFromOffice Start//////////////////////////DeliveryBoyIdForRemove
    public void removeSendDeliveryFromOffice1(String sendDeliveryFromHomePathSFO, String senderNumberRemoveCourierSFO) {
      //  System.out.println("Check-5");
        //String deliveryBoyFilePath="Delivery.txt";senderNumberRemoveCourierSFO
        String tempFile ="tempSendFromOffice.txt";
        File oldFile = new File (sendDeliveryFromHomePathSFO);
        File newFile=new File(tempFile);
        String confirmYourPhoneNumberOfc="";
        String senderNameofc="";
        String receiverNameofc="";
        String receiverContactNumberofc="";
        String pickUpAddressofc="";
        String receiverAddressofc="";
        String courierDetailsofc="";

     //   System.out.println("Check-4");
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(sendDeliveryFromHomePathSFO));
         //   System.out.println("Check-3");
            x.useDelimiter("[,\n]");
         //   System.out.println("Check-2");

            int count=0;
            while (x.hasNext()){

            //    System.out.println("Check-1");
                confirmYourPhoneNumberOfc=x.next();
                senderNameofc=x.next();
                receiverNameofc=x.next();
                receiverContactNumberofc=x.next();
                pickUpAddressofc=x.next();
                receiverAddressofc=x.next();
                courierDetailsofc=x.next();
             //   System.out.println("Check1");
                if(!confirmYourPhoneNumberOfc.equals(senderNumberRemoveCourierSFO)){
                    pw.println(confirmYourPhoneNumberOfc+","+senderNameofc+","+receiverNameofc+","+receiverContactNumberofc+","+pickUpAddressofc+","+receiverAddressofc+","+courierDetailsofc);
              //      System.out.println("Check2");

                }
                count++;


            }
            if(count!=0){
            //    System.out.println("Check3");

                x.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File(sendDeliveryFromHomePathSFO);
                newFile.renameTo(dump);
              //  System.out.println("Check4");
            }




        }catch (Exception ex){
           // System.out.println("Check5");


        }



    }


    /////////////////removeSendDeliveryFromOffice end //////////////////////////////


    //////////////////////////remove set status start/////////////////////////////
    public void removeSetStatus(String SetStatusFilePathFSS, String senderPhoneNumberFSS){
      //  System.out.println("Check-5");
        //String deliveryBoyFilePath="Delivery.txt";senderNumberRemoveCourierSFO
        String tempFile ="tempStatus.txt";
        File oldFile = new File (SetStatusFilePathFSS);
        File newFile=new File(tempFile);
        String confirmYourPhoneNumberOfc="";
        String status="";

      //  System.out.println("Check-4");
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(SetStatusFilePathFSS));
         //   System.out.println("Check-3");
            x.useDelimiter("[,\n]");
         //   System.out.println("Check-2");

            int count=0;
            while (x.hasNext()){

           //     System.out.println("Check-1");
                confirmYourPhoneNumberOfc=x.next();
                status=x.next();

          //      System.out.println("Check1");
                if(!confirmYourPhoneNumberOfc.equals(senderPhoneNumberFSS)){
                    pw.println(confirmYourPhoneNumberOfc+","+status);
          //          System.out.println("Check2");

                }
                count++;


            }
            if(count!=0){
          //      System.out.println("Check3");

               FileReader fr = new FileReader(oldFile);
               BufferedReader br = new BufferedReader(fr);
               br.close();
               fr.close();
                x.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File(SetStatusFilePathFSS);
                newFile.renameTo(dump);
          //      System.out.println("Check4");

            }




        }catch (Exception ex){
         //   System.out.println("Check5");


        }



    }

    //////////////////////////remove set startus end///////////////////

    /////////////remove surprise courier start///////////////////////
    public void removeSurpriseCourier(String sendSurpriseDeliveryFilePath, String senderNumberRemoveSupriseCourier){
     //   System.out.println("Check-5");
        //String deliveryBoyFilePath="Delivery.txt";senderNumberRemoveCourierSFO
        String tempFile ="tempSurpriseCourierSend.txt";
        File oldFile = new File (sendSurpriseDeliveryFilePath);
        File newFile=new File(tempFile);
        String supSenderNumber="";
        String supSenderAddress="";
        String supReceiverNumebr="";
        String supReceiverAddress="";
        String supWriteOccation="";
        String supConfirmDate="";
        String supConfirmTime="";
        String supCakeFlavour="";
        String supCakeSize="";
        String supFlower="";
        String supType="";


      //  System.out.println("Check-4");
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(sendSurpriseDeliveryFilePath));
        //    System.out.println("Check-3");
            x.useDelimiter("[,\n]");
         //   System.out.println("Check-2");

            //int count=0;
            while (x.hasNext()){

             //   System.out.println("Check-1");
                supSenderNumber=x.next();
                supSenderAddress=x.next();
                supReceiverNumebr=x.next();
                supReceiverAddress=x.next();
                supWriteOccation=x.next();
                supConfirmDate=x.next();
                supConfirmTime=x.next();
                supCakeFlavour=x.next();
                supCakeSize=x.next();
                supFlower=x.next();
                supType=x.next();

            //    System.out.println("Check1");
                if(!supSenderNumber.equals(senderNumberRemoveSupriseCourier)){
                    pw.println(supSenderNumber+","+supSenderAddress+","+supReceiverNumebr+","+supReceiverAddress+","+supWriteOccation+","+supConfirmDate+","+supConfirmTime+","+supCakeFlavour+","+supCakeSize+","+supFlower+","+supType);
              //      System.out.println("Check2");

                }
               // count++;


            }
            //if(count!=0){
             //   System.out.println("Check3");

                FileReader fr = new FileReader(oldFile);
                BufferedReader br = new BufferedReader(fr);
                br.close();
                fr.close();
                x.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File(sendSurpriseDeliveryFilePath);
                newFile.renameTo(dump);
             //   System.out.println("Check4");

           // }




        }catch (Exception ex){
          //  System.out.println("Check5");


        }



    }

    /////////////remove surprise courier end  ///////////////////////

    ////////////////////remove receive home delivery start////////////
    public void removeReceiveHomeDelivery(String ReceiveHomeDeliveryPath, String senderNumberRemoveRecHomeDelivery){
      //  System.out.println("Check-5");
        //String deliveryBoyFilePath="Delivery.txt";senderNumberRemoveCourierSFO
        String tempFile ="tempRemoveReceiverHomeDelivery.txt";
        File oldFile = new File (ReceiveHomeDeliveryPath);
        File newFile=new File(tempFile);
        String recHomeDelSenderNumber="";
        String recHomeDelReceiverNumber="";
        String recHomeDelReceiverAddress="";
        String recHomeDelType="";



     //   System.out.println("Check-4");
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(ReceiveHomeDeliveryPath));
       //     System.out.println("Check-3");
            x.useDelimiter("[,\n]");
      //      System.out.println("Check-2");

            //int count=0;
            while (x.hasNext()){

         //       System.out.println("Check-1");
                recHomeDelSenderNumber=x.next();
                recHomeDelReceiverNumber=x.next();
                recHomeDelReceiverAddress=x.next();
                recHomeDelType=x.next();


         //       System.out.println("Check1");
                if(!recHomeDelSenderNumber.equals(senderNumberRemoveRecHomeDelivery)){
                    pw.println(recHomeDelSenderNumber+","+recHomeDelReceiverNumber+","+recHomeDelReceiverAddress+","+recHomeDelType);
         //           System.out.println("Check2");

                }
                // count++;


            }
            //if(count!=0){
       //     System.out.println("Check3");

            FileReader fr = new FileReader(oldFile);
            BufferedReader br = new BufferedReader(fr);
            br.close();
            fr.close();
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(ReceiveHomeDeliveryPath);
            newFile.renameTo(dump);
       //     System.out.println("Check4");

            // }




        }catch (Exception ex){
       //     System.out.println("Check5");


        }



    }

    ////////////////////remove receive home delivery end////////////
    ////////////////////remove receive delivery from office start////////////

    public void removeReceiveDeliveryFromOffice(String ReceiveDelFromOfficePath, String senderNumberRemoveRecDelFromOffice){
    //    System.out.println("Check-5");
        //String deliveryBoyFilePath="Delivery.txt";senderNumberRemoveCourierSFO
        String tempFile ="tempRemoveReceiverDeliveryFromOffice.txt";
        File oldFile = new File (ReceiveDelFromOfficePath);
        File newFile=new File(tempFile);
        String recDelFromOfcSenderNumber="";
        String recDelFromOfcReceiverNumber="";
        String recDelFromOfcReceiverAddress="";
        String recDelFromOfcType="";



     //   System.out.println("Check-4");
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(ReceiveDelFromOfficePath));
       //     System.out.println("Check-3");
            x.useDelimiter("[,\n]");
       //     System.out.println("Check-2");

            //int count=0;
            while (x.hasNext()){

        //        System.out.println("Check-1");
                recDelFromOfcSenderNumber=x.next();
                recDelFromOfcReceiverNumber=x.next();
                recDelFromOfcReceiverAddress=x.next();
                recDelFromOfcType=x.next();


         //       System.out.println("Check1");
                if(!recDelFromOfcSenderNumber.equals(senderNumberRemoveRecDelFromOffice)){
                    pw.println(recDelFromOfcSenderNumber+","+recDelFromOfcReceiverNumber+","+recDelFromOfcReceiverAddress+","+recDelFromOfcType);
        //            System.out.println("Check2");

                }
                // count++;


            }
            //if(count!=0){
        //    System.out.println("Check3");

            FileReader fr = new FileReader(oldFile);
            BufferedReader br = new BufferedReader(fr);
            br.close();
            fr.close();
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(ReceiveDelFromOfficePath);
            newFile.renameTo(dump);
      //      System.out.println("Check4");

            // }




        }catch (Exception ex){
      //      System.out.println("Check5");


        }



    }


    ////////////////////remove receive delivery from office end////////////


}