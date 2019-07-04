package com.example.ssmdemo.model;

public class Political {

    private Long id;

    private int num;

    private int introduceNo;

    private String studentNo;

    private String name;

    private String sex;

    private String college;

    private String major;

    private int classNo;

    private String politicalAppearance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIntroduceNo() {
        return introduceNo;
    }

    public void setIntroduceNo(int introduceNo) {
        this.introduceNo = introduceNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getPoliticalAppearance() {
        return politicalAppearance;
    }

    public void setPoliticalAppearance(String politicalAppearance) {
        this.politicalAppearance = politicalAppearance;
    }

    @Override
    public String toString() {
        return "Political{" +
                "id=" + id +
                ", num=" + num +
                ", introduceNo=" + introduceNo +
                ", studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", classNo=" + classNo +
                ", politicalAppearance='" + politicalAppearance + '\'' +
                '}';
    }
}
