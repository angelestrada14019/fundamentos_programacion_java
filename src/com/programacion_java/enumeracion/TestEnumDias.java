package com.programacion_java.enumeracion;

public class TestEnumDias {

    public static void main(String[] args) {
        //System.out.println("dia 1: "+ EnumDias.LUNES);
        //indicarDiaSemana(EnumDias.JUEVES);
        System.out.println("continente # 4: "+ EnumContinente.AMERICA +", # paises: "+EnumContinente.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(EnumDias enumDias){
        switch (enumDias){
            case LUNES:
                System.out.println("primer dia de la semana");
                break;
            case MARTES:
                System.out.println("segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("cuarto dia de la semana");
                break;
        }
    }
}
