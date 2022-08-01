package skypro.DolgovaEkaterinaBot.service;

import org.springframework.stereotype.Service;
import skypro.DolgovaEkaterinaBot.repository.NotificationRepository;

import skypro.DolgovaEkaterinaBot.model.Notification;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
@Transactional
    public Notification creatNotification(Notification notification) {
        System.out.println("Попали в сохранение");
        return notificationRepository.save(notification);
    }

    public Notification readNotification(long id) {
        return notificationRepository.findById(id).get();
    }

    public Long messangeChatId() {
        return notificationRepository.messangeChatId();
    }

    public String messangeTexty() {
        return notificationRepository.messangeTexty();
    }

}
