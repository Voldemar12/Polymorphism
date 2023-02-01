package hierarchy;

import compiletime.New;
import myth.Chimera;
import myth.Dragon;
import myth.MythicalAnimal;
import runtime.Next;
import runtime.Precedence;

public class Main {
    public static void main(String[] args) {

        New newInstance = new New();

        New newInstance1 = new New();
        New newInstance2 = new New(1, 2, 3);
        New newInstance3 = new New(4, 5, 6);
        New newInstance4 = new New(7, 8, 9);

        Precedence precedenceInstance = new Precedence(1, 2, 3);
        Next nextInstance = new Next(1, 2, 3);
        Precedence mixInstance = new Next(10, 6, 7);

        System.out.println(precedenceInstance.calculate(4, 5, 6));
        System.out.println(nextInstance.calculate(7, 8, 9));
        System.out.println(mixInstance.calculate(10, 12, 6));

        MythicalAnimal chimera = new Chimera();
        MythicalAnimal dragon = new Dragon();
        MythicalAnimal animal = new MythicalAnimal();

        chimera.hello();
        dragon.hello();
        animal.hello();

    }
}