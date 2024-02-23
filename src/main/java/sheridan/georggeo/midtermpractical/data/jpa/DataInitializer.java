package sheridan.georggeo.midtermpractical.data.jpa;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
@Service
public class DataInitializer {
    private final ActorRepository actorRepository;

    public DataInitializer(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @PostConstruct
    public void init(){

        Actor patricia = new Actor("Max", "Revier");
        patricia.addMovie(new Movie("Charlie", "emoji", 2003));
        patricia.addMovie(new Movie("Max", "cross", 2002));
        patricia.addMovie(new Movie("Animals", "animal", 2002));
        patricia.addMovie(new Movie("Marx", "painting", 2001));
        actorRepository.save(patricia);

        Actor lisa = new Actor("Lars", "Anderson");
        lisa.addMovie(new Movie("Cathedral", "cathedral", 2006));
        lisa.addMovie(new Movie("Animals", "animal", 2002));
        lisa.addMovie(new Movie("Marx", "painting", 2001));
        actorRepository.save(lisa);

        Actor kimberly = new Actor("Kimberly", "Green");
        actorRepository.save(kimberly);

        Actor brenda = new Actor("Victor", "Chevalier");
        brenda.addMovie(new Movie("Emoji", "emoji", 2003));
        brenda.addMovie(new Movie("Farmer with a Shotgun", "farmer", 2005));
        brenda.addMovie(new Movie("Animals", "animal", 2002));
        brenda.addMovie(new Movie("Marx", "painting", 2001));

        actorRepository.save(brenda);

        actorRepository.flush();
    }
}
