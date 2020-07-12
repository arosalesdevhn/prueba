/*
   PROGRAMA FUE DESARROLLADO PARA GUARDAR LOS LOGS DE LOS WEBSERVICES
   DESARROLLADOS EN JAVA ESTE PROCESO SE EJECUTARA A LAS 3:00 AM COMO 
   TAREA PROGRAMADA 
 */
package movelogswebservices;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author arosales
 */
public class MoveLogsWebServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            //VARIABLES PARA DIRECTORIOS
            File dir = null;
            File[] logs = null;

            //PARAMETROS
            String date = previousDateString();
            String year = date.substring(0, 4);
            int month = Integer.parseInt(date.substring(5, 7));
            String servicio = "";
            String servidor = "Producción";// Producción

            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE EEH  
             ********************************************************************
             */
            servicio = "EEH";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml");
            logs = dir.listFiles();

            for (File log : logs) {

                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                    System.out.println(servicio +" Archivo no cumple con fecha");
                }

            }
            System.out.println("LOGS MOVED IN SERVICE " + servicio);

            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE CLARO  
             ********************************************************************
             */
            servicio = "Claro";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\XML");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                    System.out.println(servicio +" Archivo no cumple con fecha");
                }

            }
            System.out.println("LOGS MOVED IN SERVICE " + servicio);

            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE LOTO  
             ********************************************************************
             */
            servicio = "Loto";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\XML");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }
            System.out.println("LOGS MOVED IN SERVICE " + servicio);

            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE DARA 
             ********************************************************************
             */
            servicio = "Dara";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }

            servicio = "Dara";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Log");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }

            System.out.println("LOGS MOVED IN SERVICE " + servicio);

            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE BALCAMII  
             ********************************************************************
             */
            servicio = "BalcamII";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }
            
            servicio = "BalcamII";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Log");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }
            
            
            
            System.out.println("LOGS MOVED IN SERVICE " + servicio);

            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE IHSS  
             ********************************************************************
             */
            servicio = "IHSS";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }
            System.out.println("LOGS MOVED IN SERVICE " + servicio);
            
            
            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE RAP  
             ********************************************************************
             */
            servicio = "RAP";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }
            System.out.println("LOGS MOVED IN SERVICE " + servicio);
            
            
            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE RECO  
             ********************************************************************
             */
            servicio = "RECO";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }
            System.out.println("LOGS MOVED IN SERVICE " + servicio);
            
            /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE TGR  
             ********************************************************************
             */
            servicio = "TGR";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }
            System.out.println("LOGS MOVED IN SERVICE " + servicio);
            
            
             /*
             * ******************************************************************
             * MOVER LOGS DEL SERVICIO DE REMESAS  
             ********************************************************************
             */
            servicio = "Remesas";
            dir = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml");
            logs = dir.listFiles();

            for (File log : logs) {
                if (log.getName().contains(date)) {
                    moveFile(year, month, servicio, log.getName(), servidor);
                } else {
                      System.out.println(servicio +" Archivo no cumple con fecha");
                }
            }
            System.out.println("LOGS MOVED IN SERVICE " + servicio);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static boolean moveFile(String year, int month, String servicio, String namefile, String servidor) {
        try {
            System.out.println("MOVING LOGS SERVICE " + servicio);
            File afile = new File("C:\\WebServicesJava\\" + servidor + "\\" + servicio + "\\Xml\\" + namefile);

            if (afile.renameTo(new File("C:\\HistoricosLogs\\" + servicio + "\\" + year + "\\" + month + "\\" + afile.getName()))) {
                System.out.println("File is moved successful!");
                if (afile.delete()) {
                    System.out.println("File is deleted succesfull");
                }

            } else {
                System.out.println("File is failed to move!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static String previousDateString() {

        String result = "";

        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date date = java.util.Calendar.getInstance().getTime();

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR, -1);

            Date previousDate = calendar.getTime();
            result = dateFormat.format(previousDate);
        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }

}
