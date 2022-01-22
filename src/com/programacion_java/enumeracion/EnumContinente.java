package com.programacion_java.enumeracion;

public enum EnumContinente {//se crean elementos, estos mismos pueden tener atributos
    // como en el caso de paises, parta seguir agregando mas atributos, estos se le pasan
    // como argumentos tanto al elemento como al constructor
    AFRICA(53,"# habitantes"),
    EUROPA(46,"# habitantes"),
    ASIA(44,"# habitantes"),
    AMERICA(34,"# habitantes"),
    OCEANIA(14,"# habitantes");

    private final int paises;
    private final String habitantes;

    EnumContinente(int paises,String habitantes) {
        this.paises=paises;
        this.habitantes=habitantes;
    }

    public int getPaises() {
        return paises;
    }

    public String getHabitantes() {
        return habitantes;
    }
}
