package com.github.itmovalesnikov.labprog2.pokemon;

import com.github.itmovalesnikov.labprog2.attack.Astonish;
import com.github.itmovalesnikov.labprog2.attack.Confide;
import com.github.itmovalesnikov.labprog2.attack.Scald;
import com.github.itmovalesnikov.labprog2.attack.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Drampa extends Pokemon {
    public Drampa(String name, int level) {
        super(name, level);
        super.setStats(78, 60, 85, 135, 91, 36);
        super.setType(Type.NORMAL, Type.DRAGON);
        super.setMove(
                new Astonish(),
                new Confide(),
                new Scald(),
                new SwordsDance());
    }
}
