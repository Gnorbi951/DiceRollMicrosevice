package com.codecool.diceroll.diceroll.service;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DiceRollServiceTest {

    @Autowired
    private DiceRollService service;

    @RepeatedTest(50)
    public void rollD6() {
        int value = service.rollD6();
        // Cant find isBetween method
        assertTrue(value > 0);
        assertTrue(value < 7);
    }
}