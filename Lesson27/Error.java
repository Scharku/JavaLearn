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
        �������� �������
        Object - Throwable - Exception (RunTime) - Error 
        Throwable - ��, ��� �������������.
        */
        
        /*
        try - catch - finally
        try - �������� ���-�� �������
        catch (������) - ���������� ���������
        finally - ��������� (������ ��� �� ������), ������ �����������.
        */
        
        /* ���� ������
        FileNotFoundException - ���� ���� �� ������.
        IOException - ������ read � write, �������� ��� �������� ������.
        ArrayIndexOutOfBoundException - ������ �� ��������� �������.
        */
    }
}
