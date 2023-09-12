package dio.apirestcloud.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;

    private String description;

    // Getter for 'id'
    public Long getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for 'icon'
    public String getIcon() {
        return icon;
    }

    // Setter for 'icon'
    public void setIcon(String icon) {
        this.icon = icon;
    }

    // Getter for 'description'
    public String getDescription() {
        return description;
    }

    // Setter for 'description'
    public void setDescription(String description) {
        this.description = description;
    }
}
