package dio.apirestcloud.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    // Getter for 'id'
    public Long getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'account'
    public Account getAccount() {
        return account;
    }

    // Setter for 'account'
    public void setAccount(Account account) {
        this.account = account;
    }

    // Getter for 'card'
    public Card getCard() {
        return card;
    }

    // Setter for 'card'
    public void setCard(Card card) {
        this.card = card;
    }

    // Getter for 'features'
    public List<Feature> getFeatures() {
        return features;
    }

    // Setter for 'features'
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    // Getter for 'news'
    public List<News> getNews() {
        return news;
    }

    // Setter for 'news'
    public void setNews(List<News> news) {
        this.news = news;
    }
}
