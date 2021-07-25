package class101.foo.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // 이게 있어야 @Scheduled를 사용 가능함
@SpringBootApplication
public class IoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoApplication.class, args);
	}

}
