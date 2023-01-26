package sem2;

import java.util.logging.*;
import java.io.IOException;

public class BubbleSorting {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] nums = { 2, 5, 4, 7, 6, 865, 43, 765, 8, 7, 45, 7, 45, 5, 73, 45 };
        bubbleSort(nums);

    }

    public static void bubbleSort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger("MyLog");
        logger.setUseParentHandlers(false);
        FileHandler fh;

        try {
            fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (IOException e) {
            e.printStackTrace();
        }
        int temp = 0;
        String text = "";
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    text = String.format("Поменяли местами число %d и %d \n", arr[i + 1], arr[i]);
                    logger.info(text);

                } else {
                    text = "Ничего не поменяли местами \n";
                    logger.info(text);

                }
            }
        }

    }
}
