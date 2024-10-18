package com.github.itmovalesnikov.labprog2;

import com.github.itmovalesnikov.labprog2.pokemon.Croagunk;
import com.github.itmovalesnikov.labprog2.pokemon.Drampa;
import com.github.itmovalesnikov.labprog2.pokemon.Flygon;
import com.github.itmovalesnikov.labprog2.pokemon.Toxicroak;
import com.github.itmovalesnikov.labprog2.pokemon.Trapinch;
import com.github.itmovalesnikov.labprog2.pokemon.Vibrava;

import ru.ifmo.se.pokemon.Battle;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Croagunk("Croagunk", 0));
        b.addAlly(new Drampa("Drampa", 0));
        b.addAlly(new Flygon("Flygon", 0));
        b.addFoe(new Toxicroak("Toxicroak", 0));
        b.addFoe(new Trapinch("Trapinch", 0));
        b.addFoe(new Vibrava("Vibrava", 0));
        b.go();
    }
}

//javac -cp libs/Pokemon.jar -sourcepath src/ -d build/ src/com/github/itmovalesnikov/labprog2/Lab2.java
//cd build
//jar cve com.github.itmovalesnikov.labprog2.Lab2 * > ../Lab2.jar
//cd ..
//java -cp Lab2.jar:libs/Pokemon.jar com.github.itmovalesnikov.labprog2.Lab2