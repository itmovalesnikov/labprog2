package com.github.itmovalesnikov.labprog2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Pokemon {
    public Vibrava(String name, int level) {
        super(name, level);
        super.setStats(50, 70, 50, 50, 50, 70);
        super.setType(Type.GROUND);
    }
}
