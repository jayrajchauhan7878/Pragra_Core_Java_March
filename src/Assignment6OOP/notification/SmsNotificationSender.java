package Assignment6OOP.notification;

public class SmsNotificationSender implements SmsNotification{

    private String phoneNumbers;
    @Override
    public String sendNotification(String message) {
        System.out.println("Sending SMS notification to:"+String.join(",",phoneNumbers));
        System.out.println("Message:"+message);

        return toString();


    }

    @Override
    public void setPhoneNumber(String[] phoneNumbers) {

        System.out.println();


    }
}
