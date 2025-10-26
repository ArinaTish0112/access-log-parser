import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validFileCount = 0;
        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = scanner.nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println("Ошибка: файл не существует. Попробуйте снова.\n");
                continue;
            }
            if (isDirectory) {
                System.out.println("Ошибка: указан путь к папке, а не к файлу. Попробуйте снова.\n");
                continue;
            }
            validFileCount++;
            System.out.println("Путь указан верно!");
            System.out.println("Это файл номер " + validFileCount + "\n");
        }
    }
}