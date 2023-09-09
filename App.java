import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

    byte elegir;

    int cantidadLados = 0;

    double altura = 0, radio = 0, areaBase, longitudLados = 0, apotema, generatriz, Area = 0, Volumen = 0;

    double perimetroBase, areaLateral, areaTotal = 0, volumen, base = 0, Radio = 0;

    double Areazonaesferica, Volumenzonaesferica, radiosuperior = 0, Areacasqueteesferico, volumencasqueteesferico;

    double radiomenor = 0, Radiomayor = 0, perimetrosuperior = 0, perimetroinferior = 0, ladobasesuperior = 0,
        ladobaseinferior = 0;

    double angulo = 0, longitud = 0, profundidad = 0, Diagonal, arista = 0, Areadelacara;

    int intentosMaximo1;

    System.out.println("El día de hoy se realizará un menú");

    System.out.println("Se le dará a escoger qué figura geométrica desea efectuar con operaciones");

    System.out.println("::::::::::::::::::::::::::::::::::::::");

    System.out.println("1) Cilindro ");

    System.out.println("2)Prisma");

    System.out.println("3)Piramide");

    System.out.println("4)Cono");

    System.out.println("5)Esfera");

    System.out.println("6)Zona esferica");

    System.out.println("7)Casquete Esferico");

    System.out.println("8) Tronco de cono");

    System.out.println("9)Troco Piramide");

    System.out.println("10)Huso Esferico");

    System.out.println("11)Ortoedro");

    System.out.println("12)Tetraedro");

    System.out.println("13)Hexaedro");

    System.out.println("14)Octaedro");

    System.out.println("15)Dodecaedro");

    System.out.println("16)Icosaedro");

    System.out.println("17)Fin");

    elegir = lector.nextByte();

    switch (elegir) {
      case 1:

        System.out.println("Se necesita la altura y el radio");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.println("¿Cuál es la altura del cilindro?");
          altura = lector.nextDouble();

          if (altura < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;

          }

        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.println("¿Cuál es el radio del cilindro?");
          radio = lector.nextDouble();

          if (radio < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {

          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          perimetroBase = (2 * Math.PI) * radio;

          areaLateral = perimetroBase * altura;

          areaBase = Math.PI * Math.pow(radio, 2);

          areaTotal = 2 * areaBase + areaLateral;

          volumen = areaBase * altura;

          System.out.println("El área lateral de un cilindro es " + areaLateral);

          System.out.println("Area total:" + areaTotal + " centimetro cuadrado.");

          System.out.println("Volumen:" + volumen + "  centimetro al cubo.");

        }

        break;

      case 2:

        System.out.println("Se necesita la cantidad de lados,Altura,Logitud de lados");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Cantidad de lados: ");
          cantidadLados = lector.nextInt();

          if (cantidadLados < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;

          }

        }

        if (intentosMaximo1 == 3) {

          System.out.println("Demasiados intentos fallidos");

          break;

        }

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Altura: ");
          altura = lector.nextDouble();

          if (altura < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }

        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Longitud de los lados: ");
          longitudLados = lector.nextDouble();

          if (longitudLados < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;
        } else {

          perimetroBase = cantidadLados * longitudLados;

          areaLateral = perimetroBase * altura;

          double alfa = (Math.PI / 180) * (360 / cantidadLados);

          apotema = longitudLados / (2 * Math.tan((alfa) / 2));

          areaBase = (perimetroBase * apotema) / 2;

          areaTotal = areaLateral + 2 * areaBase;

          volumen = areaBase * altura;

          System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");

          System.out.println("Area total: " + areaTotal + " unidades cuadradas.");

          System.out.println("Volumen: " + volumen + " unidades cubicas.");

        }
        break;

      case 3:
        System.out.println("Se necisita base y altura");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la  base de la piramide: ");
          base = lector.nextDouble();

          if (base < 0.1) {

            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");
          break;
        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite altura de la piramide");
          altura = lector.nextDouble();

          if (altura < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));

          areaLateral = 4 * base * altura / 2;

          areaBase = Math.pow(base, 2);

          areaTotal = areaLateral + areaBase;

          volumen = areaBase * altura / 3;

          System.out.println("Apotema:" + apotema + "cuadrado");

          System.out.println("Area lateral:" + areaLateral + "cuadrado");

          System.out.println("Area Total:" + areaTotal + "cuadrado");

          System.out.println("Volumen:" + volumen + "cubico");

        }
        break;
      case 4:

        System.out.println("Se necesita altura y Radio");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la altura del cono: ");
          altura = lector.nextDouble();

          if (altura < 0.1) {

            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;
        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el radio del cilindro:");
          radio = lector.nextDouble();

          if (radio < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");
          break;

        } else {
          generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));

          areaLateral = Math.PI * radio * generatriz;

          areaBase = Math.PI * Math.pow(radio, 2);

          areaTotal = areaLateral + areaBase;

          volumen = areaBase * altura / 3;

          System.out.println("generatriz:" + generatriz);

          System.out.println("Area lateral: " + areaLateral + " centimetro cuadradas.");

          System.out.println("Area total:" + areaTotal + " centimetro cuadrado.");

          System.out.println("Volumen:" + volumen + "centimetro al cubo.");

        }
        break;

      case 5:
        System.out.println("Se necesita el radio de la esfera");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el radio de la esfera: ");
          radio = lector.nextDouble();

          if (radio < 0.1) {

            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {

          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          Area = 4 * Math.PI * Math.pow(radio, 2);

          Volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);

          System.out.println("Area:" + Area + "cuadrado");

          System.out.println("Volumen:" + Volumen + "cubico");

        }
        break;

      case 6:

        System.out.println("Se necesita radio, Radio Mayor,Altura,Radio Superior");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el radio de la esfera: ");
          radio = lector.nextDouble();

          if (radio < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el Radio Mayor:");
          Radio = lector.nextDouble();

          if (Radio < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la altura:");
          altura = lector.nextDouble();

          if (altura < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite radio superior:");
          radiosuperior = lector.nextDouble();

          if (radiosuperior < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {
          Areazonaesferica = 2 * Math.PI * Radio * altura;

          Volumenzonaesferica = Math.PI * altura * Math.pow(altura, 2) + 3 * Math.pow(radio, 2)
              + 3 * Math.pow(radiosuperior, 2) / 6;

          System.out.println("Areazonaesferica:" + Areazonaesferica + "cuadrado");

          System.out.println("Volumenzonaesferica:" + Volumenzonaesferica + "cubico");
        }
        break;
      case 7:
        System.out.println("Se necesita radio Mayor y Altura");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el Radio Mayor:");
          Radio = lector.nextDouble();

          if (Radio < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la altura:");
          altura = lector.nextDouble();

          if (altura < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          Areacasqueteesferico = 2 * Math.PI * Radio * altura;

          volumencasqueteesferico = Math.PI * Math.pow(altura, 2) * 3 * Radio - altura / 3;

          System.out.println("Areacasqueteesferico:" + Areacasqueteesferico + "cuadrado");

          System.out.println("Volumencasqueteesferico:" + volumencasqueteesferico + "cubico");
        }
        break;
      case 8:
        System.out.println("Se necesita Radio Mayor y Radio Menor");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print(" Digite el radio menor ");
          radiomenor = lector.nextDouble();
          if (radiomenor < 0.1) {
            System.out.println(" No se aceptan valores menores a 0.1 ");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el radio mayor");
          Radiomayor = lector.nextDouble();

          if (Radiomayor < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la altura");
          altura = lector.nextDouble();

          if (altura < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {
          base = Radiomayor - radiomenor;

          generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));

          areaLateral = Math.PI * generatriz * (Radiomayor + radiomenor);

          areaTotal = Math.PI * generatriz * (Radiomayor + radiomenor) + Math.PI * Math.pow(Radiomayor, 2)
              + Math.PI * Math.pow(radiomenor, 2);

          Volumen = (1.0 / 3.0 )* Math.PI * altura
              * (Math.pow(Radiomayor, 2) + Math.pow(radiomenor, 2) + Radiomayor * radiomenor);

          System.out.println("EL Area Lateral es:" + areaLateral + "centimetro cuadrado");

          System.out.println("El Area Total es:" + areaTotal + "centimetro cuadrado");

          System.out.println("El Volumen es:" + Volumen + "centimetro cubico");

        }
        break;

      case 9:

        System.out.println(
            "Se necesita el Perimetro superior,perimetro inferior,altura,lado base superior,lado base inferior");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el perimetro superior");
          perimetrosuperior = lector.nextDouble();

          if (perimetrosuperior < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("perimetro inferior");
          perimetroinferior = lector.nextDouble();

          if (perimetroinferior < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {

          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la altura");
          altura = lector.nextDouble();

          if (altura < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite lado base superior");
          ladobasesuperior = lector.nextDouble();

          if (ladobasesuperior < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite lado base inferior");
          ladobaseinferior = lector.nextDouble();

          if (ladobaseinferior < 0.1) {

            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          base = perimetrosuperior - perimetroinferior;

          apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));

          areaLateral = perimetrosuperior + perimetroinferior * apotema / 2;

          areaTotal = areaLateral + ladobasesuperior + ladobaseinferior;

          volumen =( 1.0 / 3.0) * altura
              * (ladobasesuperior + ladobaseinferior + Math.sqrt(ladobasesuperior + ladobaseinferior));

          System.out.println("Area Lateral:" + areaLateral + "Centimetro cuadrado");

          System.out.println("Area total:" + areaTotal + "centimetro cuadrado");

          System.out.println("Volumen:" + volumen + "centimetro cubico");
        }
        break;
      case 10:

        System.out.println(" Se Necesita Radio y el Angulo ");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el Radio");
          radio = lector.nextDouble();

          if (radio < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el angulo");
          angulo = lector.nextDouble();
          if (angulo < 0.1) {

            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          Area = Math.PI * Math.pow(radio, 2) * angulo / 90;

          volumen = Math.PI * Math.pow(radio, 3) * angulo / 270;

          System.out.println("El area del Hueso esferico es:" + Area + "al cuadrado");

          System.out.println("EL volumen de la cuña esferica es:" + volumen + "cubico");

        }
        break;
      case 11:
        System.out.println("Necesita altura,  longitud y la profundidad");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite el radio  la altura: ");
          altura = lector.nextDouble();

          if (altura < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la longitud:");
          longitud = lector.nextDouble();

          if (longitud < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la profundidad");
          profundidad = lector.nextDouble();

          if (profundidad < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          Area = 2 * (altura * longitud + altura * profundidad + longitud * profundidad);

          Diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(longitud, 2) + Math.pow(profundidad, 2));

          Volumen = altura * longitud * profundidad;

          System.out.println("Area del Ortoedro es:" + Area + "Centimetro cuadrado");

          System.out.println("La diagonal del ortoedro es:" + Diagonal + "Centimetro cuadrado");

          System.out.println("El volumen del Ortoedro es:" + Volumen + "centimetro cubico");

        }
        break;
      case 12:
        System.out.println("Se necesita la Arista");
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la arista : ");
          arista = lector.nextDouble();

          if (arista < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          Area = Math.pow(arista, 2) * Math.sqrt(3);

          altura = arista * Math.sqrt(6) / 3;

          Volumen = Math.sqrt(2) / 12 * Math.pow(arista, 3);

          System.out.println("Area:" + Area + "cuadrado");

          System.out.println("Altura:" + altura + "cuadrado");

          System.out.println("Volumen:" + Volumen + "cubico");

        }
        break;
      case 13:

        System.out.println("Se necesita la Arista");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la arista del Hexaedro ");
          arista = lector.nextDouble();

          if (arista < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {
          Areadelacara = Math.pow(arista, 2);

          areaTotal = 6 * Math.pow(arista, 2);

          Volumen = Math.pow(arista, 3);

          Diagonal = arista * Math.sqrt(3);

          areaLateral = 4 * Areadelacara;

          System.out.println("Area Lateral" + areaLateral + "centimetro cuadrado");

          System.out.println("Arean Total :" + areaTotal + "cuadrado");

          System.out.println("Diagonal " + Diagonal + "cuadrado");

          System.out.println("Volumen:" + Volumen + "centimetro al cubo.");

        }
        break;

      case 14:

        System.out.println("Se necesita la Arista");

        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la arista del Hexaedro ");
          arista = lector.nextDouble();

          if (arista < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          areaTotal = 2 * Math.pow(arista, 2) * Math.sqrt(3);

          Volumen = Math.sqrt(2) / 3 * Math.pow(arista, 3);

          System.out.println("Area Total:" + areaTotal + "cuadrado");

          System.out.println("Volumen" + Volumen + "cubico");

        }

        break;

      case 15:
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la arista del Dodecadro: ");
          arista = lector.nextDouble();

          if (arista < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        }
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la longitud de los lados:");
          longitudLados = lector.nextDouble();

          if (longitudLados < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {

          areaTotal = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 * Math.sqrt(5));

          Volumen = 1 / 4 * 15 + 7 * Math.sqrt(5) * Math.pow(arista, 3);

          apotema = longitudLados / (2 * Math.tan(36));

          System.out.println("Area Total:" + areaTotal + "cuadrado");

          System.out.println("Volumen" + Volumen + "cubico");

        }
        break;

      case 16:
        for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

          System.out.print("Digite la arista del icosaedro: ");
          arista = lector.nextDouble();

          if (arista < 0.1) {
            System.out.println("No se aceptan valores menores a 0.1");

          } else {

            break;
          }
        }

        if (intentosMaximo1 == 3) {
          System.out.println("Demasiados intentos fallidos");

          break;

        } else {
          areaTotal = 5 * Math.pow(arista, 2);
          Volumen = 5 / 12 * 3 + Math.sqrt(5) * Math.pow(arista, 3);

          System.out.println("EL Area Total es igual a:" + areaTotal + "centrimetro cuadrado");
          System.out.println("--------------------------------------------------------");
          System.out.println("Volumen" + Volumen + "cubico");

          System.out.println("Gracias");
        }

      case 17:

        System.out.println("Fin del programa");

        System.out.println("Gracias!!!!!");

      default:
        System.out.println("saliendo del programa");

    }
    lector.close();

  }
}
