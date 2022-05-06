import java.io.Console;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class WithConsole {

    public static void main(String[] args)
    {

        Console cs = System.console();

        PrintWriter ww = cs.writer();

        ww.printf("Hi ---> you are? ");


        String s = cs.readLine();

        ww.printf("Hiiiiiii %s\n", s);
        ww.printf("PW %s?",s);

        char[] c = cs.readPassword();

        String pw = new String(c);

        ww.printf("%s easy pw ! \n ", pw);
        ww.printf("What do you like %s?", s);


        //Reader r = cs.reader();
        //PrintWriter pwer = cs.writer();

        String cr = cs.readLine();

        List<String> pc = new Scanner(cr).useDelimiter(" ").tokens().collect(Collectors.toList());

        ww.println(pc);







































    }


}
