package com.github.itmovalesnikov.labprog2.pokemon;

import com.github.itmovalesnikov.labprog2.attack.Boomburst;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Trapinch {
    public Vibrava(String name, int level) {
        super(name, level);
        super.setStats(50, 70, 50, 50, 50, 70);
        super.addType(Type.DRAGON);
        super.addMove(new Boomburst());
    }
}
