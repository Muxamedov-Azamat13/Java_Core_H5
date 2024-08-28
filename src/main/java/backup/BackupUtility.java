package backup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupUtility {
    public static void backupFiles(String sourceDirectory) {
        File sourceDir = new File(sourceDirectory);
        File backupDir = new File(sourceDirectory + "/backup");

        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        File[] files = sourceDir.listFiles((dir, name) -> new File(dir, name).isFile());

        if (files != null) {
            for (File file : files) {
                try {
                    // Копируем файл в директорию backup
                    Path sourcePath = file.toPath();
                    Path backupPath = backupDir.toPath().resolve(file.getName());
                    Files.copy(sourcePath, backupPath, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Файл скопирован: " + file.getName());
                } catch (IOException e) {
                    System.err.println("Ошибка копирования файла: " + file.getName());
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Нет файлов для копирования в директории: " + sourceDirectory);
        }
    }

    public static void main(String[] args) {
        backupFiles(".");
    }
}
