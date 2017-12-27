package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final Rol rol;
    private final int burgers;
    private final Sauce sauce;

    private final List<Ingrediets> ingrediets;

    public Bigmac(Rol rol, int burgers, Sauce sauce, List<Ingrediets> ingrediets) {
        this.rol = rol;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingrediets = ingrediets;
    }

    public static class BigmacBuilder {
        private Rol rol;
        private int burgers;
        private Sauce sauce;
        private List<Ingrediets> ingredients = new ArrayList<>();

        public BigmacBuilder roll(Rol rol) {
            this.rol = rol;
            return this;
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce (Sauce sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredient (Ingrediets ingredient){
            this.ingredients.add(ingredient);
            return this;
        }
        public Bigmac build() {
            return new Bigmac(rol,burgers,sauce,ingredients);
        }
    }

    public Rol getRol() {
        return rol;
    }


    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingrediets> getIngrediets() {
        return ingrediets;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + rol + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingrediets +
                '}';
    }
}
