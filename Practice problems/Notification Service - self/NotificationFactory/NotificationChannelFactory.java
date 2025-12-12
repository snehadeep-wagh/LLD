package NotificationFactory;
import NotificationService.EmailNotification;
import NotificationService.NotificationService;
import NotificationService.PushNotification;
import NotificationService.SmsNotification;
import Exceptions.UnsupportedNotificationType;

public class NotificationChannelFactory {

    public NotificationService getNotificationChannel(String notificationType){
        if(notificationType.equals("SMS")){
            return new SmsNotification();
        }else if(notificationType.equals("EMAIL")){
            return new EmailNotification();
        }else if(notificationType.equals("PUSH")){
            return new PushNotification();
        }else{
            throw new UnsupportedNotificationType();
        }
    }
}