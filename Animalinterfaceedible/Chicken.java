package Animalinterfaceedible;
// tạo lớp con tên chicken thừa kế lớp animal

import edible.Edible;

public class Chicken  extends  Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }


}
