package examples.android.example.com.firebaseauthentication.aAMessagingTestPckg;

import java.util.concurrent.atomic.AtomicInteger;

public class NotificationID {

    private static final AtomicInteger c = new AtomicInteger(0);

    public static int getID() {
        return c.incrementAndGet();
    }
}
