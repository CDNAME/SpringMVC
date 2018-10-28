package com.cd.beans;

import javax.validation.constraints.*;

public class Student {
    
    @NotNull(message="姓名不能为空")
    @Size(min=2, max=4, message="姓名长度应在{min}-{max}个字符")
    private String name;
    
    @Min(value=0, message="成绩不能小于{value}")
    @Max(value=100, message="成绩不能大于{value}")
    private double score;
    
    //手机号要求，数字，第一位是1，第二位是34578中的一个，后面9位数字
    @NotNull(message="电话不能为空")
    @Pattern(regexp="^1[34578]\\d{9}$", message="手机号格式不正确")
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
