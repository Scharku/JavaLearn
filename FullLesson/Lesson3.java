package FullLesson;
class Lesson3 { 
    /* �� 3 ����� ��������� �������������� � ���������� ��������, 
            � ����� ��������� ���������.
    */
    public static void main(String[] args) {
        int x = 5; int y = 9; 
        
        // �������, ��� ����� ������ � ���.
        int minus = x - y;
        int plus = x + y;
        int multiplication = x*y;
        int division = x / y;
        int WaT = x % y; // ����� �������.
        
        x++; //����������� �� 1 ������� ����� ��������. Postfix
        ++x; //����������� �� 1 ������� �� ��������. Prefix
        x--; //��������� �� 1 ������� ����� ��������. Postfix
        --x; //��������� �� 1 ������� �� ��������. Prefix
        
    // ������.
        int pr1 = 7; // � ������ ������ �������� �������� 7.
        System.out.println(pr1); //��������� 7.
        int pr2 = x + pr1++; /* pr2 = 5 + 7 = 12, �� ���� �������� pr1 ����� 
                                    ������ ����� 8. */
        System.out.println(pr2); //��������� 12.
        System.out.println(pr1); //��������� 8.
        int pr3 = x + ++pr1; /* pr2 = 5 + 9 = 13, �������� pr1 ����� 9 �� 
                                    �����������. */
        System.out.println(pr3); //��������� 14.
        System.out.println(pr1); //��������� 9.
        
        /* ��������� ������������.
        ���� �������� =, �� ��� ������������, � = 5.
        ���� �������� +=, �� ��� ������� �����������, ����� �����������, 
            �������� � = 4, �+=6, �� � = 10.
        ���������� � ����������� -=, *=, /= 
        */
        
        /* ��������� ���������.
        ���� �������� ==, �� ��� ���������, 5 == 6.
        ��������� > < >= <= ��� ��������� ������-������.
        �������� != ��� �� �����.
        
        && - ���������� �������� � (���� ���� �������������, ����� ���������� 
        ������).
        
        || - ���������� �������� ��� (���� ���� �������������, ����� ���������� 
        ������).
        
        ! - �������� �������� (��)
        
        & - ���������� �������� � �������� � ���������� ����������, � �� ������
        � �������� �����������. ����� ���������� ������ �� �����.
        
        | - ���������� �������� ��� �������� � ���������� ����������, � ��
        ������ �������� �����������. ����� ���������� ������ �� �����.
        
        ^ - ���� �������� ���, �� �������� �� ������� �������� - ������ true 
        ������ �����, ����� ���� �������� true.
        
        */
    }
}