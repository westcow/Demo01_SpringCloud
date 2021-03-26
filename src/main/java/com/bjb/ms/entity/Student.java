package com.bjb.ms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer sId;
    private String studentName;
    private String password;
}
