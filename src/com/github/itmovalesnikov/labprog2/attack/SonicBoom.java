package com.github.itmovalesnikov.labprog2.attack;

import java.util.Arrays;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SonicBoom extends SpecialMove {
    public SonicBoom() {
        super(Type.WATER, 0, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        var types = Arrays.asList(p.getTypes());
        if (!types.contains(Type.GHOST)) {
            p.setMod(Stat.HP, 20);
        }
    }

    @Override
    protected String describe() {
        return "SonicBoom";
    }
};