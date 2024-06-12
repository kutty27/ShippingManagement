import java.util.ArrayList;
import java.util.List;

public class ShipmentManager {
    private List<Shipment> shipments;

    public ShipmentManager() {
        this.shipments = new ArrayList<>();
    }

    public void addShipment(Shipment shipment) {
        shipments.add(shipment);
    }

    public void removeShipment(String id) {
        shipments.removeIf(shipment -> shipment.getId().equals(id));
    }

    public void listShipments() {
        for (Shipment shipment : shipments) {
            System.out.println(shipment);
        }
    }
}
