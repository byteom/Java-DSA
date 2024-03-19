//write a program to implement static methods, static class, static nested ,local,ananymous class and inner class?

public class example{
    public class Example {
        // Static method
        public static void staticMethod() {
            System.out.println("This is a static method.");
        }
    }

    // Static class
    public static class StaticClass {
        // Static method
        public static void staticMethod() {
            System.out.println("This is a static method.");
        }
    }

    // Static nested class
    public static class StaticNestedClass {
        // Static method
        public static void staticMethod() {
            System.out.println("This is a static method.");
        }
    }

    // Local class
    public void localClass() {
        // Static method
        class LocalClass {
            public static void staticMethod() {
                System.out.println("This is a static method.");
            }
        }
    }

    // Ananymous class
    public void ananymousClass() {
        // Static method
        new Runnable() {
            public void run() {
                System.out.println("This is a static method.");
            }
        };
    }
}

