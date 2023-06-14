package org.example;

import java.util.List;

public class Account {
    public Account(Integer id, String emailAddress, String password, List<Integer> characterIds) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.password = password;
        this.characterIds = characterIds;
    }

    private Integer id;
    private String emailAddress;
    private String password;
    private List<Integer> characterIds;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getCharacterIds() { return characterIds; }

    public void setCharacterIds(List<Integer> characters) { this.characterIds = characterIds; }
}
