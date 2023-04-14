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
    

    class BabyDog extends Dog{
        void weep()
        {
            System.out.println("I can weep");
        }
    }


    class MultiLevelInheritance{
        public static void main(String args[])
        {
            BabyDog d=new BabyDog();
            d.weep();
            d.bark();
            d.eat();
        }
    }

