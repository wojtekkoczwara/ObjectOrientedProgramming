package Classes.NestedClassInnerClass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("print");

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));
//        Gearbox.Gear second = mcLaren.new Gear(2, 15.4);
//        Gearbox.Gear third = mcLaren.new Gear(3, 17.8);
//        System.out.println(second.driveSpeed(1000));
//        System.out.println(third.driveSpeed(2000));


        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

        System.out.println("==============================");
        class ClickLister implements Button.OnClickListener{
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }

            public ClickLister(){
                System.out.println("I've been attached");
            }
        }
        btnPrint.setOnClickListener(new ClickLister());
//        listen();

        System.out.println("=====================================");
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch ((choice)){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }

}
