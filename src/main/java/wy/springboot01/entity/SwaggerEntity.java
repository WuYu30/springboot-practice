package wy.springboot01.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ApiModel描述第一个实体类型，该类型如果成为任何一个生成api帮助文档方法的返回值类型，则该注解被解析
 */
@ApiModel(value = "自定义测试实体", description = "存储用户数据")
@Data
public class SwaggerEntity implements Serializable {
    //example用来添加示例，hidden描述该变量是否隐藏
    @ApiModelProperty(value = "主键", name = "主键id", required = false, example = "1", hidden = false)
    private String id;
    @ApiModelProperty(value = "姓名", name = "姓名name", required = false, example = "1", hidden = false)
    private String name;
    @ApiModelProperty(value = "密码", name = "密码password", required = false, example = "1", hidden = false)
    private String password;

    public SwaggerEntity(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SwaggerEntity that = (SwaggerEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password);
    }
}
