package Classes;

import java.io.*;
import java.util.Scanner;

public class SurpriseSpecialOccation {
    public void surpriseDelivery(String supSenderNumber, String supSenderAddress, String supReceiverNumebr, String supReceiverAddress, String supWriteOccation, String supConfirmDate, String supConfirmTime, String supCakeFlavour, String supCakeSize, String supFlower) throws IOException {

        File file = new File("surpriseDelivery.txt");
        file.createNewFile();
        String fileContent;
        try (Scanner scan = new Scanner(file)) {

        }
        FileWriter writer = new FileWriter(file,true);
        PrintWriter pw=new PrintWriter(writer);
        pw.println(supSenderNumber+","+supSenderAddress+","+supReceiverNumebr+","+supReceiverAddress+","+supWriteOccation+","+supConfirmDate+","+supConfirmTime+","+supCakeFlavour+","+supCakeSize+","+supFlower+","+"Type : Surprise Delivery");
        writer.flush();
        writer.close();
    }

    /////////////////////////see all surprise courier start /////////////////
    public void openFileSurpriseDelivery() throws IOException {

///////////////////////////////////////////////////
        File productData = new File("surpriseDelivery.txt");
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int i = 0;
        while((line = br.readLine())!=null){
            String[] valuessfo = line.split(",");
            try {
                System.out.println("\n\t\t\t\t\t\t\t\t\t===========================================\n\t\t\t\t\t\t\t\t\tDelivery information: "+(i+1)+"\n"+"\t\t\t\t\t\t\t\t\tSender Phone number: "+valuessfo[0]+"\n\t\t\t\t\t\t\t\t\t Sender Address: "+valuessfo[1]+"\n\t\t\t\t\t\t\t\t\tReceiver Number: "+valuessfo[2]+" \n\t\t\t\t\t\t\t\t\tReceiver Address: "+valuessfo[3]+" \n\t\t\t\t\t\t\t\t\tOccation details : "+valuessfo[4]+" \n\t\t\t\t\t\t\t\t\tConfirm Date: "+valuessfo[5]+"\n\t\t\t\t\t\t\t\t\t Confirm Time: "+valuessfo[6]+" \n\t\t\t\t\t\t\t\t\tCake Flavour: "+valuessfo[7]+" \n\t\t\t\t\t\t\t\t\tCake Size: "+valuessfo[8]+"\n\t\t\t\t\t\t\t\t\tFlower: "+valuessfo[9]+" \n\t\t\t\t\t\t\t\t\tType of courier: "+valuessfo[10]);
                i++;
            }catch (ArrayIndexOutOfBoundsException ar){}

        }

        br.close();
        fr.close();


    }

    /////////////////////////see all surprise courier end /////////////////
}
