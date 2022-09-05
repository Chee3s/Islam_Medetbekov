import java.util.Random;

public class Main {
    public static void main(String[] args) {
        checkAgeAndTemperature(generateRandomAge(), 20);
        checkAgeAndTemperature(generateRandomAge(), 50);
        checkAgeAndTemperature(generateRandomAge(), 80);
        checkAgeAndTemperature(generateRandomAge(), 200);
        checkAgeAndTemperature(generateRandomAge(), 20);
    }
    public static void
    checkAgeAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else
            System.out.println("Оставайтесь дома");
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(50);
    }
}

