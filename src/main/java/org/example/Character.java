package org.example;

public class Character {
    private Integer id;
    private String name;
    private String race;
    private String characterClass;
    private RolePlaySystem rolePlaySystem;

    public Character(Integer id, String name, String race, String characterClass, RolePlaySystem rolePlaySystem) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.rolePlaySystem = rolePlaySystem;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public RolePlaySystem getRolePlaySystem() {
        return rolePlaySystem;
    }

    public void setRolePlaySystem(RolePlaySystem rolePlaySystem) {
        this.rolePlaySystem = rolePlaySystem;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
