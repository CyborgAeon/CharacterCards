package org.example;

import java.util.Arrays;
import java.util.List;

public class CharacterRepository implements ICharacterRepository {

    @Override
    public Character create(Character character){
        return character;
    }

    @Override
    public Character readById(Integer characterId) {
        return new Character(characterId,"brad","human", "bard", new RolePlaySystem());
    }

    @Override
    public List<Integer> readAllByAccountId(Integer accountId) {
        return Arrays.asList(1, 2, 3);
    }

    @Override
    public Character update(Character character) {
        return character;
    }

    @Override
    public boolean delete(Character account) {return false;}
}
