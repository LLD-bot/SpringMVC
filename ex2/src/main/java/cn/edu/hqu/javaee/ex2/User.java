package cn.edu.hqu.javaee.ex2;

import java.io.Serializable;
import lombok.Setter;
import lombok.Getter;
public class User implements Serializable {
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private Integer age;


}
