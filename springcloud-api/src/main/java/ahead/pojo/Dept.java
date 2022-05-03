package ahead.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Dept 实体类  orm 类表关系映射
 */
@Data
@NoArgsConstructor  // 无参构造方法
@Accessors(chain = true) // 开启链式写法（chain默认为false）
public class Dept implements Serializable {

    private static final long serialVersionUID = 6199587247296529582L;

    /**
     * 主键
     */
    private int deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 这个数据存在哪个数据库的字段~微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
     */
    private String dbSource;


    // 设置一个有参构造方法（编号自增不需要，数据来源直接用函数，也不需要）
    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
