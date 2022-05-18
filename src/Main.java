public class Main {
    public static void main(String[] args) {
        var box =5;
        System.out.println (box);
        box = box + 2;
        System.out.println (box);
        box = box - 3;
        System.out.println (box);
        box= box*3;
        System.out.println (box);
        box=box/4;
        System.out.println(box);

        var liftingCapacity =50;
        var stuffWeight =20;
        var capacityLeft =liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить "+capacityLeft+" кг вещей");

        var appleWeight =2;
        var orangeWeight =3;
        var fruitWeight = appleWeight+orangeWeight;
        System.out.println("Weight fruits "+fruitWeight);
        var productsWeight =44;
        var overLoad = 64 % 50;
        // остаток от деления
        System.out.println("jj"+overLoad);

        byte bananas =100;


    }
}