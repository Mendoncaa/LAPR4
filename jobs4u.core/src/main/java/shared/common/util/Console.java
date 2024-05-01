/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package shared.common.util;

import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;
import sem4pi.core.management.exam.domain.exam.ExamSpecificationDTO;
import sem4pi.core.management.sharedboard.domain.postit.ImageConversionService;
import sem4pi.shared.util.DateTime;

import java.io.*;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@UtilityClass
public class Console {

    public static String readImage(String prompt, List<String> extensions) {
        try {
            System.out.println(prompt);
            System.out.print("Enter Image Path: ");
            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);
            String imagePath = in.readLine();
            StringBuilder possibleExtensions = new StringBuilder();
            possibleExtensions.append(extensions.get(0));
            for (int i = 1; i < extensions.size(); i++) {
                possibleExtensions.append("|").append(extensions.get(0));
            }
            if (imagePath.matches(".*\\.(" + possibleExtensions + ")$")) {
                return ImageConversionService.convertToString(imagePath);
            }
            throw new Exception("Image Path Invalid!");
        } catch (Exception ex1) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                    null, ex1);
            return null;
        }
    }


    public static String readSpecificationFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }

            return sb.toString().trim();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

    public boolean validateFilePath(String filePath) {
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            return true;
        } else {
            return false;
        }
    }



    static public void showList(List list, String header) {
        System.out.println("\n" + header);

        int index = 0;
        for (Object o : list) {
            index++;

            System.out.println(index + ". " + o.toString());
        }
    }

    public static String readLine(String prompt) {
        try {
            System.out.print(prompt);
            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);
            return in.readLine();
        } catch (Exception ex1) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                    null, ex1);
            return null;
        }
    }

    public static int readInteger(String prompt) {
        do {
            try {
                String strInt = readLine(prompt);
                int valor = Integer.parseInt(strInt);

                return valor;
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex);
            }

        } while (true);
    }



    public static long readLong(String prompt) {
        do {
            try {
                String strLong = readLine(prompt);
                long valor = Long.parseLong(strLong);

                return valor;
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex);
            }

        } while (true);
    }

    public static boolean readBoolean(String prompt) {
        do {
            try {
                String strBool = readLine(prompt).toLowerCase();
                if (strBool.equals("y") || strBool.equals("s")) {
                    return true;
                } else if (strBool.equals("n")) {
                    return false;
                }
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex);
            } catch (Exception ex1) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex1);
            }
        } while (true);
    }

    public static int readOption(int low, int high, int exit) {
        int option;
        do {
            option = Console.readInteger("\n> ");
            if (option == exit) {
                break;
            }
        } while (option < low || option > high);
        return option;
    }

    public static Date readDate(String prompt) {
        do {
            try {
                String strDate = readLine(prompt + "(Date Format: `dd-MM-yyyy`): ");
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                Date date = df.parse(strDate);

                return date;
            } catch (ParseException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex);
            } catch (Exception ex1) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex1);
            }

        } while (true);
    }



    public static <T extends Enum<T>> T readEnum(String prompt, Class<T> enumClass) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().toUpperCase();
                T enumValue = Enum.valueOf(enumClass, input);
                return enumValue;
            } catch (IllegalArgumentException ex) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (true);
    }



    public static Calendar readCalendar(String prompt) {
        do {
            try {
                String strDate = readLine(prompt);
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                Calendar date = DateTime.dateToCalendar(df.parse(strDate));

                return date;
            } catch (ParseException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex);
            } catch (Exception ex1) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex1);
            }
        } while (true);
    }

    public static double readDouble(String prompt) {
        do {
            try {
                String input = readLine(prompt);
                double valor = Double.parseDouble(input);

                return valor;
            } catch (NumberFormatException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex);
            } catch (Exception ex1) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE,
                        null, ex1);
            }
        } while (true);
    }

    public static void waitForKey(String prompt) {
        System.out.println(prompt);
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
    }
}

 */