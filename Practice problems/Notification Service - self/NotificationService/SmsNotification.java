package NotificationService;

public class SmsNotification implements NotificationService {
    
    @Override
    public void sendNotification(String message){
        System.out.println("Sending notification through SMS having message- " + message);
    }
}
