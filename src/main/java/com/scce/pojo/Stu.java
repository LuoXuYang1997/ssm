package com.scce.pojo;

/**
 * @program: IdeaProjects
 * @description: 实体类
 * @author: Lxy
 * @create: 2019-06-15 10:03
 **/
public class Stu {
    private Integer id;
    private String name;

    public Stu() {
    }

    public Stu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
