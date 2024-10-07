package com.github.itmovalesnikov.labprog2;

import com.github.itmovalesnikov.labprog2.pokemon.Croagunk;
import com.github.itmovalesnikov.labprog2.pokemon.Drampa;

import ru.ifmo.se.pokemon.Battle;

class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        var p1 = new Croagunk("Чужой", 1);
        var p2 = new Drampa("Абырвалг", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
