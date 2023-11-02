package FullLesson;

public class Lesson16 {

    /* 
    16 ���� - String
    
     */
    public static void main(String[] args) {
        String s1 = new String("abcdefgabc");

        int a = s1.length(); //������� ����� string
        System.out.println(a);

        //������� ����, ��� ��������� �� ���� �������.
        char c1 = s1.charAt(3);
        System.out.println(c1);

        //������� ����, �� ����� ������� ��������� ������ char.
        int i1 = s1.indexOf('f');
        System.out.println(i1);

        //������� ������ �����, ��� ����������.
        int i2 = s1.indexOf("bcd");
        System.out.println(i2);

        //���� ������ ������� ���, �� ������� -1.
        int i3 = s1.indexOf('Z');
        System.out.println(i3);

        //������� � ������� X (4)
        int i4 = s1.indexOf('a', 4);
        System.out.println(i4);

        //String ���������� � ()... ���� ��, �� true.
        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        //String ������������� �� ()... ���� ��, �� true.
        boolean b2 = s1.endsWith("abc");
        System.out.println(b2);

        //������� ������ ������� ����� ������ �� ������� �������.
        String s2 = s1.substring(3);
        System.out.println(s2);

        String s3 = s1.substring(3, 7);
        System.out.println(s3);

        //������� ������� �� �����. strip �������� �����. stripLeading �����.
        //stripTrailing ������� ������� ������.
        String s4 = s1.trim();
        System.out.println(s4);

        //�������� ���� �� ������. ����� ������ ���� ��� ������.
        String s5 = s1.replace('a', 'k');
        System.out.println(s5);

        //���� �����, ��� +
        String s6 = "privet, ";
        String s7 = "drug";
        System.out.println(s6.concat(s7));

        //������ ����� ����������, toUpperCase - ��������.
        String s8 = "HRSHSRDHSDRJNH";
        System.out.println(s8.toLowerCase());
        
        //�������� �� � ���� ��������?
        boolean b3 = s1.contains("f");
        System.out.println(b3);
        
        //������� �� ������ �� �������� � �����?
        String s9 = "   ";
        System.out.println(s1.isBlank());
        System.out.println(s9.isBlank());
        
        //������ �� ������?
        String s10 = "";
        System.out.println(s10.isEmpty());
    }
}
