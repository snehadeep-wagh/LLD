package NotificationFactory;

import NotificationService.EmailNotification;
import NotificationService.NotificationService;
import NotificationService.PushNotification;
import NotificationService.SmsNotification;
import Exceptions.UnsupportedNotificationType;
import enums.NotificationChannelEnum;
import utils.notificationUtil;

public class NotificationChannelFactory {

    public NotificationService getNotificationChannel(NotificationChannelEnum notificationType) {
        if (notificationUtil.notificationChannelToServiceMap.get(notificationType) != null) {
            return notificationUtil.notificationChannelToServiceMap.get(notificationType);
        } else {
            throw new UnsupportedNotificationType();
        }
    }
}