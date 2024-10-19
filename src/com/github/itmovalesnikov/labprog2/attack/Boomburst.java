package com.github.itmovalesnikov.labprog2.attack;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Boomburst extends SpecialMove {
    public Boomburst() {
        super(Type.NORMAL, 140, 100);
    }

    @Override
    protected String describe() {
        return "Boomburst";
    }
};