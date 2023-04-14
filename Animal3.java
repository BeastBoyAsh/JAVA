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

    class Cat extends Animal{
        void meow()
        {
            System.out.println("I can meow");
        }
}

    class HierarchialInheritance{
        public static void main(String args[])
        {
            Cat c=new Cat();
            c.meow();
            c.eat();
        }
}

