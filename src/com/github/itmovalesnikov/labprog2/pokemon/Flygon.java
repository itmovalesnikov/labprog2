package com.github.itmovalesnikov.labprog2.pokemon;

import com.github.itmovalesnikov.labprog2.attack.Boomburst;
import com.github.itmovalesnikov.labprog2.attack.RockSlide;
import com.github.itmovalesnikov.labprog2.attack.RockTomb;
import com.github.itmovalesnikov.labprog2.attack.SonicBoom;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Pokemon {
    public Flygon(String name, int level) {
        super(name, level);
        super.setStats(80, 100, 80, 80, 80, 100);
        super.setType(Type.GROUND, Type.DRAGON);
                super.setMove(
                new RockSlide(),
                new RockTomb(),
                new SonicBoom(),
                new Boomburst());
    }
}

//javac -cp libs/Pokemon.jar -sourcepath src/ -d build/com/github/itmovalesnikov/labprog2/ src/com/github/itmovalesnikov/labprog2/Lab2.java 
