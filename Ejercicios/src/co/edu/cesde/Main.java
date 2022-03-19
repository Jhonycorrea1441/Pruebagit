package co.edu.cesde;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner inputData = new Scanner(System.in) ;
        int personas;
        int i;
        int ch = 0, cp = 0, cs = 0, cc = 0;
        int plato=0;
        int valorh, valorp, valors, valorc,  servicio = 0;
        double descuento10, valorneto=0, valorpropina, valorapagar = 0, valorTotal;


        System.out.println("Cuantas personas son?:");
        personas = inputData.nextInt();

            for(i = 1; i <= personas;) {
                i = i + 1;

                System.out.println("Que plato desea ordenar?:");
                System.out.println(" 1---  Hamburguesa:");
                System.out.println(" 2---  Perros:");
                System.out.println(" 3---  Salchipapas:");
                System.out.println(" 4---  chorizos:");
                plato = inputData.nextInt();


                if (plato == 1) {
                    ch = ch + 1;
                } else {
                    if (plato == 2) {
                        cp = cp + 1;
                    } else {
                        if (plato == 3) {
                            cs = cs + 1;
                        } else if (plato == 4) {
                            cc = cc + 1;
                        }
                    }
                }

            }

                System.out.println("Total platos pedidos");
                System.out.println("hamburguesas " + ch );
                System.out.println("Perros " + cp );
                System.out.println("Salchipapas " + cs );
                System.out.println("Chorizos " + cc );

                valorh = ch * 10000;
                valorp = cp * 8000;
                valors = cs * 6000;
                valorc = cc * 7000;

                valorTotal = valorh + valorp + valors + valorc;


                if (valorTotal > 20000) {
                    descuento10 = valorTotal * 0.10;
                    valorneto = valorTotal - descuento10;


                    System.out.println("Estimado cliente su compra superó los $20.000");
                    System.out.println("valor anterior: $ " + valorTotal);
                    System.out.println("valor con descuento del 10%: $ " + valorneto);
                }

                else {
                    System.out.println("El valor valor a cancelar es de:" + valorTotal);
                }


        System.out.println("Desea incluir el servicio?: 1 (Sí)  2(No)");
        servicio = inputData.nextInt();

        if (servicio ==1){

            valorpropina = valorTotal * 0.10;
            valorapagar = valorTotal + valorpropina;

            System.out.println("Muchas gracias por su propina el valor a cancelar es:" + valorapagar );
        }

        else {
            System.out.println("TOTAL A PAGAR: $" + valorneto);
        }

    }
}
