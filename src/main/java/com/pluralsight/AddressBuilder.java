package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Please provide following information");

        String fullName = askFullName(get);
        String billingAddress = askBillingAddress(get);
        String shippingAdderss = askShippingAddress(get);
        output(fullName, billingAddress, shippingAdderss);

    }
    private static String askFullName(Scanner get) {
        // Full Name
        System.out.print("Full Name: ");
        return get.nextLine();
    }

    private static String askBillingAddress(Scanner get) {
        // Billing Address
        System.out.println();
        System.out.print("Billing Street: ");
        String billingStreet = get.nextLine();
        System.out.print("Billing City: ");
        String billingCity = get.nextLine();
        System.out.print("Billing State: ");
        String billingState = get.nextLine();
        System.out.print("Billing Zip: ");
        String billingZip = get.nextLine();

        // StringBuilder 1
        StringBuilder sb = new StringBuilder();
        sb.append(billingStreet);
        sb.append("\n");
        sb.append(billingCity);
        sb.append(", ");
        sb.append(billingState);
        sb.append(" ");
        sb.append(billingZip);
        return sb.toString();
    }

    private static String askShippingAddress(Scanner get) {
        // Shipping Address
        System.out.println();
        System.out.print("Shipping Street: ");
        String shippingStreet = get.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = get.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = get.nextLine();
        System.out.print("Shipping Zip: ");
        String shippingZip = get.nextLine();

        // StringBuilder 2
        StringBuilder sb2 = new StringBuilder();
        sb2.append(shippingStreet);
        sb2.append("\n");
        sb2.append(shippingCity);
        sb2.append(", ");
        sb2.append(shippingState);
        sb2.append(" ");
        sb2.append(shippingZip);
        return sb2.toString();
    }

    private static void output(String fullName, String billingAddress, String shippingAdderss) {
        // Output
        System.out.println();
        System.out.println("=== Address Builder ===");
        System.out.println(fullName);
        System.out.println();
        System.out.println("Billing Address: ");
        System.out.println(billingAddress);
        System.out.println();
        System.out.println("Shipping Address:");
        System.out.println(shippingAdderss);
    }
}
