

import Order.ScanOrder;

public class Main {
    public static void main(String[] args) {
        ScanOrder order = new ScanOrder();
        order.setPrice(10.76);
        System.out.println(order.getPrice());
    }
}
