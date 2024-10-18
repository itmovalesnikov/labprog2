package com.github.itmovalesnikov.labprog2.pokemon;

import com.github.itmovalesnikov.labprog2.attack.DarkPulse;
import com.github.itmovalesnikov.labprog2.attack.PoisonSting;
import com.github.itmovalesnikov.labprog2.attack.StoneEdge;
import com.github.itmovalesnikov.labprog2.attack.WorkUp;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Toxicroak extends Pokemon {
    public Toxicroak(String name, int level) {
        super(name, level);
        super.setStats(83, 106, 65, 86, 65, 85);
        super.setType(Type.POISON, Type.FIGHTING);
        super.setMove(
                new PoisonSting(),
                new WorkUp(),
                new DarkPulse(),
                new StoneEdge());
    }
}
