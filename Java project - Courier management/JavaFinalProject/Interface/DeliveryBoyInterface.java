package Interface;

import Classes.DeliveryBoy;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DeliveryBoyInterface {

    boolean insertDeliveryBoy(DeliveryBoy d) throws IOException;
    boolean removeDeliveryBoy(DeliveryBoy d);
    DeliveryBoy searchDeliveryBoy(String deliveryBoyIdRemove) throws FileNotFoundException;
    void showAllDeliveryBoyInfo() throws IOException;
}