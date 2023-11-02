package Lesson27;
import java.io.*;

public class Error {
    public static void main(String[] args) throws Exception {
        File f = new File ("test.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
        
        /*
        Иерархия классов
        Object - Throwable - Exception (RunTime) - Error 
        Throwable - то, что выбрасывается.
        */
        
        /*
        try - catch - finally
        try - пытаемся что-то сделать
        catch (ловить) - исключение выброшено
        finally - результат (смогли или не смогли), всегда выполняется.
        */
        
        /* Типы ошибок
        FileNotFoundException - если файл не найден.
        IOException - ошибка read и write, например при закрытии стрима.
        ArrayIndexOutOfBoundException - индекс за пределами массива.
        */
    }
}
