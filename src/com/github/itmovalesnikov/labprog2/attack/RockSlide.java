package com.github.itmovalesnikov.labprog2.attack;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.flinch(p);;
        }
    }

    @Override
    protected String describe() {
        return "RockSlide";
    }
};