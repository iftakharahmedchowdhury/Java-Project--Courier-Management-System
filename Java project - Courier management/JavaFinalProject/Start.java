
import Classes.*;


import java.io.*;
import java.util.*;


public class Start
{
	private static Scanner x; // this x for delete delivery voy from txt
	/////////////////customer login from txt
	public static boolean customerLoginCheck() throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean foundcs=false;

		System.out.print("\t\t\t\t\t\t\t\t\tCustomer contact number : ");
		String customerContactNumber = sc.next();

		System.out.print("\t\t\t\t\t\t\t\t\tCustomer Password : ");
		String customerPassword = sc.next();
		String filepath="Customer.txt";


		File file= new File(filepath);
		file.createNewFile();
		try{
			Scanner inputBuffer=new Scanner(file);
			while (inputBuffer.hasNext()){
				String line=inputBuffer.nextLine();
				String[] valuescs =line.split(",");
				if(valuescs[0].equals(customerContactNumber)){
					if(valuescs[6].equals(customerPassword)){
						foundcs=true;
					}
				}
			}
			inputBuffer.close();


		}catch (FileNotFoundException fe){
			fe.printStackTrace();
		}
		return foundcs;

	}

	//////////////////customer login from txt end


///////////// deliveryboy log in boolean method read from txt file
	public static boolean deliveryLogin() throws IOException { /////////delivery log in strat
           Scanner sc = new Scanner(System.in);
		boolean found=false;

		System.out.print("\t\t\t\t\t\t\t\t\tDelivery boy Id : ");
		String deliveryBoyId = sc.next();

		System.out.print("\t\t\t\t\t\t\t\t\tDelivery boy Password : ");
		String deliveryBoyPassword = sc.next();
		String filepath="Delivery.txt";

		File file= new File(filepath);
		file.createNewFile();
		try{
			Scanner inputBuffer=new Scanner(file);
			while (inputBuffer.hasNext()){
				String line=inputBuffer.nextLine();
				String[] values =line.split(",");
				if(values[0].equals(deliveryBoyId)){
					if(values[7].equals(deliveryBoyPassword)){
						found=true;
					}
				}

			}
			inputBuffer.close();


		}catch (FileNotFoundException fe){
			fe.printStackTrace();
		}
		return found;

	}///////////////////delivery login end



	public static void main(String args[]) throws Exception
	// main start
	{
		File f1=new File("Customer.txt");
		f1.createNewFile();
		File f2=new File("CustomerComplain.txt");
		f2.createNewFile();
		File f3=new File("Delivery.txt");
		f3.createNewFile();
		File f4=new File("ReceiveDeliveryFromOffice.txt");
		f4.createNewFile();
		File f5=new File("ReceiverHomeDelivery.txt");
		f5.createNewFile();
		File f6=new File("SendDeliveryFromHome.txt");
		f6.createNewFile();
		File f7=new File("SendDeliveryFromOffice.txt");
		f7.createNewFile();
		File f8=new File("SetStatusDelivery.txt");
		f8.createNewFile();
		File f9=new File("surpriseDelivery.txt");
		f9.createNewFile();

		cls();
		CourierService courierService=new CourierService();

		boolean repeat = true;
		boolean login =true;
		boolean loginAdmin =true;
		boolean customerLogin =true;
		boolean customerLogin1 =true;
		boolean customerLogin2 =true;
		boolean customerLogin3=true;
		boolean customerLogin4=true;
		boolean deliveryBoyLogIn=true;
		boolean deliveryBoyLogIn1=true;
		boolean deliveryBoyLogIn2=true;
		boolean deliveryBoyLogIn3=true;
		Scanner sc = new Scanner(System.in);



		while(login)
		{//while start


				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");



					System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
					System.out.println("\t\t\t\t\t\t\t\t\t| Welcome to our Easy Rabbit service   |");
					System.out.println("\t\t\t\t\t\t\t\t\t|                                      |");
					System.out.println("\t\t\t\t\t\t\t\t\t| Please Login first                   |");
					System.out.println("\t\t\t\t\t\t\t\t\t|                                      |");
					System.out.println("\t\t\t\t\t\t\t\t\t|     1. Customers login               |");
					System.out.println("\t\t\t\t\t\t\t\t\t|     2. Delivery boy login            |");
					System.out.println("\t\t\t\t\t\t\t\t\t|     3. Admin login                   |");
					System.out.println("\t\t\t\t\t\t\t\t\t|                                      |");
					System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");

					System.out.println("\t\t\t\t\t\t\t\t\t|==================================|");
					System.out.println("\t\t\t\t\t\t\t\t\t|                                  |");
					System.out.println("\t\t\t\t\t\t\t\t\t|                                  |");
					System.out.println("\t\t\t\t\t\t\t\t\t|    JAVA PROJECT:COURIER SERVICE  |");
					System.out.println("\t\t\t\t\t\t\t\t\t|        SPRING 2020-2021          |");
					System.out.println("\t\t\t\t\t\t\t\t\t|            SECTION : J           |");
					System.out.println("\t\t\t\t\t\t\t\t\t|                                  |");
					System.out.println("\t\t\t\t\t\t\t\t\t|==================================|");


					login = true;
					repeat = true;
					customerLogin = true;
					customerLogin1 = true;
					customerLogin2 = true;
					customerLogin3 = true;
					deliveryBoyLogIn = true;
					deliveryBoyLogIn1 = true;
					deliveryBoyLogIn2 = true;
					deliveryBoyLogIn3 = true;
					System.out.println("");

					int select = 0;
					try {
						System.out.print("\t\t\t\t\t\t\t\t\t Please enter user type : ");
						repeat = true;
						select = sc.nextInt();
					}catch (InputMismatchException ec){
						main(null);
					}


			 cls();

			switch(select) {


				case 1:

					while (repeat) {
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("\t\t\t\t\t\t\t\t\t|-------------------------------|");
						System.out.println("\t\t\t\t\t\t\t\t\t|      1. LogIn                 |");
						System.out.println("\t\t\t\t\t\t\t\t\t|          or                   |");
						System.out.println("\t\t\t\t\t\t\t\t\t|      2. Sign Up               |");
						System.out.println("\t\t\t\t\t\t\t\t\t|      3. <-Back to log in page |");
						System.out.println("\t\t\t\t\t\t\t\t\t| ------------------------------|");
						customerLogin2 = true;
						customerLogin3 = true;
						System.out.print("\t\t\t\t\t\t\t\t\tEnter your option: ");
						int option1=0;
						try {
							 option1 = sc.nextInt();
							System.out.println("");
						}catch (InputMismatchException ec){

							main(null);
						}
						cls();


						switch (option1) {// customer part
							case 1:

								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");



								while (customerLogin2) {
									while (customerLogin3) {

										boolean isCustomerLogIn = customerLoginCheck();
										if (isCustomerLogIn) {
											cls();

											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");

											System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
											System.out.println("\t\t\t\t\t\t\t\t\t|    Customer Login successful         |");
											System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
											System.out.println("");
											customerLogin1 = true;
											while (customerLogin1) {
												System.out.println("\t\t\t\t\t\t\t\t\t|-------------------------------|");
												System.out.println("\t\t\t\t\t\t\t\t\t|      1. Send Courier          |");
												System.out.println("\t\t\t\t\t\t\t\t\t|          or                   |");
												System.out.println("\t\t\t\t\t\t\t\t\t|      2. Receive courier       |");
												System.out.println("\t\t\t\t\t\t\t\t\t|      3. Contact & Complain       |");
												System.out.println("\t\t\t\t\t\t\t\t\t|      4. <-Back to log in page |");
												System.out.println("\t\t\t\t\t\t\t\t\t| ------------------------------|");
												System.out.print("\t\t\t\t\t\t\t\t\tEnter your option: ");
												int customerLoginoption=0;
												try {
													customerLoginoption = sc.nextInt();
												}catch (InputMismatchException ec){
													main(null);

												}
												System.out.println("");
												cls();
												switch (customerLoginoption) {
													case 1:////send option
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------------------------|");
														System.out.println("\t\t\t\t\t\t\t\t\t|    1. Send delivery from home                          |");
														System.out.println("\t\t\t\t\t\t\t\t\t|    2. Send delivery  from office                       | ");
														System.out.println("\t\t\t\t\t\t\t\t\t|    3. Special feature : Occasionally courier send      | ");
														System.out.println("\t\t\t\t\t\t\t\t\t|    4. <- GO back     | ");
														System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------------------------|");

														System.out.println("");
														System.out.print("\t\t\t\t\t\t\t\t\tEnter your option : ");
														int sendDeliveryOption=0;
														try {

															sendDeliveryOption = sc.nextInt();
														}catch (InputMismatchException eh){
															main(null);
														}
														cls();
														switch (sendDeliveryOption) {

															case 1://sendDeliveryOption send from home
																//=> confirm identity by phone number
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
																System.out.println("\t\t\t\t\t\t\t\t\tYour Option is:Send delivery from home ");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");

																System.out.println("\t\t\t\t\t\t\t\t\tExtra charge will be added");
																System.out.print("\t\t\t\t\t\t\t\t\tconfirm identity by phone number");
																sc.nextLine();
																String confirmYourPhoneNumber = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\tSender name : ");
																String senderName = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\treceiver name : ");
																String receiverName = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\treceiver contact number : ");
																String receiverContactNumber = sc.nextLine();

																System.out.print("\t\t\t\t\t\t\t\t\tpickup address : ");
																String pickUpAddress = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\tReceiver address : ");
																String receiverAddress = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\tCourier details : ");
																String courierDetails = sc.nextLine();
																CourierService cfhsend = new CourierService();
																cfhsend.courierSendFromHome(confirmYourPhoneNumber, senderName, receiverName, receiverContactNumber, pickUpAddress, receiverAddress, courierDetails);

																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\tWe receive your request Please pay by Bkash or Nagad.");
																System.out.println("\t\t\t\t\t\t\t\t\tMake sure give your number in reference section.");
																System.out.println("\t\t\t\t\t\t\t\t\tAfter receiving your payment our delivery boy call");
																System.out.println("\t\t\t\t\t\t\t\t\tyou and receive your delivery from home");

																break;


															case 2://sendDeliveryOption send from office

																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
																System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Send delivery from office  ");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");

																System.out.print("\t\t\t\t\t\t\t\t\tconfirm identity by phone number : ");
																sc.nextLine();
																String confirmYourPhoneNumberOfc = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\tSender name : ");
																String senderNameofc = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\treceiver name : ");
																String receiverNameofc = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\treceiver contact number : ");
																String receiverContactNumberofc = sc.nextLine();

																System.out.print("\t\t\t\t\t\t\t\t\tpickup address Write office brunch : ");
																String pickUpAddressofc = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\tReceiver address : ");
																String receiverAddressofc = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\tCourier details : ");
																String courierDetailsofc = sc.nextLine();
																CourierService cfosend = new CourierService();
																cfosend.courierSendFromOffice(confirmYourPhoneNumberOfc, senderNameofc, receiverNameofc, receiverContactNumberofc, pickUpAddressofc, receiverAddressofc, courierDetailsofc);

                                                                  cls();
																//=>payment method
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\tWe receive your request.Please come with your ");
																System.out.println("\t\t\t\t\t\t\t\t\tcourier to our brunch pay and confirm your courier ");
																break;
															case 3:
																String supSenderNumber;
																String supSenderAddress;
																String supReceiverNumebr;
																String supReceiverAddress;
																String supWriteOccation;
																String supConfirmDate;
																String supConfirmTime;

																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
																System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Special feature  ");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");



																System.out.println("\t\t\t\t\t\t\t\t\t| Welcome to our special feature  ");
																System.out.println("\t\t\t\t\t\t\t\t\t|      Occasionally courier send     ");
																System.out.println("\t\t\t\t\t\t\t\t\t|       you can surprise anyone  ");
																System.out.println("\t\t\t\t\t\t\t\t\t| by sending gift special occasion you  ");
																System.out.println("\t\t\t\t\t\t\t\t\t| Note: please make sure you confirm order  ");
																System.out.println("\t\t\t\t\t\t\t\t\t| minimum two days before of the occasion ");
																System.out.println("\t\t\t\t\t\t\t\t\t|  ");
																System.out.print("\t\t\t\t\t\t\t\t\t| Please enter your Number: ");
																sc.nextLine();
																supSenderNumber=sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t| Enter your address: ");
																supSenderAddress=sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t| Enter receiver phone number: ");
																supReceiverNumebr=sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t| Enter receiver Address: ");
																supReceiverAddress=sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t| Write about occasion : ");
																supWriteOccation=sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t| Please confirm your date of Occasion(dd/mm/yyyy: ");
																supConfirmDate=sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t| Please confirm your time of Occasion(Hour:Min [am/pm] : ");
																supConfirmTime=sc.nextLine();



																	String supCakeFlavour;
																	String supCakeSize;
																	String supFlower;


																	System.out.println("\t\t\t\t\t\t\t\t\t Cake Flavours available: ");
																	System.out.println("\t\t\t\t\t\t\t\t\t A Chocolate ");
																	System.out.println("\t\t\t\t\t\t\t\t\t B Vanilla ");
																	System.out.println("\t\t\t\t\t\t\t\t\t C Blackberry ");
																	System.out.println("\t\t\t\t\t\t\t\t\t D Red Velvet ");
																	System.out.println("\t\t\t\t\t\t\t\t\t If don't need cake write ''no need'' ");
																	System.out.print("\t\t\t\t\t\t\t\t\t enter your cake name : ");
																	supCakeFlavour =sc.nextLine();


																	System.out.println("\t\t\t\t\t\t\t\t\t Cake size available: ");
																	System.out.println("\t\t\t\t\t\t\t\t\t If cake not selected write ''no need'' ");
																	System.out.println("\t\t\t\t\t\t\t\t\t A  One pound.(800tk) ");
																	System.out.println("\t\t\t\t\t\t\t\t\t B Two pounds.(1500tk)  ");
																	System.out.println("\t\t\t\t\t\t\t\t\t C Three pounds.(2200tk)  ");
																    System.out.print("\t\t\t\t\t\t\t\t\t enter your cake size : ");
																    supCakeSize = sc.nextLine();

																	System.out.println("\t\t\t\t\t\t\t\t\t   Flower bouquet available: ");
																	System.out.println("\t\t\t\t\t\t\t\t\t   If you don't need write no need ");
																	System.out.println("\t\t\t\t\t\t\t\t\t A. Red Rose.(150tk)  ");
																	System.out.println("\t\t\t\t\t\t\t\t\t B. White Rose.(200tk)  ");
																	System.out.println("\t\t\t\t\t\t\t\t\t C. Lily.(220tk)  ");
																	System.out.println("\t\t\t\t\t\t\t\t\t D. Mix Flowers.(250tk)  ");
																	System.out.print("\t\t\t\t\t\t\t\t\t Enter your flower name :");
																    supFlower=sc.nextLine();

																    SurpriseSpecialOccation sup=new SurpriseSpecialOccation();
																    sup.surpriseDelivery(supSenderNumber,supSenderAddress,supReceiverNumebr,supReceiverAddress,supWriteOccation,supConfirmDate,supConfirmTime,supCakeFlavour,supCakeSize,supFlower);
																cls();
																    System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\tWe receive your request of Occasional courier.Please come");
																System.out.println("\t\t\t\t\t\t\t\t\twith your courier to our brunch pay and confirm your Occasional courier. ");
																System.out.println("\t\t\t\t\t\t\t\t\t---------------------------------------------------------------------------------");
																System.out.println("\t\t\t\t\t\t\t\t\tNote: please make sure you confirm courier at least two days before of the event ");
																System.out.println("\t\t\t\t\t\t\t\t\t----------------------------------------------------------------------------------");



																//}

																break;

														}

														break;


													case 2://////////////////receiver
														System.out.println("\t\t\t\t\t\t\t\t\t");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Receive product ");
														System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.print("\t\t\t\t\t\t\t\t\t|Please enter sender number to track product : ");
														sc.nextLine();
														String senderPhoneNumberToTrack = sc.nextLine();
														String filepath="SetStatusDelivery.txt";

														FileReader fr = new FileReader(filepath);
														BufferedReader br = new BufferedReader(fr);
														String line = "";
														int i = 0;
														File file= new File(filepath);
														try{
															Scanner inputBuffer=new Scanner(file);
															while((line = br.readLine())!=null){
																String line1=inputBuffer.nextLine();
																String[] valueTrack =line1.split(",");
																try{
																if(valueTrack[0].equals(senderPhoneNumberToTrack)){

																	System.out.println("\t\t\t\t\t\t\t\t\tSender Phone Number: "+valueTrack[0]+"   Your product status : "+valueTrack[1]);

																}
																}catch (ArrayIndexOutOfBoundsException ar){}
															}


														}catch (FileNotFoundException fe){
															fe.printStackTrace();
														}
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");

														System.out.println("\t\t\t\t\t\t\t\t\t|---------------------------------------|");
														System.out.println("\t\t\t\t\t\t\t\t\t|    Option available for delivery      |");
														System.out.println("\t\t\t\t\t\t\t\t\t|    1. Send home delivery              |");
														System.out.println("\t\t\t\t\t\t\t\t\t|    2. receive from office             | ");
														System.out.println("\t\t\t\t\t\t\t\t\t|    3. <- Go back                      | ");
														System.out.println("\t\t\t\t\t\t\t\t\t|---------------------------------------|");
														System.out.print("\t\t\t\t\t\t\t\t\t      Please Enter your option : ");
														int deliveryOption=0;
														try {
															deliveryOption = sc.nextInt();
														}catch (InputMismatchException eh){
															main(null);
														}
														cls();
														switch (deliveryOption){
															case 1://///////////////////////////////////////

																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
																System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Send home delivery ");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
																//System.out.print("\t\t\t\t\t\t\t\t\t      Please input sender phone number : ");
																//String recSenderNumber = sc.nextLine();
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t Extra charge will be added");
																System.out.print("\t\t\t\t\t\t\t\t\t      please input your phone number   : ");
																sc.nextLine();
																String recReceiverPhoneNumber = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t      Please enter your address        : ");
																String recReceiverAddress = sc.nextLine();

																CourierService c20 = new CourierService();
																c20.recHomeDelivery(senderPhoneNumberToTrack,recReceiverPhoneNumber,recReceiverAddress);
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t===================================================================");
																System.out.println("\t\t\t\t\t\t\t\t\t Your request accepted. Our delivery Boy Will contact with you");
																System.out.println("\t\t\t\t\t\t\t\t\t===================================================================");

																break;


															case 2://///////////////////////////////////
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
																System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: receive from office ");
																System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
																//System.out.print("\t\t\t\t\t\t\t\t\t      Please input sender phone number : ");
																//String recSenderNumber = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t      please input your phone number   : ");
																sc.nextLine();
																String recReceiverPhoneNumber2 = sc.nextLine();
																System.out.print("\t\t\t\t\t\t\t\t\t      Please enter your address        : ");
																String recReceiverAddress2 = sc.nextLine();

																CourierService c21 = new CourierService();
																c21.receiveDeliveryFromOffice(senderPhoneNumberToTrack,recReceiverPhoneNumber2,recReceiverAddress2);

																break;

															case 3:
																break;


															default:
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");
																System.out.println("\t\t\t\t\t\t\t\t\t|       Invalid Option              |");
																System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");

																System.out.println();
																break;


														}



														break;


													case 3:
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Contact & Complain ");
														System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
														System.out.println("");
														System.out.println("");
														System.out.println("");



														System.out.println("\t\t\t\t\t\t\t\t\tContact details of easy rabbit ");
														System.out.println("\t\t\t\t\t\t\t\t\tHotline Number : 09612363693 ");
														System.out.println("\t\t\t\t\t\t\t\t\tEmail :easyrabbit@mail.com ");


														System.out.println("\t\t\t\t\t\t\t\t\tWrite your complain bellow ");


														System.out.print("\t\t\t\t\t\t\t\t\tPlease enter your number : ");
														sc.nextLine();
														String comYourNumber=sc.nextLine();
														System.out.print("\t\t\t\t\t\t\t\t\tPlease enter your name : ");
														//sc.nextLine();
														String comYourName=sc.nextLine();
														System.out.print("\t\t\t\t\t\t\t\t\tWrite about complain   : ");
														String comYourComplain=sc.nextLine();
														System.out.print("\t\t\t\t\t\t\t\t\tWrite your email       : ");
														String comYourEmail=sc.nextLine();

														ManageCourier com = new ManageCourier();
														com.setCustomerComplain(comYourNumber,comYourName,comYourComplain,comYourEmail);

														break;
													case 4:
														customerLogin1 = false;
														customerLogin2 = false;
														customerLogin3 = false;
														repeat =false;


														//////////////////////////
														break;
													default:
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");
														System.out.println("\t\t\t\t\t\t\t\t\t|       Invalid Option              |");
														System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");

														System.out.println();
														break;
												}


											}///


											/////////////delivery part and methods and switch case need to enter////////
										} else {
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");

											System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
											System.out.println("\t\t\t\t\t\t\t\t\t|Please enter correct Id and password  |");
											System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
											customerLogin3=false;
											customerLogin2=false;

										}
										break;

									}

								}///////////////////////////////////
								break;


							//}





							case 2:
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
								System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Sing up customer ");
								System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("\t\t\t\t\t\t\t\t\t Please enter your information correctly : ");
								System.out.print("\t\t\t\t\t\t\t\t\tCustomer Name: ");
								sc.nextLine();/////////////////
								String customerName = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tCustomer Age : ");
								String customerAge = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tCustomer Gender : ");
								String customerGender = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tCustomer Address : ");
								String customerAddress = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tCustomer Contact Number : ");
								String customerContactNumber = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tCustomer Email Address : ");
								String customerEmailAddress = sc.nextLine();
								System.out.print("\t\t\t\t\t\t\t\t\tSet password : ");
								String customerPassword = sc.nextLine();
								Customers c2 = new Customers();  // c2 Customer object
								c2.setCustomerName(customerName);
								c2.setCustomerAge(customerAge);
								c2.setCustomerGender(customerGender);
								c2.setCustomerAddress(customerAddress);
								c2.setCustomerContactNumber(customerContactNumber);
								c2.setCustomerEmailAdress(customerEmailAddress);
								c2.setCustomerPassword(customerPassword);
								if (courierService.setCustomer(c2))

									cls();
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");

								System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
								System.out.println("\t\t\t\t\t\t\t\t\t      Successfully your account created   ");
								System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
								System.out.println("");

								break;

							case 3:

								repeat = false;
								break;
							default:
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");
								System.out.println("\t\t\t\t\t\t\t\t\t|       Invalid Option              |");
								System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");

								System.out.println();
								break;
						}
						//break;


					}
					break;

				case 2:// DeliveryBoyInterface boy part

					while (repeat) {
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");

						//DeliveryBoy d7 =courierService.verifyDeliveryBoyLogin(deliveryBoyId,deliveryBoyPassword,filepath);
						while (deliveryBoyLogIn){
                         deliveryBoyLogIn2=true;

							boolean isDeliveryBoyLogin = deliveryLogin();
							while (deliveryBoyLogIn2) {
							if (isDeliveryBoyLogin) {

								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");

								System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
								System.out.println("\t\t\t\t\t\t\t\t\t|Delivery boy Login successful         |");
								System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
								System.out.println("");
								while (deliveryBoyLogIn1) {
									System.out.println("\t\t\t\t\t\t\t\t\t|-------------------------------------------------------|");
									System.out.println("\t\t\t\t\t\t\t\t\t|    1. See delivery information send from home         |");
									System.out.println("\t\t\t\t\t\t\t\t\t|    2. See Delivery Information send from office       | ");
									System.out.println("\t\t\t\t\t\t\t\t\t|    3. Set Status for home delivery                    | ");
									//System.out.println("\t\t\t\t\t\t\t\t\t|    4. Update Previous inputted status                 | ");
									System.out.println("\t\t\t\t\t\t\t\t\t|    4. see all status                                  | ");
									System.out.println("\t\t\t\t\t\t\t\t\t|    5. Logout                                          | ");
									System.out.println("\t\t\t\t\t\t\t\t\t|-------------------------------------------------------|");

									System.out.println("");
									System.out.print("\t\t\t\t\t\t\t\t\tEnter your option : ");
									int deliveryBoyOption=0;
                                     try {
										 deliveryBoyOption = sc.nextInt();
									 }catch (InputMismatchException eh){
                                     	main(null);
									 }
									cls();
									switch (deliveryBoyOption) {
										case 1:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t---------------------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: See delivery information send from home ");
											System.out.println("\t\t\t\t\t\t\t\t\t----------------------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											CourierService c14 = new CourierService();
											c14.openFileSendFromHome();
											break;
										case 2:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t---------------------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: See Delivery Information send from office ");
											System.out.println("\t\t\t\t\t\t\t\t\t----------------------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											CourierService c15=new CourierService();
											c15.openFileSendFromOffice();
											break;
										case 3:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t---------------------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Set status for Delivery ");
											System.out.println("\t\t\t\t\t\t\t\t\t----------------------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											File file = new File("SetStatusDelivery.txt");
											file.createNewFile();
											file.createNewFile();
											FileReader fr1 = new FileReader(file);
											BufferedReader br1 = new BufferedReader(fr1);
											String line = "";
											int i = 0;

											if ((line = br1.readLine()) != null) {
												br1.close();
												fr1.close();


												System.out.print("\t\t\t\t\t\t\t\t\tEnter Sender phone number");
												sc.nextLine();

												String DeliverySenderPhonenumber = sc.nextLine();

												String SetStatusFilePath = "SetStatusDelivery.txt";
												RemoveElement r7 = new RemoveElement();
												r7.removeSetStatus(SetStatusFilePath, DeliverySenderPhonenumber);


												System.out.print("\t\t\t\t\t\t\t\t\tSet Status : ");
												String setStatus = sc.nextLine();


												SetStatus s1 = new SetStatus();
												//s1.editSetStatus(DeliverySenderPhonenumber,SetStatusFilePath);
												s1.setStatusForDelivery(DeliverySenderPhonenumber, setStatus);

												br1.close();
												fr1.close();
											} else {
												br1.close();
												fr1.close();


												System.out.print("\t\t\t\t\t\t\t\t\tEnter Sender phone number : ");
												sc.nextLine();
												String DeliverySenderPhonenumber = sc.nextLine();
												System.out.print(" Set Status : ");
												String setStatus = sc.nextLine();
												String SetStatusFilePath = "SetStatusDelivery.txt";


												SetStatus s1 = new SetStatus();
												//s1.editSetStatus(DeliverySenderPhonenumber,SetStatusFilePath);
												s1.setStatusForDelivery(DeliverySenderPhonenumber, setStatus);

											}


											break;

										//case 4:

											/*FileReader fr = new FileReader("SetStatusDelivery.txt");
											BufferedReader br = new BufferedReader(fr);
											String line1 = "";
											int i1 = 0;

											if ((line1 = br.readLine()) != null) {
												br.close();

												System.out.print("\t\t\t\t\t\t\t\t\tEnter Sender phone number");
												sc.nextLine();
												String senderPhoneNumberFSS = sc.nextLine();

												String SetStatusFilePathFSS = "SetStatusDelivery.txt";
												RemoveElement r5 = new RemoveElement();
												r5.removeSetStatus(SetStatusFilePathFSS, senderPhoneNumberFSS);

												System.out.print("\t\t\t\t\t\t\t\t\tEnter Sender phone number");
												String DeliverySenderPhonenumber1 = sc.nextLine();
												System.out.print("\t\t\t\t\t\t\t\t\tSet Status");
												String setStatus2 = sc.nextLine();
												//String SetStatusFilePath1="SetStatusDelivery.txt";


												SetStatus s2 = new SetStatus();
												s2.setStatusForDelivery(DeliverySenderPhonenumber1, setStatus2);

											} else {
												System.out.println();
											}
											break;*/

										case 4:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: see all status ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											SetStatus s4=new SetStatus();
											s4.openFileSetStatus();
											break;
										case 5:
											deliveryBoyLogIn1=false;
											deliveryBoyLogIn=false;
											deliveryBoyLogIn2=false;
											repeat = false;


											break;

										default:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");
											System.out.println("\t\t\t\t\t\t\t\t\t|       Invalid Option              |");
											System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");

											System.out.println();
											break;


									}
								}


								/////////////delivery part and methods and switch case need to enter////////
							} else {
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");

								System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
								System.out.println("\t\t\t\t\t\t\t\t\t|Please enter correct Id and password  |");
								System.out.println("\t\t\t\t\t\t\t\t\t|--------------------------------------|");
								deliveryBoyLogIn=false;
								deliveryBoyLogIn2=false;

								repeat =false;

							}
							break;


						}



					}

			}////////////////////////////////////
					break;


				case 3://Admin part
					while(loginAdmin) {
						Admin adminObject = new Admin();
						adminObject.setAdminUserName("admin");
						adminObject.setAdminPassword("1234");

						if (courierService.insertAdmin(adminObject)) {
							//System.out.println("");
						}

						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						//System.out.println("\t\t\t\t\t\t\t\t\t|=======================================");
						System.out.print("\t\t\t\t\t\t\t\t\t      Admin user name: ");
						String adminUserName = sc.next();
						System.out.print("\t\t\t\t\t\t\t\t\t      Admin Password : ");
						String adminPassword = sc.next();
						//System.out.println("\t\t\t\t\t\t\t\t\t|=======================================");
                        ////////////////////////////////

						Admin a1 =courierService.searchAdminForLogin(adminUserName,adminPassword);
								if(a1!=null) {
											System.out.println("");

											cls();
						            //Start

									//if(courierService.customerLogin(customerContactNumber1,customerPasswordForLogIn)){
								//	System.out.println("\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t|-----------------------------|");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								    System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------|");
									System.out.println("\t\t\t\t\t\t\t\t\t| Admin successfully login    |");
									System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------|");


						////////////////////////////////////////

						//adminObject.showInfo();//////////////////////////////////////////////////////////////////////////////////

						//adminObject.checkAdmin(adminUserName, adminUserName);
						repeat = true;
						//if (){
						while (repeat) {
							System.out.print("\n ");
							System.out.println("\t\t\t\t\t\t\t\t\t=====================================");
							System.out.println("\t\t\t\t\t\t\t\t\t1.Total Courier ");
							System.out.println("\t\t\t\t\t\t\t\t\t2. Manage Courier ");
							System.out.println("\t\t\t\t\t\t\t\t\t3. See all courier send from home");
							System.out.println("\t\t\t\t\t\t\t\t\t4. See all courier send from office");
							System.out.println("\t\t\t\t\t\t\t\t\t5. See all surprise courier");
							System.out.println("\t\t\t\t\t\t\t\t\t6. See all set status");
							System.out.println("\t\t\t\t\t\t\t\t\t7. See all courier Receive home delivery ");
							System.out.println("\t\t\t\t\t\t\t\t\t8. See all courier  receive from office");
							System.out.println("\t\t\t\t\t\t\t\t\t9. Manage delivery boy ");
							System.out.println("\t\t\t\t\t\t\t\t\t10. Manage customers");
							System.out.println("\t\t\t\t\t\t\t\t\t11. Manage complain ");
							System.out.println("\t\t\t\t\t\t\t\t\t12. LogOut ");
							System.out.println("\t\t\t\t\t\t\t\t\t=====================================");


							System.out.print("\t\t\t\t\t\t\t\t\tPlease Enter your option : ");
							int optionAdmin=0;
							try {
								optionAdmin = sc.nextInt();
							}catch (InputMismatchException eh){
								System.out.println("Something wend wrong");
								main(null);

							}

							cls();///////// clear consol


							switch (optionAdmin) { // admin after log in start
								case 1:
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Total courier ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");

									ManageCourier seeCourierCount = new ManageCourier();
									seeCourierCount.setCourierCount();
									break;
								case 2:
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Manage Courier ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t 1 Remove courier send from Home");
									System.out.println("\t\t\t\t\t\t\t\t\t 2 Remove courier send from office");
									System.out.println("\t\t\t\t\t\t\t\t\t 3 Remove surprise courier ");
									System.out.println("\t\t\t\t\t\t\t\t\t 4 Remove receive home delivery ");
									System.out.println("\t\t\t\t\t\t\t\t\t 5 Remove receive delivery from office ");
									System.out.println("\t\t\t\t\t\t\t\t\t 6 set today's courier : ");
									System.out.println("\t\t\t\t\t\t\t\t\t 7 <- Go back ");
									System.out.print("\t\t\t\t\t\t\t\t\t PLease select your option = ");

									int manageCourierOption=0;
									try {
										manageCourierOption = sc.nextInt();
									}catch (InputMismatchException eh){
										main(null);
									}

									cls();
									switch (manageCourierOption){
										case 1:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Remove courier send from Home ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");

											System.out.print("\t\t\t\t\t\t\t\t\tEnter sender phone number: ");
											//Scanner sc = new Scanner(System.in);
											String senderNumberRemoveCourier =sc.next();
											String sendDeliveryFromHomePath="SendDeliveryFromHome.txt";
											//ManageCourier m2 = new ManageCourier();
											RemoveElement r10=new RemoveElement();
											r10.removeSendDeliveryFromHome(sendDeliveryFromHomePath,senderNumberRemoveCourier);
											//System.out.println("Check-6");

											break;
										case 2:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Remove courier send from office ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");


											System.out.print("\t\t\t\t\t\t\t\t\tEnter sender phone number: ");
											//Scanner sc = new Scanner(System.in);
											String senderNumberRemoveCourierSFO =sc.next();
											String sendDeliveryFromHomePathSFO="SendDeliveryFromOffice.txt";
											//ManageCourier m2 = new ManageCourier();
											RemoveElement r11=new RemoveElement();
											//RemoveElementSCFOffice r11=new RemoveElementSCFOffice();
											r11.removeSendDeliveryFromOffice1(sendDeliveryFromHomePathSFO,senderNumberRemoveCourierSFO);
											//System.out.println("Check-6");

											break;

										case 3:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Remove surprise courier ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t\t\tEnter surprise sender phone number: ");
											//Scanner sc = new Scanner(System.in);
											String senderNumberRemoveSupriseCourier =sc.next();
											String sendSurpriseDeliveryFilePath="surpriseDelivery.txt";
											//ManageCourier m2 = new ManageCourier();
											RemoveElement r12=new RemoveElement();
											//RemoveElementSCFOffice r11=new RemoveElementSCFOffice();
											r12.removeSurpriseCourier(sendSurpriseDeliveryFilePath,senderNumberRemoveSupriseCourier);
										//	System.out.println("Check-6");

											break;

										case 4://////////remove receive home delivery
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Remove receiver home delivery ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t\t\tEnter sender phone number: ");

											String senderNumberRemoveRecHomeDelivery =sc.next();
											String ReceiveHomeDeliveryPath="ReceiverHomeDelivery.txt";

											RemoveElement r13=new RemoveElement();

											r13.removeReceiveHomeDelivery(ReceiveHomeDeliveryPath,senderNumberRemoveRecHomeDelivery);




											break;

										case 5://///////remove receive delivery from office
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t--------------------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Remove receiver delivery from office ");
											System.out.println("\t\t\t\t\t\t\t\t\t--------------------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t\t\tEnter sender phone number: ");

											String senderNumberRemoveRecDelFromOffice =sc.next();
											String ReceiveDelFromOfficePath="ReceiveDeliveryFromOffice.txt";

											RemoveElement r14=new RemoveElement();

											r14.removeReceiveDeliveryFromOffice(ReceiveDelFromOfficePath,senderNumberRemoveRecDelFromOffice);
											break;

										case 6:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: set today's courier ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											//break;
											ManageCourier setCourierCount = new ManageCourier();
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											//System.out.println("\t\t\t\t\t\t\t\t\t=======================================================");
											System.out.print("\t\t\t\t\t\t\t\t\tPlease enter todays courier : ");

											int courierCount = sc.nextInt();
											//System.out.println("\t\t\t\t\t\t\t\t\t=======================================================");
											setCourierCount.setCourierCount(courierCount);
											cls();
											break;
										case 7:
											break;


										default:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");
											System.out.println("\t\t\t\t\t\t\t\t\t|       Invalid Option              |");
											System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");

											System.out.println();
											break;

									}


									break;

								case 3:// see all courier send from home
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: see all courier send from home ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									CourierService c11=new CourierService();

										c11.openFileSendFromHome();

									//c11.readFileSendFromHome();
									//c11.closeFileSendFromHome();
									break;
								case 4://see all courier send from office
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: see all courier send from office ");
									System.out.println("\t\t\t\t\t\t\t\t\t--------------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									CourierService c12=new CourierService();
									c12.openFileSendFromOffice();
									break;

								case 5://see all surprise courier
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: see all surprise courier ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									SurpriseSpecialOccation s6=new SurpriseSpecialOccation();
									s6.openFileSurpriseDelivery();

									break;

								case 6://See all set status
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: See all set status ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									SetStatus s3=new SetStatus();
									s3.openFileSetStatus();
									break;

								case 7://////////////see all receive home delivery
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: See all receive home delivery ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									CourierService c40=new CourierService();
									c40.openFileReceiveHomeDelivery();

                                   break;
								case 8://////////////// see all receive delivery from office
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t------------------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: see all receive delivery from office ");
									System.out.println("\t\t\t\t\t\t\t\t\t------------------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									CourierService c41=new CourierService();
									c41.openFileReceiveDeliveryFromOffice();

                                    break;


								case 9: // delivery boy part
									//	while(repeat){
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Manage delivery boy ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t|---------------------------------------|");
									System.out.println("\t\t\t\t\t\t\t\t\t|   1. See all delivery Boy Information |");
									System.out.println("\t\t\t\t\t\t\t\t\t|   2. Add delivery boy                 |");
									System.out.println("\t\t\t\t\t\t\t\t\t|   3. Remove delivery boy              |");
									System.out.println("\t\t\t\t\t\t\t\t\t|   4. Search specific delivery boy     |");
									System.out.println("\t\t\t\t\t\t\t\t\t|   5. Go previous option               |");
									System.out.println("\t\t\t\t\t\t\t\t\t|---------------------------------------|");
									System.out.print("\t\t\t\t\t\t\t\t\tEnter your option : ");
									int optionOfAdminOfDeliveryBoy=0;
                                    try {
										optionOfAdminOfDeliveryBoy = sc.nextInt();
									}catch (InputMismatchException eh){
                                    	main(null);
									}
									cls();
									switch (optionOfAdminOfDeliveryBoy) {
										case 1:// see all delivery boy info

											//DeliveryBoy deliveryBoyObject =new DeliveryBoy();
											//	deliveryBoyObject.showAllDeliveryBoyInfo();

											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Show All delivery boy");
											System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------");
											System.out.println("");
											System.out.println("");

											courierService.showAllDeliveryBoyInfo();
											break;
										case 2://Add delivery boy
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Add delivery boy      ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t\t\tEnter delivery boy id :");
											sc.nextLine();
											String deliveryBoyId = sc.nextLine();
											System.out.print("\t\t\t\t\t\t\t\t\tEnter delivery boy name :");
											String deliveryBoyName = sc.nextLine();
											System.out.print("\t\t\t\t\t\t\t\t\tEnter delivery boy age :");
											String deliveryBoyAge = sc.nextLine();
											System.out.print("\t\t\t\t\t\t\t\t\tEnter delivery boy gender :");
											String deliveryBoyGender = sc.nextLine();
											System.out.print("\t\t\t\t\t\t\t\t\tEnter delivery boy address :");
											String deliveryBoyAddress = sc.nextLine();
											System.out.print("\t\t\t\t\t\t\t\t\tEnter delivery boy contact number :");
											String deliveryBoyContactNumber = sc.nextLine();
											System.out.print("\t\t\t\t\t\t\t\t\tEnter delivery boy email address :");
											String deliveryBoyEmailAddress = sc.nextLine();
											System.out.print("\t\t\t\t\t\t\t\t\tEnter delivery boy password :");
											String deliveryBoyPassword = sc.nextLine();

											//DeliveryBoy d1 = new DeliveryBoy(deliveryBoyId,deliveryBoyName,deliveryBoyAge,deliveryBoyGender,deliveryBoyAddress,deliveryBoyContactNumber,deliveryBoyEmailAddress,deliveryBoyPassword);
											DeliveryBoy d1 = new DeliveryBoy();
											d1.setDeliveryBoyId(deliveryBoyId);
											d1.setDeliveryBoyName(deliveryBoyName);
											d1.setDeliveryBoyAge(deliveryBoyAge);
											d1.setDeliveryBoyGender(deliveryBoyGender);
											d1.setDeliveryBoyAddress(deliveryBoyAddress);
											d1.setDeliveryBoyContactNumber(deliveryBoyContactNumber);
											d1.setDeliveryBoyEmailAddress(deliveryBoyEmailAddress);
											d1.setDeliveryBoyPassword(deliveryBoyPassword);

											if (courierService.insertDeliveryBoy(d1)) {
												System.out.println("\t\t\t\t\t\t\t\t\tData Inserted");
											} else {
												System.out.println("\t\t\t\t\t\t\t\t\tError");
											}

											break;
										case 3://Remove delivery boy
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Remove an existing Delivery boy");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");

											System.out.print("\t\t\t\t\t\t\t\t\tEnter Delivery Boy id: ");
											//Scanner sc = new Scanner(System.in);
											String deliveryBoyIdRemove =sc.next();

											//////////////////////txt method//////////////////////
											String deliveryBoyFilePath="Delivery.txt";
											String tempFile ="temp.txt";
											File oldFile = new File (deliveryBoyFilePath);
											File newFile=new File(tempFile);
											String deliveryBoyId7="";
											String deliveryBoyName7="";
											String deliveryBoyAge7="";
											String deliveryBoyGender7="";
											String deliveryBoyAddress7="";
											String deliveryBoyContactNumber7="";
											String deliveryBoyEmailAddress7="";
											String deliveryBoyPassword7="";
											try{
												FileWriter fw = new FileWriter(tempFile,true);
												BufferedWriter bw=new BufferedWriter(fw);
												PrintWriter pw = new PrintWriter(bw);
												x=new Scanner(new File(deliveryBoyFilePath));
												x.useDelimiter("[,\n]");


												while (x.hasNext()){
													deliveryBoyId7=x.next();
													deliveryBoyName7=x.next();
													deliveryBoyAge7=x.next();
													deliveryBoyGender7=x.next();
													deliveryBoyAddress7=x.next();
													deliveryBoyContactNumber7=x.next();
													deliveryBoyEmailAddress7=x.next();
													deliveryBoyPassword7=x.next();
													if(!deliveryBoyId7.equals(deliveryBoyIdRemove)){
														pw.println(deliveryBoyId7+","+deliveryBoyName7+","+deliveryBoyAge7+","+deliveryBoyGender7+","+deliveryBoyAddress7+","+deliveryBoyContactNumber7+","+deliveryBoyEmailAddress7+","+deliveryBoyPassword7);
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
											////////////////txt method///////////////////


											/*String deliveryBoyFilePath2="Delivery.txt";
											removeDeliveryFromTxt(deliveryBoyFilePath2,deliveryBoyIdRemove);
											System.out.println("Check-6");

											//removeDeliveryBoyRecord(deliveryBoyFilePath,deliveryBoyIdRemove);



											DeliveryBoy e3 = courierService.searchDeliveryBoy(deliveryBoyIdRemove);

											if (e3 != null) {
												if (courierService.removeDeliveryBoy(e3)) {
													System.out.println("\t\t\t\t\t\t\t\t\tDelivery Boy Removed.... ID: " + e3.getDeliveryBoyId());
												} else {
													System.out.println("\t\t\t\t\t\t\t\t\tOops.... Something is wrong...");
												}
											} else {
												System.out.println("\t\t\t\t\t\t\t\t\tNo employee found to remove");
											}

											System.out.println();*/
											break;


										case 4://search specific delivery boy
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t---------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Search an Delivery boy");
											System.out.println("\t\t\t\t\t\t\t\t\t----------------------------------------");
											System.out.println("");
											System.out.println("");

											System.out.print("\t\t\t\t\t\t\t\t\tEnter Delivery Boy id: ");
											sc.nextLine();
											String searchDeliveryBoyId = sc.nextLine();

											String filepath="Delivery.txt";
											FileReader fr = new FileReader(filepath);
											BufferedReader br = new BufferedReader(fr);
											String line9 = "";
											int i = 0;
											File file= new File(filepath);
											FileReader fr1 = new FileReader(filepath);
											BufferedReader br1 = new BufferedReader(fr);
											try{
												Scanner inputBuffer=new Scanner(file);
												while((line9 = br1.readLine())!=null){
													String line8=inputBuffer.nextLine();
													String[] valueTrack =line8.split(",");
													if(valueTrack[0].equals(searchDeliveryBoyId)){
														try{
															System.out.println("\n\t\t\t\t\t\t\t\t\t===========================================================\n\t\t\t\t\t\t\t\t\tDelivery Boy Id: "+valueTrack[0]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Name : "+valueTrack[1]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Age : "+valueTrack[2]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Gender : "+valueTrack[3]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Address : "+valueTrack[4]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy ContactNumber : "+valueTrack[5]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy EmailAddress : "+valueTrack[6]+" \n\t\t\t\t\t\t\t\t\tDelivery Boy Password : "+valueTrack[7]);


														}catch (ArrayIndexOutOfBoundsException ar){}

													}

												}
												inputBuffer.close();
                                                br.close();
												fr.close();
												br1.close();
												fr1.close();

											}catch (FileNotFoundException fe){
												fe.printStackTrace();
											}


											break;


										case 5://go back
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is to Go Back.......");
											System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------");
											// need to enter method of go back//
											System.out.println();
											break;


										default:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");
											System.out.println("\t\t\t\t\t\t\t\t\t|       Invalid Option              |");
											System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");

											System.out.println();
											break;


									}
									break;
								//}

								case 10://Manage customer//

									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Manage customer ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t|---------------------------------------|");
									System.out.println("\t\t\t\t\t\t\t\t\t|   1. See customer information         |");
									System.out.println("\t\t\t\t\t\t\t\t\t|   2. Remove customer                  |");
									System.out.println("\t\t\t\t\t\t\t\t\t|   3.<- Go back to previous option     |");
									System.out.println("\t\t\t\t\t\t\t\t\t|---------------------------------------|");
									System.out.print("\t\t\t\t\t\t\t\t\tEnter your option : ");
									int adminCustomerOption=0;
									try {
										adminCustomerOption = sc.nextInt();
									}catch (InputMismatchException eh){
										main(null);
									}
									cls();
									switch (adminCustomerOption) {

										case 1:// search customer
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Search an Customer");
											System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t\t\tEnter Customer phone number :");
											sc.nextLine();
											String customerSearchPhoneNumber = sc.nextLine();
											cls();

											//////////////////txt method/////////////////////////
											String searchDeliveryBoyId = sc.nextLine();

											String filepath="Customer.txt";
											FileReader fr = new FileReader(filepath);
											BufferedReader br = new BufferedReader(fr);
											String line9 = "";
											int i = 0;
											File file= new File(filepath);
											FileReader fr1 = new FileReader(filepath);
											BufferedReader br1 = new BufferedReader(fr);
											try{
												Scanner inputBuffer=new Scanner(file);
												while((line9 = br1.readLine())!=null){
													String line8=inputBuffer.nextLine();
													String[] valueTrack =line8.split(",");
													if(valueTrack[0].equals(customerSearchPhoneNumber)){
														try{
															System.out.println("\n\t\t\t\t\t\t\t\t\t===========================================================\n\t\t\t\t\t\t\t\t\tCustomer Contact Number: "+valueTrack[0]+" \n\t\t\t\t\t\t\t\t\tCustomer Name : "+valueTrack[1]+" \n\t\t\t\t\t\t\t\t\tCustomer Age : "+valueTrack[2]+" \n\t\t\t\t\t\t\t\t\tCustomer Gender : "+valueTrack[3]+" \n\t\t\t\t\t\t\t\t\tCustomer Email Address : "+valueTrack[4]+" \n\t\t\t\t\t\t\t\t\tCustomer Address : "+valueTrack[5]);


														}catch (ArrayIndexOutOfBoundsException ar){}

													}

												}
												inputBuffer.close();
												br.close();
												fr.close();
												br1.close();
												fr1.close();

											}catch (FileNotFoundException fe){
												fe.printStackTrace();
											}


											/////////////////txt method end/////////////////////


											Customers c1 = courierService.searchCustomer(customerSearchPhoneNumber);
											if (c1 != null) {
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("\t\t\t\t\t\t\t\t\t-------------------------");
												System.out.println("\t\t\t\t\t\t\t\t\t     Customer found  ");
												System.out.println("\t\t\t\t\t\t\t\t\t-------------------------");
												System.out.println("\t\t\t\t\t\t\t\t\tCustomer name: " + c1.getCustomerName());
												System.out.println("\t\t\t\t\t\t\t\t\tCustomer age: " + c1.getCustomerAge());
												System.out.println("\t\t\t\t\t\t\t\t\tCustomer Gender: " + c1.getCustomerGender());
												System.out.println("\t\t\t\t\t\t\t\t\tCustomer address: " + c1.getCustomerAddress());
												System.out.println("\t\t\t\t\t\t\t\t\tCustomer Contact number: " + c1.getCustomerContactNumber());
												System.out.println("\t\t\t\t\t\t\t\t\tCustomer email address " + c1.getCustomerEmailAdress());

											}
											/*else{
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("\t\t\t\t\t\t\t\t\t=====================================================");
												System.out.println("\t\t\t\t\t\t\t\t\t     Customer not found....Number is "+customerSearchPhoneNumber);
												System.out.println("\t\t\t\t\t\t\t\t\t=====================================================");

											}*/
											break;


										case 2://Remove Customer
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");

											System.out.println("\t\t\t\t\t\t\t\t\t----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Remove a  customer");
											System.out.println("\t\t\t\t\t\t\t\t\t----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t\t\tEnter customer contact number :");
											sc.nextLine();
											String removeCustomerByContactNumber = sc.nextLine();/////////////////////////////////////////////////////
											cls();

											/////////////txt//////////////////////////////////
											String customerFilePath="Customer.txt";
											String tempFile ="tempCustomer.txt";
											File oldFile = new File (customerFilePath);
											File newFile=new File(tempFile);
											String getCustomerContactNumber="";
											String getCustomerName="";
											String getCustomerAge="";
											String getCustomerGender="";
											String getCustomerEmailAdress="";
											String getCustomerAddress="";
											String getCustomerPassword="";
											// String deliveryBoyPassword="";
											try{
												FileWriter fw = new FileWriter(tempFile,true);
												BufferedWriter bw=new BufferedWriter(fw);
												PrintWriter pw = new PrintWriter(bw);
												x=new Scanner(new File(customerFilePath));
												x.useDelimiter("[,\n]");


												while (x.hasNext()){
													getCustomerContactNumber=x.next();
													getCustomerName=x.next();
													getCustomerAge=x.next();
													getCustomerGender=x.next();
													getCustomerEmailAdress=x.next();
													getCustomerAddress=x.next();
													getCustomerPassword=x.next();
													//deliveryBoyPassword=x.next();
													if(!getCustomerContactNumber.equals(removeCustomerByContactNumber)){
														pw.println(getCustomerContactNumber+","+getCustomerName+","+getCustomerAge+","+getCustomerGender+","+getCustomerEmailAdress+","+getCustomerAddress+","+getCustomerPassword);
													}

												}
												x.close();
												pw.flush();
												pw.close();
												oldFile.delete();
												File dump = new File(customerFilePath);
												newFile.renameTo(dump);



											}catch (Exception ex){

											}
											/////////////txt end//////////////////////////////////
											Customers c2 = courierService.searchCustomer(removeCustomerByContactNumber);//////////////////////////////////

											///////this method for store in array///////which is not need anymore////////
											//if (c2 != null) {
												if (courierService.removeCustomer(c2)) {
													System.out.println("");
													System.out.println("");
													System.out.println("");
													System.out.println("");
													System.out.println("");
													System.out.println("");
													System.out.println("");
													System.out.println("");
													System.out.println("\t\t\t\t\t\t\t\t\t==================================");
													System.out.println("\t\t\t\t\t\t\t\t\tCustomer Removed");
													System.out.println("\t\t\t\t\t\t\t\t\t==================================");
												}
											//}
										/*	else {
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("");
												System.out.println("\t\t\t\t\t\t\t\t\t==============================================================================");
												System.out.println("\t\t\t\t\t\t\t\t\t     Customer not found....Phone number is "+removeCustomerByContactNumber);
												System.out.println("\t\t\t\t\t\t\t\t\t==============================================================================");
											}*/

											break;

										case 3:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is to Go Back.......");
											System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------");
											// need to enter method of go back//
											System.out.println();
											//break;

											// 	break;

										default:
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");
											System.out.println("\t\t\t\t\t\t\t\t\t|       Invalid Option              |");
											System.out.println("\t\t\t\t\t\t\t\t\t|-----------------------------------|");

											System.out.println();
											break;

									}


									break;

								case 11://////////manage complain
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: Manage complain ");
									System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t|================================|");
									System.out.println("\t\t\t\t\t\t\t\t\t|1.   See all complain           |");
									System.out.println("\t\t\t\t\t\t\t\t\t|2.   If resolve delete complain |");
									System.out.println("\t\t\t\t\t\t\t\t\t|3.   Go back                    |");
									System.out.println("\t\t\t\t\t\t\t\t\t|================================|");

									System.out.print("\t\t\t\t\t\t\t\t\t   Enter your option : ");
									int manageComOption=0;
									try {
										manageComOption = sc.nextInt();
									}catch (InputMismatchException eh){
										main(null);
									}
									cls();
									switch (manageComOption){

										case 1://////see all complain
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: see all complain ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											ManageCourier m10=new ManageCourier();
											m10.openCustomerComplainFile();


											break;

										case 2://// delete complain
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("\t\t\t\t\t\t\t\t\tYour Option is: delete complain ");
											System.out.println("\t\t\t\t\t\t\t\t\t-----------------------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("");

											System.out.print("\t\t\t\t\t\t\t\t\tEnter customer phone number: ");

											String customerNumberForRemoveComplain =sc.next();
											String customerComFilePath="CustomerComplain.txt";


											ManageCourier m11=new ManageCourier();
											m11.removeCustomerComplain(customerComFilePath,customerNumberForRemoveComplain);
											break;
										case 3:
											break;

									}

									break;

								case 12:
									repeat = false;

							}
							///break;////////////////////////
						}//admin after login end
						break;///////////////////////////////////
					}
								else{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t\t\t\t\t\t\t\t|================================|");
									System.out.println("\t\t\t\t\t\t\t\t\t|Please Insert correct id & pass |");
									System.out.println("\t\t\t\t\t\t\t\t\t|================================|");
								}
						}
					//}//////////////////////////////////////if admin////////



			}








		}//while finish



	}// main finish
	 public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch(Exception E) {
            System.out.println(E);
        }
    }

	//txt method

	public static void removeDeliveryFromTxt(String deliveryBoyFilePath,String DeliveryBoyIdForRemove ){ //IOException
		//System.out.println("Check-5");
		//String deliveryBoyFilePath="Delivery.txt";
		String tempFile ="tempDelivery.txt";
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
		//System.out.println("Check-4");
		try{
			FileWriter fw = new FileWriter(tempFile,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			x=new Scanner(new File(deliveryBoyFilePath));
			//System.out.println("Check-3");
			x.useDelimiter("[,\n]");
			//System.out.println("Check-2");

			int count=0;
			while (x.hasNext()){

			//	System.out.println("Check-1");
				deliveryBoyId=x.next();
				deliveryBoyName=x.next();
				deliveryBoyAge=x.next();
				deliveryBoyGender=x.next();
				deliveryBoyAddress=x.next();
				deliveryBoyContactNumber=x.next();
				deliveryBoyEmailAddress=x.next();
				deliveryBoyPassword=x.next();
			//	System.out.println("Check1");
				if(!deliveryBoyId.equals(DeliveryBoyIdForRemove)){
					pw.println(deliveryBoyId+","+deliveryBoyName+","+deliveryBoyAge+","+deliveryBoyGender+","+deliveryBoyAddress+","+deliveryBoyContactNumber+","+deliveryBoyEmailAddress+","+deliveryBoyPassword);
					//System.out.println("Check2");

				}
				count++;


			}
			if(count!=0){
			//	System.out.println("Check3");

				x.close();
				pw.flush();
				pw.close();
				oldFile.delete();
				File dump = new File(deliveryBoyFilePath);
				newFile.renameTo(dump);
			//	System.out.println("Check4");
			}




		}catch (Exception ex){
		//	System.out.println("Check5");


		}
	}

	//text method remove del


}