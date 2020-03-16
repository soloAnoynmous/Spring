import com.tutorial.repository.SpeakerRepository;
import com.tutorial.repository.SpeakerRepositoryImpl;
import com.tutorial.service.SpeakerService;
import com.tutorial.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new SpeakerRepositoryImpl();
    }
}
