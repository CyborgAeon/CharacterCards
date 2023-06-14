package org.example;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/character")
public class CharacterController {
    @Autowired
    private CharacterRepository characterRepository;
    private AccountRepository accountRepository;

    @GetMapping
    public ResponseEntity<List<Integer>> getAllCharacterIds(Integer accountId) {
        List<Integer> characters = characterRepository.readAllByAccountId(accountId);
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable("id") Integer id) {
        Character character = characterRepository.readById(id);
        if (character != null) {
            return new ResponseEntity<>(character, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Character> createCharacter(@RequestBody Character character) {
        Character createdCharacter = characterRepository.update(character);
        return new ResponseEntity<>(createdCharacter, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Character> updateCharacter(@PathVariable("id") Integer id, @RequestBody Character character) {
        Character existingCharacter = characterRepository.readById(id);
        if (existingCharacter != null) {
            existingCharacter.setName(character.getName());
            // Update other fields as needed
            Character updatedCharacter = characterRepository.update(existingCharacter);
            return new ResponseEntity<>(updatedCharacter, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable("id") Integer id) {
        Character character = characterRepository.readById(id);
        if (character != null) {
            characterRepository.delete(character);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
