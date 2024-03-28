package zerobase.weather.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("날씨 일기 프로젝트 : ")
                        .description("날씨 일기를 CRUD 할 수 있는 백엔드 API입니다.")
                        .version("2.0")
                );
    }
}