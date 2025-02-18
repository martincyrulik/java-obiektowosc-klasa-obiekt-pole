/**
 *Program do przechowywania faktur #1
 * Napisz program do przechowywania faktur. Każda faktura ma numer, opis, ilość,
 * cenę netto, stawkę vat, informację od kogo i dla kogo jest wystawiona ( NIP).
 *
 * Wprowadź kilka faktur, a następnie je wyświetl.
 */

public class InvoiceProgram {
    public static void main(String[] args) {

        //faktura 1
        System.out.println("---------- Invoice 1 ----------");
        Invoice i1 = new Invoice(); //deklaracja obiektu i1 klasy Invoice
        i1.number = 1;  //do pola danego obiektu mamy access dzięki operatorowi .
        char[] description = {'b','o','o','k'};
        i1.description = description;
         i1.quantity = 2;
         i1.price = 32.10;
         i1.vat = 0.23;
         i1.fromNIP = 1234121233;
         i1.forNIP = 1112223339;

        System.out.println("Number: " + i1.number);
        System.out.print("Description: ");
        for (char c : i1.description){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Quantity: " + i1.quantity);
        System.out.println("Price: " + i1.price);
        System.out.println("Vat: " + i1.vat);
        System.out.println("From: " + i1.fromNIP);
        System.out.println("For " + i1.forNIP);

        //faktura 2
        System.out.println("---------- Invoice 2 ----------");
        Invoice i2 = new Invoice(); //deklaracja obiektu i1 klasy Invoice
        i2.number = 2;  //do pola danego obiektu mamy access dzięki operatorowi .
        char[] description2 = {'l','a','p','t','o','p'};
        i2.description = description2;
        i2.quantity = 5;
        i2.price = 2423.32;
        i2.vat = 0.23;
        i2.fromNIP = 1112228881;
        i2.forNIP = 1294449991;

        System.out.println("Number: " + i2.number);
        System.out.print("Description: ");
        for (char c : i2.description){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Quantity: " + i2.quantity);
        System.out.println("Price: " + i2.price);
        System.out.println("Vat: " + i2.vat);
        System.out.println("From: " + i2.fromNIP);
        System.out.println("For " + i2.forNIP);

        //przypisanie faktur do tablicy
        Invoice[] invoices = new Invoice[2];
        invoices[0] = i1;
        invoices[1] = i2;

        System.out.println("--------- Invoices - foreach--------- ");
        for (Invoice invoice: invoices){
            System.out.println("Number: " + invoice.number);
            System.out.print("Description: ");
            for (char c : invoice.description){
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Quantity: " + invoice.quantity);
            System.out.println("Price: " + invoice.price);
            System.out.println("Vat: " + invoice.vat);
            System.out.println("From: " + invoice.fromNIP);
            System.out.println("For " + invoice.forNIP);
        }
    }
}
