package Classes;

import java.io.*;
import java.util.Scanner;

public class SetStatus {
    private static Scanner x;
    Scanner sc = new Scanner(System.in);



    /////////////////////////////setStatusDelivery Start////////////////
    public void setStatusForDelivery(String senderNumber,String satus) throws IOException {





  File file = new File("SetStatusDelivery.txt");
        file.createNewFile();
        //String fileContent;
       // try (Scanner scan = new Scanner(file)) {

            // fileContent = (del1[i].getDeliveryBoyId() + "," + del1[i].getDeliveryBoyName() + "," + del1[i].getDeliveryBoyAge()+ "," + del1[i].getDeliveryBoyGender()+ "," + del1[i].getDeliveryBoyAddress()+ "," + del1[i].getDeliveryBoyContactNumber()+ "," + del1[i].getDeliveryBoyEmailAddress()+","+del1[i].getDeliveryBoyPassword());

            // while (scan.hasNext()) {
            //    fileContent = (scan.nextLine().concat(fileContent));
            // }
       // }
        FileWriter writer = new FileWriter(file,true);
        PrintWriter pw1=new PrintWriter(writer);
        //  writer.write(fileContent);

        pw1.println(senderNumber+","+satus);
        // writer.write(System.lineSeparator());//System.getProperty("line.separator")
        writer.flush();

        writer.close();
        pw1.close();


    }
    /////////////////////////setStatusDelivery end///////////////////
    ////////////////////////see status start////////////////////////////


    public void openFileSetStatus() throws IOException {

///////////////////////////////////////////////////
        File productData = new File("SetStatusDelivery.txt");
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int i = 0;
        while((line = br.readLine())!=null){
            String[] valuessfo = line.split(",");
            try {

                System.out.println("\n\t\t\t\t\t\t\t\t\tSender Phone number: "+valuessfo[0]+" Delivery Status: "+valuessfo[1]);
                i++;
            }catch (ArrayIndexOutOfBoundsException ar){}

        }

        br.close();
        fr.close();


    }


    ////////////////////////see status end////////////////////////////

}