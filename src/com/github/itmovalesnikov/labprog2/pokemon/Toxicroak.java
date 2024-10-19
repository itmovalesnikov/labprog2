package com.github.itmovalesnikov.labprog2.pokemon;

import com.github.itmovalesnikov.labprog2.attack.StoneEdge;

public final class Toxicroak extends Croagunk {
    public Toxicroak(String name, int level) {
        super(name, level);
        super.setStats(83, 106, 65, 86, 65, 85);
        super.addMove(new StoneEdge());
    }
}
