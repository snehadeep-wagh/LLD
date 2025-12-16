import java.util.*;

import javax.swing.text.NavigationFilter;

import navigationStrategy.DrivingStrategy;
import navigationStrategy.PublicTransportStrategy;
import navigationStrategy.RoutingStrategy;
import navigationStrategy.WalkingStrategy;
import navigator.Navigator;

public class main {
    private static Map<Integer, String> srcMap;
    private static Map<Integer, String> destMap;
    private static Map<Integer, RoutingStrategy> routingMap;

    static {
        srcMap = new HashMap<>();
        srcMap.put(1, "Mumbai");
        srcMap.put(2, "Pune");
        srcMap.put(3, "Hyderabad");
        srcMap.put(4, "Banglore");

        destMap = new HashMap<>();
        destMap.put(1, "Mumbai");
        destMap.put(2, "Pune");
        destMap.put(3, "Hyderabad");
        destMap.put(4, "Banglore");

        routingMap = new HashMap<>();
        routingMap.put(1, new DrivingStrategy());
        routingMap.put(2, new PublicTransportStrategy());
        routingMap.put(3, new WalkingStrategy());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Navigator navigator = new Navigator();

        while (true) {
            String src;
            String dest;
            int srcIdx;
            int destIdx;

            System.out.println("Select src ->\n1. Mumbai\n2. Pune\n3. Hyderabad\n4. Banglore\n5. EXIT\n");
            srcIdx = scanner.nextInt();

            if (srcIdx > 5 || srcIdx < 1) {
                System.out.println("\n!!! Wrong src.\n");
                continue;
            }
            if (srcIdx == 5)
                break;

            src = srcMap.get(srcIdx);

            System.out.println("Select dest ->\n1. Mumbai\n2. Pune\n3. Hyderabad\n4. Banglore\n5. EXIT\n");
            destIdx = scanner.nextInt();

            if (destIdx > 5 || destIdx < 1) {
                System.out.println("\n!!! Wrong dest.\n");
                continue;
            }
            if (destIdx == 5)
                break;

            dest = destMap.get(destIdx);

            System.out.println("\nSelect Routing strategy->\n1. Bike\n2. Bus\n3. Walk\n4. EXIT\n");
            Integer routingIdx;
            routingIdx = scanner.nextInt();

            if (routingIdx < 1 || routingIdx > 4) {
                System.out.println("!!! Wrong option.\n");
                continue;
            }
            if (routingIdx == 4)
                break;

            RoutingStrategy routingStrategy = routingMap.get(routingIdx);
            navigator.setStrategy(routingStrategy);

            System.out.println("Route ->\n");
            System.out.print(navigator.generateRoute(src, dest));

            System.out.print("\nETA -> ");
            int eta = navigator.calculateEta(src, dest);
            System.out.print(String.valueOf(eta) + " min. is the Estimated time.\n\n");

            int exit = 0;
            System.out.println("do you want to exit? (1 for yes else no): ");
            exit = scanner.nextInt();

            System.out.println("\n\nThank you for navigating!");
            if (exit == 1)
                break;
        }

        scanner.close();
    }
}
