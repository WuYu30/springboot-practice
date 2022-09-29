package wy.springboot01.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import wy.springboot01.anno.SwaggerAnnotation;
import wy.springboot01.entity.SwaggerEntity;

@RestController
@RequestMapping("/swagger")
//描述当前类型生成帮助文档的信息，tags属性可以定义别名（可以定义多个）
@Api(tags = {"MyController", "Swagger学习"})
public class SwaggerController {

    @RequestMapping("/testApiModel")
    public SwaggerEntity testApiModel(){
        return new SwaggerEntity();
    }

    @PostMapping("/post")
    @ApiOperation(value = "Post方法，用于新增数据", notes = "处理客户端post请求")
    //@ApiParam用于设置方法参数的描述信息，required表示该请求参数是否必要（默认为false）
    public String post(
            @ApiParam(name = "用户名", value = "新增用户时提供的用户名", required = true) String a,
            @ApiParam(name = "密码", value = "新增用户时提供的密码", required = true) String b){
        return "post";
    }

    @GetMapping("/get")
    /*@ApiImplicitParams(value = {
            @ApiImplicitParam(name = "m", value = "m参数描述", required = false, paramType = "字符串", dataType = "名值对"),
            @ApiImplicitParam(name = "n", value = "n参数描述", required = false, paramType = "字符串", dataType = "名值对")}
    )*/
    //@ApiIgnore
    public String get(String m, String n){
        return "get";
    }

    @SwaggerAnnotation
    @RequestMapping("/req")
    public String req(String m){
        return "req";
    }
}
