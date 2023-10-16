package homework_nr_12.FuelTypes;

public enum FuelTypes {
    GASOLINE_EURO, GASOLINE_ECTO, GASOLINE_ECTO_100, GASOIL_EURO, GASOIL_ECTO, LPG, CNG, ELECTRIC, ADBLUE,
    GASOLINE_EFIX, GASOIL_EFIX, GASOLINE_EFIX_98, GASOIL_EFIX_S55,
    GASOLINE_EXTRA_99, GASOIL_EXTRA;


    public boolean isLiquidFuel() {
        return this == GASOIL_EURO || this == GASOIL_ECTO || this == GASOIL_EFIX
                || this == GASOIL_EXTRA || this == GASOLINE_EFIX || this == GASOIL_EFIX_S55
                || this == GASOLINE_EURO || this == GASOLINE_EXTRA_99 || this == GASOLINE_ECTO
                || this == GASOLINE_ECTO_100 || this == GASOLINE_EFIX_98 || this == LPG
                || this == ADBLUE;
    }


}




