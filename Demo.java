package HW_M14;

class Demo {
    public synchronized static void show() {
        Thread tread = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println(tread.getName() + "[" + i + "]");
            try {
                Thread.sleep(500);
            } catch (InterruptedException exc) {
            }
        }
    }

    static class MyThread extends Thread {
        MyThread(String name) {
            super(name);
            start();
        }

        @Override
        public void run() {
            Demo.show();
        }

        public static void main(String[] args) {
            new MyThread("Alpha");
            new MyThread("Bravo");
            new MyThread("Charlie");
            new MyThread("Foxtrot");
        }
    }
}