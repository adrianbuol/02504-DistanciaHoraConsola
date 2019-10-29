/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH);

    public static void main(String[] args) {
        //Imprimir por pantalla los datos de fecha actuales
        int h, m, s;
        int secondI, secondA;
        int horaCal, minutoCal, segundoCal;
        Calendar tiempo = Calendar.getInstance();

        //Escritura por pantalla
        try {

            System.out.printf("Inserte Hora ................:");
            h = SCN.nextInt();
            System.out.printf("Inserte Minuto ..............:");
            m = SCN.nextInt();
            System.out.printf("Inserte Segundo .............:");
            s = SCN.nextInt();

            //Devolver resultado
            System.out.printf("Hora inicio .................:%02d:%02d:%02d%n",
                    h, m, s);
            System.out.printf("Hora Actual .................:%tT%n", tiempo);

            //Operación
            secondI = h * 3600 + m * 60 + s;
            secondA = tiempo.get(Calendar.HOUR_OF_DAY) * 3600 + tiempo.get(Calendar.MINUTE) * 60 + tiempo.get(Calendar.SECOND);

            segundoCal = secondA - secondI;
            minutoCal = segundoCal / 60;
            segundoCal = segundoCal % 60;
            horaCal = minutoCal / 60;
            minutoCal = minutoCal % 60;
            System.out.printf("Tiempo de clase .............:%02d:%02d:%02d%n",horaCal, minutoCal, segundoCal);

        } catch (Exception e) {
            //Mensaje de error
            System.out.printf("ERROR: Entrada Incorrecta.%n");

        } finally {
            SCN.nextLine();
        }

    }
}
