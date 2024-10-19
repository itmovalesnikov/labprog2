package com.github.itmovalesnikov.labprog2.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class WorkUp extends StatusMove {
    public WorkUp() {
        this.type = Type.NORMAL;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "WorkUp";
    }
}