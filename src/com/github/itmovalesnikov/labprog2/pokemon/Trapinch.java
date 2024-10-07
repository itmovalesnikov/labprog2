package com.github.itmovalesnikov.labprog2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super(name, level);
        super.setStats(45, 100, 45, 45, 45, 10);
        super.setType(Type.GROUND);
    }
}
