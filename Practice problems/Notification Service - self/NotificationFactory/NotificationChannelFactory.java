package NotificationFactory;

import NotificationService.EmailNotification;
import NotificationService.NotificationService;
import NotificationService.PushNotification;
import NotificationService.SmsNotification;
import Exceptions.UnsupportedNotificationType;
import enums.NotificationChannelEnum;

public class NotificationChannelFactory {

    public NotificationService getNotificationChannel(NotificationChannelEnum notificationType) {
        if (notificationType.equals(NotificationChannelEnum.SMS)) {
            return new SmsNotification();
        } else if (notificationType.equals(NotificationChannelEnum.EMAIL)) {
            return new EmailNotification();
        } else if (notificationType.equals(NotificationChannelEnum.PUSH)) {
            return new PushNotification();
        } else {
            throw new UnsupportedNotificationType();
        }
    }
}