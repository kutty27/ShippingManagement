public class Main {
    public static void main(String[] args) {
        ShipmentManager manager = new ShipmentManager();

        // Add some shipments
        manager.addShipment(new Shipment("001", "New York", "Los Angeles"));
        manager.addShipment(new Shipment("002", "San Francisco", "Chicago"));
        manager.addShipment(new Shipment("003", "Miami", "Dallas"));

        // List all shipments
        System.out.println("List of Shipments:");
        manager.listShipments();

        // Remove a shipment
        manager.removeShipment("002");

        // List all shipments after removal
        System.out.println("\nList of Shipments after removal:");
        manager.listShipments();
    }
}
