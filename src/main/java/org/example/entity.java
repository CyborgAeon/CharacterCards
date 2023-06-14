package org.example;

public class entity {
    private Integer id;
    private String name;
    private String description;

    private EntityTypeEnum type;

    public entity(Integer id, String name, String description, EntityTypeEnum type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public EntityTypeEnum getType() {
        return type;
    }

    public void setType(EntityTypeEnum type) {
        this.type = type;
    }
}
