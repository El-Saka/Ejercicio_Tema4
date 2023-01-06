package Switch;

public class main {

    public static void main(String[] args){
        var estacion = "PRIMAVERA";

        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("Estoy en Default");
        }

    }
}
