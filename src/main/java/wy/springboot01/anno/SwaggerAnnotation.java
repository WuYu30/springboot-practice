package wy.springboot01.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @interface表示当前类是一个注解
 * @Target当前注解可以描述什么，ElementType是一个枚举类型
 * @Retention当前注解在什么时候运行
 */

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SwaggerAnnotation {
    //自定义注解中的属性，相当于默认的@SwaggerAnnotation（value = ”“）
    String value() default "";
}