import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Replace SERVER_IP with cloud VM public IP
            Registry registry = LocateRegistry.getRegistry("13.233.108.133", 1099);
            Calculator calc = (Calculator) registry.lookup("CalculatorService");

            System.out.println("Addition: " + calc.add(10, 5));
            System.out.println("Multiplication: " + calc.multiply(10, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
