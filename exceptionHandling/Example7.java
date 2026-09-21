package exceptionHandling;
// Handle the checked exception

import java.io.File;
import java.io.IOException;
public class Example7 {
    // we can write exceptions using throws keywords
    public void doSomeThing() throws IOException,InterruptedException{
        System.out.println("Welcome to the session");
        System.out.println("Wait 5 seconds to see next message");
        Thread.sleep(5*1000);
        System.out.println("Today's topic is exception handling");

        File f = new File("abc.txt");
        f.createNewFile();
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        Example7 obj7 = new Example7();
        obj7.doSomeThing();
    }
}
