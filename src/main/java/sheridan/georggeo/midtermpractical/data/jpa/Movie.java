package sheridan.georggeo.midtermpractical.data.jpa;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;

    private String name = "";

    @Column(name = "movie_kind")
    private String movieKind = "";

    private Integer genre;

    private String image = null;

    @ManyToOne
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor = null;

    @JsonGetter
    Integer getOwnerId(){
        return actor.getId();
    }

    public Movie(String name, String movieKind, Integer genre, String image) {
        this.name = name;
        this.movieKind = movieKind;
        this.genre = genre;
        this.image = image;
    }

    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtKind() {
        return movieKind;
    }

    public void setArtKind(String movieKind) {
        this.movieKind = movieKind;
    }

    public Integer getAge() {
        return genre;
    }

    public void setAge(Integer genre) {
        this.genre = genre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Actor getOwner() {
        return actor;
    }

    public void setOwner(Actor actor) {
        this.actor = actor;
    }
}