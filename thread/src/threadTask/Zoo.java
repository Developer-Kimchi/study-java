package threadTask;

public class Zoo {
   public static void main(String[] args) {
//	   ���ο��� �Ű������� Runnable�� ���ٷ� ����
      new Animal().makeSound(() -> {
         for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {Thread.sleep(500);} catch (InterruptedException e) {;}
         }
      });
   }
}