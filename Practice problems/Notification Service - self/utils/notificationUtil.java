package utils;

import java.util.HashMap;
import java.util.Map;
import enums.NotificationChannelEnum;

public class notificationUtil {
    public static Map<Integer, NotificationChannelEnum> notificationChannelMap;

    static {
        notificationChannelMap = new HashMap<>();
        notificationChannelMap.put(1, NotificationChannelEnum.SMS);
        notificationChannelMap.put(2, NotificationChannelEnum.EMAIL);
        notificationChannelMap.put(3, NotificationChannelEnum.PUSH);
    }
}
