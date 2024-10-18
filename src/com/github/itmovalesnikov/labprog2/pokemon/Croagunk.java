package com.github.itmovalesnikov.labprog2.pokemon;

import com.github.itmovalesnikov.labprog2.attack.DarkPulse;
import com.github.itmovalesnikov.labprog2.attack.PoisonSting;
import com.github.itmovalesnikov.labprog2.attack.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Croagunk extends Pokemon {
    public Croagunk(String name, int level) {
        super(name, level);
        super.setStats(48, 61, 40, 61, 40, 50);
        super.setType(Type.POISON, Type.FIGHTING);
        super.setMove(
                new PoisonSting(),
                new WorkUp(),
                new DarkPulse());
    }
}
