package com.github.itmovalesnikov.labprog2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Pokemon {
    public Flygon(String name, int level) {
        super(name, level);
        super.setStats(80, 100, 80, 80, 80, 100);
        super.setType(Type.GROUND);
    }
}
