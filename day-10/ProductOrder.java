class productOrder
{
    public static void main(String args[])
    {
        System.out.println("Starting main()");

        boolean result = ProductOrder.placeOrder("Laptop", "2", "Online");
        boolean result1 = ProductOrder.placeOrder("Mobile", "1", "Cash");

        System.out.println("Order Successful? " + result);
        System.out.println("Ending main()");
    }

    static boolean placeOrder(String product, String quantity, String payment)
    {
        System.out.println("Entered placeOrder()");
        System.out.println("Input Received " + product + " " + quantity + " " + payment);
        System.out.println("Exit placeOrder()");

        return true;
    }
}