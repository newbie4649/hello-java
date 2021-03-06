/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hello.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void 何も指定していない場合は既定の挨拶を返す() {
        assertEquals("Hello from Java", Program.helloWorld());
    }

    @Test
    void 指定された名前で挨拶を返す() {
        assertEquals("Hello from VSCode", Program.helloWorld("VSCode"));
    }
}

class Program {
    static String helloWorld() {
        return "Hello from Java";
    }

    static String helloWorld(String name) {
        return String.format("Hello from %s", name);
    }
}
