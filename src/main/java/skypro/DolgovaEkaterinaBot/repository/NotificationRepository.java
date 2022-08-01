package skypro.DolgovaEkaterinaBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import skypro.DolgovaEkaterinaBot.model.Notification;

import java.util.Collection;
import java.util.List;

@Service
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Collection<Notification> findByTextY(Long Id);

    @Query(value = "Select id_chat " +
            "from notification " +
            "where to_char(datetime, 'HH24:MI:SS')=now()::time" +
            "ORDER BY id DESC  ", nativeQuery = true)
    long messangeChatId();

    @Query(value = "Select texty " +
            "from notification " +
            "where to_char(datetime, 'HH24:MI:SS')=now()::time" +
            "ORDER BY id DESC  ", nativeQuery = true)
    String messangeTexty();
}
