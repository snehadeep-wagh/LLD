package NotificationFactory;

import NotificationService.EmailNotification;
import NotificationService.NotificationService;
import NotificationService.PushNotification;
import NotificationService.SmsNotification;

import java.util.HashMap;
import java.util.Map;

import Exceptions.UnsupportedNotificationType;
import enums.NotificationChannelEnum;
import utils.notificationUtil;

public class NotificationChannelFactory {
    private static Map<NotificationChannelEnum, NotificationService> notificationChannelToServiceMap;

    static {
        notificationChannelToServiceMap = new HashMap<>();
        notificationChannelToServiceMap.put(NotificationChannelEnum.SMS, new SmsNotification());
        notificationChannelToServiceMap.put(NotificationChannelEnum.EMAIL, new EmailNotification());
        notificationChannelToServiceMap.put(NotificationChannelEnum.PUSH, new PushNotification());
    }

    public NotificationService getNotificationChannel(NotificationChannelEnum notificationType) {
        NotificationService notificationService = notificationChannelToServiceMap.get(notificationType);
        if (notificationService != null) {
            return notificationService;
        } else {
            throw new UnsupportedNotificationType();
        }
    }
}