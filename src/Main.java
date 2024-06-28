import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Conver conver = new Conver();
            Scanner entrada = new Scanner(System.in);
            int option;

            do {
                System.out.println("Conversor de monedas");
                System.out.println("1- Convertir USD a otra moneda");
                System.out.println("2- Convertir de otra moneda a USD");
                System.out.println("3- Salir");
                System.out.print("Ingrese la opción: ");
                option = entrada.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Elija la moneda a la que desea convertir:");
                        System.out.println("1- ARS (Peso Argentino)");
                        System.out.println("2- BOB (Peso Boliviano)");
                        System.out.println("3- BRL (Real Brasileño)");
                        System.out.println("4- CLP (Peso Chileno)");
                        int currencyOption = entrada.nextInt();
                        String targetCurrency = "";
                        double exchangeRate = 0.0;

                        switch (currencyOption) {
                            case 1:
                                targetCurrency = "ARS";
                                break;
                            case 2:
                                targetCurrency = "BOB";
                                break;
                            case 3:
                                targetCurrency = "BRL";
                                break;
                            case 4:
                                targetCurrency = "CLP";
                                break;
                            default:
                                System.out.println("Opción no válida");
                                continue;
                        }

                        exchangeRate = conver.converCurrency("USD", targetCurrency);
                        System.out.println("Ingresar el monto en USD que desea convertir:");
                        System.out.println( "El valor Actual es : " + exchangeRate);
                        System.out.println("--------------------------------------------------------------");
                        double amountUSD = entrada.nextDouble();
                        double amountConverted = amountUSD * exchangeRate;
                        System.out.printf("El valor convertido a %s es: %.2f %s%n", targetCurrency, amountConverted, targetCurrency);
                        System.out.println("--------------------------------------------------------------");
                        break;

                    case 2:
                        System.out.println("Elija la moneda desde la que desea convertir:");
                        System.out.println("1- ARS (Peso Argentino)");
                        System.out.println("2- BOB (Peso Boliviano)");
                        System.out.println("3- BRL (Real Brasileño)");
                        System.out.println("4- CLP (Peso Chileno)");
                        int fromCurrencyOption = entrada.nextInt();
                        String baseCurrency = "";

                        switch (fromCurrencyOption) {
                            case 1:
                                baseCurrency = "ARS";
                                break;
                            case 2:
                                baseCurrency = "BOB";
                                break;
                            case 3:
                                baseCurrency = "BRL";
                                break;
                            case 4:
                                baseCurrency = "CLP";
                                break;
                            default:
                                System.out.println("Opción no válida");
                                continue;
                        }

                        exchangeRate = conver.converCurrency("USD", baseCurrency);
                        System.out.println("Ingresar el monto en " + baseCurrency + " que desea convertir a USD:");
                        System.out.println( "El valor Actual es : " + exchangeRate);
                        System.out.println("--------------------------------------------------------------");
                        double amountBaseCurrency = entrada.nextDouble();
                        double amountUSDConverted = amountBaseCurrency / exchangeRate;
                        System.out.println(amountUSDConverted);
                        System.out.printf("El valor convertido a USD es: %.2f USD%n", amountUSDConverted);
                        System.out.println("--------------------------------------------------------------");
                        break;

                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor ingrese una opción válida.");
                }
            } while (option != 3);
        }
}
