/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import hotelmta.HotelWSB;
import hotelmta.HotelWSB_Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

/**
 *
 * @author danie
 */
public class Main {

    public static void main(String[] args) {
        HotelWSB_Service servicioWeb;
        try {
            servicioWeb = new HotelWSB_Service(
                    new URL("http://localhost:8888/HotelWSB?wsdl"), // URL real del web service.
                    new QName("http://soap.hotelmta.tfg/", // copiado del código generado por wsimport
                            "HotelWSB"));

            HotelWSB unWebService = servicioWeb.getHotelWSBPort();

            // Ya podemos usarlo
            System.out.println(unWebService.searchRoom(1));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
