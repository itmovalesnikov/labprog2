package com.github.itmovalesnikov.labprog2.attack;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Astonish extends PhysicalMove {
    public Astonish() {
        super(Type.GHOST, 30, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "Astonish";
    }
};