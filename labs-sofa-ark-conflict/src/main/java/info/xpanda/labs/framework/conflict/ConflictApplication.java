package info.xpanda.labs.framework.conflict;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Paul Jiang
 * @since 20200203
 */
@ImportResource({ "classpath*:META-INF/spring/service.xml" })
@SpringBootApplication
public class ConflictApplication {
    public static void main(String[] args) {
        SofaArkBootstrap.launch(args);
        SpringApplication.run(ConflictApplication.class, args);
    }
}
