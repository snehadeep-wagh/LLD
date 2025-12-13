package utils;

import java.util.HashMap;
import java.util.Map;

import NotificationService.EmailNotification;
import NotificationService.NotificationService;
import NotificationService.PushNotification;
import NotificationService.SmsNotification;
import enums.NotificationChannelEnum;

public class notificationUtil {
    public static Map<Integer, NotificationChannelEnum> notificationChannelMap;
    public static Map<NotificationChannelEnum, NotificationService> notificationChannelToServiceMap;

    static {
        notificationChannelMap = new HashMap<>();
        notificationChannelMap.put(1, NotificationChannelEnum.SMS);
        notificationChannelMap.put(2, NotificationChannelEnum.EMAIL);
        notificationChannelMap.put(3, NotificationChannelEnum.PUSH);

        notificationChannelToServiceMap = new HashMap<>();
        notificationChannelToServiceMap.put(NotificationChannelEnum.SMS, new SmsNotification());
        notificationChannelToServiceMap.put(NotificationChannelEnum.EMAIL, new EmailNotification());
        notificationChannelToServiceMap.put(NotificationChannelEnum.PUSH, new PushNotification());
    }
}
