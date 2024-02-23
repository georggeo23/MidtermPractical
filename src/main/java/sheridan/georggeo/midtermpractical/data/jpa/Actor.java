package sheridan.georggeo.midtermpractical.data.jpa;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie_actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;

    @Column(name = "first_name")
    private String firstName = "";

    @Column(name = "last_name")
    private String lastName = "";

    @ManyToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)
    private List<Movie> arts = new ArrayList<>();

    public Actor() {
    }

    public Actor(
            String firstName,
            String lastName
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Movie> getArts() {
        return arts;
    }

    public void setArts(List<Movie> arts) {
        this.arts = arts;
    }
    @JsonGetter
    Integer getArtCount(){
        return arts.size();
    }

    public void addArt(Movie art){
        art.setOwner(this);
        arts.add(art);
    }
}
