package NotificationService;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message){
        System.out.println("Sending notification through Email having message- " + message);
    }
}
