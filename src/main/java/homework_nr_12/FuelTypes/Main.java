package homework_nr_12.FuelTypes;


public class Main {
    public static void main(String[] args) {

        // First method
        FuelTypes fuelType1 = FuelTypes.GASOLINE_EURO;
        FuelTypes fuelType2 = FuelTypes.ELECTRIC;
        FuelTypes fuelType3 = FuelTypes.CNG;

        System.out.println("Is Gasoline Euro is liquid: " + fuelType1.isLiquidFuel());
        System.out.println("Is Electric is liquid: " + fuelType2.isLiquidFuel());
        System.out.println("Is CNG is liquid: " + fuelType3.isLiquidFuel());
        System.out.println("_____________________________________________________");

        // Second method by using Array and for-each
        FuelTypes[] fuelTypesArray = FuelTypes.values();
        for (FuelTypes fuelType : fuelTypesArray) {
            System.out.println("Is " + fuelType + " is liquid: " + fuelType.isLiquidFuel());

        }

        System.out.println("_____________________________________________________");


    }


}




