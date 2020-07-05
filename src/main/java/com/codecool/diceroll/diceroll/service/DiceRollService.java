package com.codecool.diceroll.diceroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DiceRollService {

    @Autowired
    private Random random;
}
