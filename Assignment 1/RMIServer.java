import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            Calculator calc = new CalculatorImpl();

            // Start RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CalculatorService", calc);

            System.out.println("RMI Calculator Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
