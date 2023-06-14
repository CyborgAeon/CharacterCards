package org.example;

import java.util.Arrays;
import java.util.List;

public interface ICharacterRepository extends IRepository<Character, Integer> {

    // Add specific methods for CharacterRepository here
    List<Integer> readAllByAccountId(Integer accountId);
}
