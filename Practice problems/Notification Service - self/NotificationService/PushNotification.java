package NotificationService;
public class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message){
        System.out.println("Sending push notification having message- " + message);
    }
}
