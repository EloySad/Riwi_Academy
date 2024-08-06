package org.example.persistence.connectionDB;

import java.sql.DriverManager;

public class ConfigDB {
    public static java.sql.Connection connection = null;

    //Open connection

    public static  java.sql.Connection conect(){
        //Create variables for connection "jdbc:mysql://host:port/nombre";

        String URL = "mysql://127.0.0.1:3306/Prueba_JAVA";
        String user = "root";
        String password = "tupassword";

        //Conect using the driver manager and save the null variable

        try {
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connexion exitosa");
        } catch (Exception e){
            System.out.println("No fue posible establecer conexion con la base de datos" +e.getMessage());
        }
        return connection;
    }

    //Close connection

    public static void close(){
        if (connection != null){

            //Try close connection

            try {
                System.out.println("Conexión finalizada");
                connection.close();
            }catch (Exception e){
                System.out.println("No se pudo finalizar la conexión" +e.getMessage());
            }

        }
    }
}

