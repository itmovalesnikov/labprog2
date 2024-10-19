package com.github.itmovalesnikov.labprog2.pokemon;

import com.github.itmovalesnikov.labprog2.attack.SonicBoom;

public final class Flygon extends Vibrava {
    public Flygon(String name, int level) {
        super(name, level);
        super.setStats(80, 100, 80, 80, 80, 100);
        super.addMove(new SonicBoom());
    }
}
