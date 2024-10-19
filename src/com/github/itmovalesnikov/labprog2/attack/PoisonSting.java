package com.github.itmovalesnikov.labprog2.attack;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class PoisonSting extends PhysicalMove {
    public PoisonSting() {
        super(Type.POISON, 15, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "PoisonSting";
    }
};