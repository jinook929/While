package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 1; i !=6; i++){
            System.out.println("i value is " + i);
        }

        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("New count value is " + count);
            count++;
        }

        count = 6;
        do {
            System.out.println("do count value is " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

        System.out.println("isEvenNumber = " + isEvenNumber(1));
        System.out.println("isEvenNumber = " + isEvenNumber(4));

        int startNumber = 4;
        int finishNumber = 20;

        int counter = 0;
        int sum = 0;

        while (startNumber <= finishNumber) {
            startNumber++;

            if(!isEvenNumber(startNumber)) {
                continue;
            }

            System.out.println(startNumber + " is Even Number");

            counter++;

            sum += startNumber;

            if (counter == 5) {
                System.out.println("Even numbers found = " + counter);
                break;
            }
        }
    }

    public static boolean isEvenNumber (int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
