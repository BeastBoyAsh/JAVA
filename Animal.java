class Animal{
    void eat()
    {
        System.out.println("I can eat");
    }
}
    class Dog extends Animal{
        void bark()
        {
            System.out.println("I can bark");
        }
    }


    class SimpleInheritance{
        public static void main(String args[])
        {
            Dog d=new Dog();
            d.bark();
            d.eat();
        }
    }

