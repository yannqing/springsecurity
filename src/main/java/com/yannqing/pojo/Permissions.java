package com.yannqing.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permissions {
    private Integer id;
    private Integer pid;
    private Integer type;
    private String name;
    private String code;
}