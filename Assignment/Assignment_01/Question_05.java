class Question_05 {
    public static void main(String[] args) {
        int bin = 0b1010;  // Binary
        int oct = 012;     // Octal (0 -start with 0 and represent octal values)
        int dec = 10;      // Decimal
        int hex = 0xA;     // Hexadecimal (0x or 0X-represent hexadecimal values)

        float flt = 3.14f; // Float in that if we do not give format specifier than it give error
        double dbl = 2.718;// if we don't gave d as a formate specifer than compiler by default print double

        System.out.println("Binary: " + bin); 
        System.out.println("Octal: " + oct);
        System.out.println("Decimal: " + dec);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Float: " + flt);
        System.out.println("Double: " + dbl);
    }
}


//1st O/p = Binary (base 2) uses only 0 and 1.so((1×2^3)+(0×2^)+(1×2^1)+(0×2^0))=(1*8)+(0*4)+(1*2)+(0+1)=10
//2nd o/p =Octal (base 8) uses digits 0-7.so(1×8^1)+(2×8^0)=(1×8)+(2*1)=8+2=
//3rd o/p = Decimal (base 10).10 is already in decimal form.So, 10 remains 10.
//4rd o/p = Hexadecimal (base 16) uses digits 0-9 and letters A-F (where A=10, B=11, ..., F=15).so (A×16^0)=(10×1)=10
//5th o/p =3.14f is a floating-point number (float).so it print as it is
//6th o/p = 2.718 is a floating-point number (double).so it print as it is