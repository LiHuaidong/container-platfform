package hdli.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: 声明接口是否需要登录
 *
 * @author: hendrix.li
 * @date: 2025/9/25 15:01
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NeedLogin {

    /**
     * 是否必须登录（默认true）
     */
    boolean required() default true;

}
