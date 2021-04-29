package Classes;

import java.io.*;
import java.util.Scanner;

public class SetStatusTwo {
    private static Scanner x;
    Scanner sc = new Scanner(System.in);


    public void setStatusTwo(String SetStatusFilePath, String senderNumber, String satus) throws IOException {






       // String filepath="Customer.txt";

        File file= new File(SetStatusFilePath);

        try{
            Scanner inputBuffer=new Scanner(file);
            while (inputBuffer.hasNext()){
                String line=inputBuffer.nextLine();
                String[] valuescs =line.split(",");
                if(valuescs[0].equals(senderNumber)){

                    try {
                        System.out.println("Check-5");
                        //String deliveryBoyFilePath="Delivery.txt";
                        String tempSS = "tempFileSetStatus.txt";
                        File oldFile = new File(SetStatusFilePath);
                        File newFile = new File(tempSS);
                        String confirmYourPhoneNumber = "";
                        String checkStatus = "";

                        System.out.println("Check-4");
                        // try{
                        FileWriter fw = new FileWriter(tempSS, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        x = new Scanner(new File(SetStatusFilePath));
                        System.out.println("Check-3");
                        x.useDelimiter("[,\n]"); ///////////////////////exception
                        System.out.println("Check-2");

                        //  int count=0;
                        while (x.hasNext()) {

                            System.out.println("Check-1");
                            confirmYourPhoneNumber = x.next();
                            checkStatus = x.next();


                            System.out.println("Check1");
                            if (!confirmYourPhoneNumber.equals(senderNumber)) {
                                pw.println(confirmYourPhoneNumber + "," + checkStatus);
                                System.out.println("Check2");

                            }

                            System.out.println("Check3");

                            x.close();
                            pw.flush();
                            pw.close();
                            bw.close();
                            fw.close();


                            oldFile.delete();

                            File dump = new File(SetStatusFilePath);
                            pw.close();
                            bw.close();
                            fw.close();
                            newFile.renameTo(dump);

                            System.out.println("Check4");

                            System.out.println("Check5");


                            ///////////////////////////////////////////////////
                            File file2 = new File("SetStatusDelivery.txt");
                            file2.createNewFile();

                            FileWriter writer = new FileWriter(file2,true);
                            PrintWriter pw1=new PrintWriter(writer);


                            pw1.println(senderNumber+","+satus);

                            writer.flush();
                            writer.close();

                            //////////////////////////////////////////////////


                            // }
                        }
                    }catch (Exception ecc){

                    }




                }

                else{

                    File file2 = new File("SetStatusDelivery.txt");
                    file2.createNewFile();

                    FileWriter writer = new FileWriter(file2,true);
                    PrintWriter pw1=new PrintWriter(writer);


                    pw1.println(senderNumber+","+satus);

                    writer.flush();
                    writer.close();
                    //////////////////////////////
                }
            }


        }catch (FileNotFoundException fe){
            fe.printStackTrace();
        }


    }
}