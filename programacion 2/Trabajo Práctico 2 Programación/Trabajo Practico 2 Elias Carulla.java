package holamundo;

import java.util.Scanner;

public class pruebas {
    
 static double DESCUENTO_ESPECIAL=0.1;
 
    public static void main(String[] args) {
        
        //Ejercicio 1
        Scanner sc = new Scanner(System.in);
        int anio = 0;
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(sc.nextLine());
        if (anio % 400 == 0 || ((anio % 4 == 0) && (anio % 100 != 0))) {
            System.out.println("es bisiesto");

        } else {
            System.out.println("no es bisiesto");
        }
        
        //Ejercicio 2
        int n1,n2,n3 = 0;
        System.out.print("Ingrese el primer numero: ");
        n1=Integer.parseInt(sc.nextLine());
         System.out.print("Ingrese el segundo numero: ");
        n2=Integer.parseInt(sc.nextLine());
         System.out.print("Ingrese el tercer numero: ");
        n3=Integer.parseInt(sc.nextLine());
        
        if(n1>n2 && n1>n3){
            System.out.println(n1+" Es el mayor");
        }else if (n2>n1 && n2>n3){
            System.out.println(n2+" Es el mayor");
        }else{
            System.out.println(n3+" Es el mayor");
        }
        
       //Ejercicio 3
       int edad=0;
        String etapa="";
        System.out.print("Ingrese tu edad: ");
        edad=Integer.parseInt(sc.nextLine());
        if (edad<12) {
            etapa="niño";
        }else if(edad>=12 && edad<=17){
            etapa="adolescente";
        }else if(edad>=18 && edad<=59){
            etapa="adulto";
        }else if(edad>=60){
            etapa="adulto mayor";
        }
        System.out.println("eres un "+etapa);
        
        //Ejercicio 4
        double precio, precioDescuento=0;
        String categoria;
        System.out.print("Ingrese el precio del producto: ");  
        precio=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la categoria del producto: ");  
        categoria=sc.nextLine();
        switch (categoria) {
            case "A":
                precioDescuento=precio*0.9;
                break;
            case "B":
                precioDescuento=precio*0.85;
                break;
            case "C":
                precioDescuento=precio*0.8;
                break;
            default:
                System.out.println("Categoria Invalida");
        }
        System.out.println("Precio original: "+precio+"\nCategoria: "+categoria+"\nPrecio con descuento: "+precioDescuento);
        
        //Ejercicio 5
        int numero, suma=0;
        do {
            System.out.print("Ingrese un numero par (0 para termianr): ");
            numero=Integer.parseInt(sc.nextLine());
            if(numero%2==0){
                suma+=numero;
            }
        } while (numero!=0);
        System.out.println("la suma de numeros pares es: "+suma);
        //Ejercicio 6
        int num, positivos=0,negativos=0,ceros=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero "+(i+1)+": ");
            num=Integer.parseInt(sc.nextLine());
            if (num<0) {
                negativos++;
            }else if (num>0) {
                positivos++;
            }else{
                ceros++;
            }
        }
        System.out.println("Positivos: "+positivos+"\nNegativos: "+negativos+"\nCeros: "+ceros);
        
        //Ejercicio 7
        
          int nota=0;
        System.out.print("Ingrese su nota(0-10): ");
        nota=Integer.parseInt(sc.nextLine());
        if (nota<0 || nota>10) {
            System.out.println("Nota ingresada no valida");
        }else{
            System.out.println("Nota guardada correctamente");
        }
        
        //Ejercicio 8
        double precioFinal=0,impuesto=0, descuento=0, precioBase=0;
        System.out.print("Ingrese el precio base del producto: ");
        precioBase=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje: ");
        impuesto=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el descuento en porcentaje: ");
        descuento=Integer.parseInt(sc.nextLine());
        precioFinal=calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.print("El precio final del producto es: "+ precioFinal);
        
        //Ejercicio 9
        
        double peso,precio9=0,precioFinal9=0, costoEnvio;
        String zona;
        
        System.out.print("Ingrese el precio del paquete: ");
        precio=Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el peso del paquete: ");
        peso=Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese la zona (nacional o internacional): ");
        zona=sc.nextLine();
        costoEnvio=calcularCostoEnvio(peso, zona);
        precioFinal=calcularTotalCompra(precio9, costoEnvio);
        System.out.println("El costo de envio es: "+costoEnvio+"\nEl total a pagar es: "+precioFinal9);
        
        //Ejercicio 10
        int stockActual,cantVendida=0,cantRecibida=0;
        
        System.out.print("Ingrese el stock actual: ");
        stockActual=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        cantVendida=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la cant recibida: ");
        cantRecibida=Integer.parseInt(sc.nextLine());
        
        stockActual=actualizarStock(stockActual, cantVendida, cantRecibida);
        
        System.out.println("El nuevo stock del producto es: "+stockActual);
        
        //Ejercicio 11
        
         double precio11;
        System.out.print("Ingrese precio: ");
        precio11=Double.parseDouble(sc.nextLine()); 
        calcularDescuentoAplicado(precio11);
        
        //Ejercicio 12
         double[] precios={199.99, 299.5, 149.75, 399, 89.99};
        
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio N"+(i+1)+": $"+precios[i]);
        }
        precios[2]=129.99;
        System.out.println("Precios modificados:");
         for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio N"+(i+1)+": $"+precios[i]);
        }
         
         //Ejercicio 13
         double[] precios13={199.99, 299.5, 149.75, 399, 89.99};
        
        mostrarArray(precios13, 0);
        precios13[2]=129.99;
        System.out.println("Precios modificados:");
         mostrarArray(precios13, 0);
    }
    
    
    //metodos utilizados
    
    public static void mostrarArray(double[] precio, int indice){
        if (indice>=precio.length){
            return;
        }
        System.out.println("Precio N"+(indice+1)+": "+precio[indice]);
        mostrarArray(precio, indice+1);
    }
    
     public static void calcularDescuentoAplicado(double precio){
       double precioFinal;
       precioFinal=precio-(precio*DESCUENTO_ESPECIAL);
       System.out.println("El descuento aplicado es de: "+(precio*DESCUENTO_ESPECIAL));
       System.out.println("El precio final con descuento es de : "+precioFinal);
   }
    
    
    private static int actualizarStock(int stockActual, int cantVendida, int cantRecibida) {
        int nuevoStock=0;
        nuevoStock = stockActual - cantVendida + cantRecibida;
        return nuevoStock;
    }
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal;
        precioFinal = precioBase + (precioBase*(impuesto/100)) - (precioBase*(descuento/100));
        return precioFinal;
    }
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio=0;
        if (zona.equalsIgnoreCase("nacional")){
            costoEnvio=peso*5;
        }else if (zona.equalsIgnoreCase("internacional")) {
            costoEnvio=peso*10;
        }
        return costoEnvio;
    }
    public static double calcularTotalCompra(double precioProducto, double
costoEnvio){
        double precioFinal;
        precioFinal=precioProducto + costoEnvio;
        return precioFinal;
    }
}
