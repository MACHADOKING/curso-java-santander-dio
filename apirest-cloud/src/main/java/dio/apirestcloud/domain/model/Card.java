package dio.apirestcloud.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", nullable = false, scale = 2, precision = 13)
    private BigDecimal limit;

    // Getter for 'id'
    public Long getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for 'number'
    public String getNumber() {
        return number;
    }

    // Setter for 'number'
    public void setNumber(String number) {
        this.number = number;
    }

    // Getter for 'limit'
    public BigDecimal getLimit() {
        return limit;
    }

    // Setter for 'limit'
    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
