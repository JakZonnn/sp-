package pers.niaonao.jdbcproject.entity;

import lombok.Data;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/6/28 17:48
 * 用户实体类
 */
@Data
public class SkrUser {
    private String userId;
    private String userNickName;
    private String userRealName;
    private String userPhone;
    private String userAddress;
    private String userPassword;
    private String userCard;
    private int userGender = -1;


}
