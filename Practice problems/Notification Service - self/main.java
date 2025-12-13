import java.util.Scanner;

import NotificationService.NotificationService;
import enums.NotificationChannelEnum;
import NotificationFactory.NotificationChannelFactory;

public class main {

    private static NotificationChannelEnum getNotificationTypeFromId(Integer notificationTypeId) {
        if (utils.notificationUtil.notificationChannelMap.get(notificationTypeId) != null) {
            return utils.notificationUtil.notificationChannelMap.get(notificationTypeId);
        }
        return NotificationChannelEnum.INVALID;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Select the notifications type:\n1) SMS\n2) EMAIL\n3) PUSH 4) EXIT. \n\nPlease enter the number:  ");

            int notificationTypeId;
            NotificationChannelEnum notificationType;

            notificationTypeId = scanner.nextInt();
            scanner.nextLine();

            if (notificationTypeId > 4 || notificationTypeId < 1) {
                System.out.println("\nINVALID TYPE! Please select the correct type.\n");
                continue;
            }

            if (notificationTypeId == 4)
                break;

            notificationType = getNotificationTypeFromId(notificationTypeId);

            System.out.println("\nEnter the notification message: ");
            String message = "";
            message = scanner.nextLine();

            System.out.println("\n\nSending notification.....");

            NotificationChannelFactory notificationChannelFactory = new NotificationChannelFactory();
            NotificationService notificationService = notificationChannelFactory
                    .getNotificationChannel(notificationType);
            notificationService.sendNotification(message);

            System.out.println("\n\nNotification sent.");
        }

        scanner.close();
    }
}
