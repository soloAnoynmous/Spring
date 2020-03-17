import com.tutorial.repository.SpeakerRepository;
import com.tutorial.repository.SpeakerRepositoryImpl;
import com.tutorial.service.SpeakerService;
import com.tutorial.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.tutorial"})
public class AppConfig {

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        return service;
//    }
//
//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository() {
//        return new SpeakerRepositoryImpl();
//    }
}
