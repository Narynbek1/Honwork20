public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <=10 ; i++) {
//            for (int j = 1; j <=10; j++) {
//                System.out.printf("\n"+i+"x"+j+"="+(i*j)+"\t");
//            }
//            System.out.println();
//        }
//


        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
