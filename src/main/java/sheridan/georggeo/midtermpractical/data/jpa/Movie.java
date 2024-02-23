package sheridan.georggeo.midtermpractical.data.jpa;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;

    private String name = "";

    @Column(name = "movie_kind")
    private String movieKind = "";

    private Integer rel_year;
    @ManyToMany(mappedBy = "movies")
    private Actor actor = null;

    @JsonGetter
    Integer getOwnerId(){
        return actor.getId();
    }

    public Movie(String name, String movieKind, Integer rel_year) {
        this.name = name;
        this.movieKind = movieKind;
        this.rel_year = rel_year;
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

    public Integer getYear() {
        return rel_year;
    }

    public void setYear(Integer rel_year) {
        this.rel_year = rel_year;
    }

    public Actor getActor() {
        return actor;
    }

    public void setOwner(Actor actor) {
        this.actor = actor;
    }
}