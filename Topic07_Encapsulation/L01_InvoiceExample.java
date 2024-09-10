package Topic07_Encapsulation;
import java.util.Scanner;
class Invoice {
    private double total;
    private double gst;
    private double serviceCharge;

    public Invoice(double total, double gst, double serviceCharge) {
        this.total = total;
        this.gst = gst;
        this.serviceCharge = serviceCharge;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getGst() {
        return gst;
    }
    public void setGst(double gst) {
        this.gst = gst;
    }
    public double getServiceCharge() {
        return serviceCharge;
    }
    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    public double getNetTotal() {
        return total * (1 + gst + serviceCharge);
    }
  
}

public class L01_InvoiceExample {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the total of the invoice: ");
        double total = sc.nextDouble();
        Invoice i  = new Invoice(total, 0.09, 0.1);

        System.out.println("The total to pay, including fees =" + i.getNetTotal());
    }
}
