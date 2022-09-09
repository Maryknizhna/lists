import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> product = new ArrayList<>();
        int addProducts = 0;

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1 Операция добавить");
            System.out.println("2 Операция показать");
            System.out.println("3 Операция удалить");
            System.out.println("4 Операция найти");
            String input = scanner.nextLine();
            System.out.println();

            switch (input) {
                case "1":
                    System.out.println("Какую покупку хотите добавить?");
                    String addProduct = scanner.nextLine();
                    product.add(addProduct);
                    addProducts++;
                    System.out.println("Итого в списке покупок: " + addProducts);
                    break;
                case "2":
                    System.out.println("Список покупок:");
                    for (int i = 0; i < product.size(); i++) {
                        System.out.println((i + 1) + " " + product.get(i));
                    }
                    break;
                case "3":
                    System.out.println("Список покупок:");
                    for (int i = 0; i < product.size(); i++) {
                        System.out.println((i + 1) + " " + product.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String removeProduct = scanner.next();
                    try {
                        int numberOfRemovingProduct = Integer.parseInt(removeProduct);

                        System.out.println("Продукт " + product.get(numberOfRemovingProduct - 1) + " удалён. ");
                        product.remove(numberOfRemovingProduct - 1);
                        System.out.println("Список покупок: ");
                        for (int i = 0; i < product.size(); i++) {
                            System.out.println(i + 1 + "." + product.get(i));
                        }
                    } catch (NumberFormatException e) {
                        if (product.contains(removeProduct)) {
                            product.remove(removeProduct);
                            System.out.println("Продукт " + removeProduct + " удалён.");
                            System.out.println("Список покупок: ");
                            for (int i = 0; i < product.size(); i++) {
                                System.out.println(i + 1 + "." + product.get(i));
                            }
                        }
                    }
                    break;
                case "4":
                    System.out.println("Введите текст для поиска:");
                    String findProduct = scanner.nextLine();
                    System.out.println("Найдено:");
                    for (int i = 0; i < product.size(); i++) {
                        if (product.get(i).toLowerCase().contains(findProduct.toLowerCase())) {
                            System.out.println((i + 1) + " " + product.get(i));
                        }
                    }
                    break;
            }
        }

    }
}

