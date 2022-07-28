package skypro.DolgovaEkaterinaBot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class notification_task {
    @Id
    @GeneratedValue
    private Long id;
    private Integer id_chat;
    private String textY;
    private LocalDateTime datetime;

    public notification_task() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getId_chat() {
        return id_chat;
    }

    public void setId_chat(Integer id_chat) {
        this.id_chat = id_chat;
    }

    public String getTextY() {
        return textY;
    }

    public void setTextY(String textY) {
        this.textY = textY;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String toString() {
        return "notification_task{" +
                "id=" + id +
                ", id_chat='" + id_chat + '\'' +
                ", textY='" + textY + '\'' +
                ", datetime=" + datetime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        notification_task task = (notification_task) o;
        return id_chat == task.id_chat && id.equals(task.id) && textY.equals(task.textY)&& datetime.equals(task.datetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_chat, textY,datetime);
    }
}
