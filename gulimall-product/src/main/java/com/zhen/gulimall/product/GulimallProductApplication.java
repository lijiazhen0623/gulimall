package com.zhen.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 整合mybatis-plus
 *  1)导入依赖(公共的)：mysql驱动；mybatis-plus依赖
 *      <dependency>
 *          <groupId>com.baomidou</groupId>
 *          <artifactId>mybatis-plus-boot-starter</artifactId>
 *          <version>3.3.1</version>
 *      </dependency>
 *  2)在application.yml配置数据源相关信息
 *  3)配置mybatis-plus
 *      (1)使用注解@MapperScan("pers.zhen.gulimall.product.dao")
 *      (2)在application.yml配置告诉mybatis-plus sql映射
 *
 *
 *  JSR303
 *    1）、给Bean添加校验注解:javax.validation.constraints，并定义自己的message提示
 *    2)、开启校验功能@Valid
 *      效果：校验错误以后会有默认的响应；
 *    3）、给校验的bean后紧跟一个BindingResult，就可以获取到校验的结果
 *    4）、分组校验（多场景的复杂校验）
 *          1)、	@NotBlank(message = "品牌名必须提交",groups = {AddGroup.class,UpdateGroup.class})
 *           给校验注解标注什么情况需要进行校验
 *          2）、@Validated({AddGroup.class})
 *          3)、默认没有指定分组的校验注解@NotBlank，在分组校验情况@Validated({AddGroup.class})下不生效，只会在@Validated生效
 *    5）、自定义校验
 *       1）、编写一个自定义的校验注解
 *       2）、编写一个自定义的校验器 ConstraintValidator
 *       3）、关联自定义的校验器和自定义的校验注解
 *           @Documented
 *           @Constraint(validatedBy = { ListValueConstraintValidator.class【可以指定多个不同的校验器，适配不同类型的校验】 })
 *           @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
 *           @Retention(RUNTIME)
 *           public @interface ListValue {
 *
 *  统一的异常处理
 *   @ControllerAdvice
 *    1）、编写异常处理类，使用@ControllerAdvice。
 *    2）、使用@ExceptionHandler标注方法可以处理的异常。
 *
 */
@EnableFeignClients("com.zhen.gulimall.product.feign")
@MapperScan("com.zhen.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
