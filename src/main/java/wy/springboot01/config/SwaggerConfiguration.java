package wy.springboot01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    //创建docket类型的对象，并用spring容器管理；docket是swagger中的全局配置对象，相当于上下文，其参数是告诉docket要基于哪一个对象来创建
    @Bean
    public Docket docket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        //contact创建上下文（文档名称、请求路径地址，email），配置swagger文档主题内容，apiinfo是api帮助文档的描述信息
        ApiInfo apiInfo = new ApiInfoBuilder()
                .contact(new Contact("wuyu_silence","https://xueshu.baidu.com/","wuyu30@chinatelecom.cn"))
                .title("Swagger框架学习帮助文档")
                .description("一个用于本人学习swagger与java的帮助文档'")
                .version("v1.1")
                .build();
        docket.apiInfo(apiInfo);
        //如果想继续加配置，只需要：
        docket.select()//获取docket中的选择器返回ApiSelectorBuilder，如：扫描哪一个包的注解
                .apis(RequestHandlerSelectors.basePackage("wy.springboot01.controller"));//ApiSelectorBuilder中的方法，提取其中的规则（比如扫描哪些包），这里扫描控制器所在的包
        return docket;
    }
}
