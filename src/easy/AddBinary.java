package easy;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }

    public String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char carry = '0';
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            char r = '0';
            if (carry != '1') {

                if (i < 0){
                    r = b.charAt(j);
                } else if (j < 0){
                    r = a.charAt(i);
                } else {
                    r = add(a.charAt(i), b.charAt(j));
                    if (r == '2') {
                        r = '0';
                        carry = '1';
                    }
                }

            } else {

                if (i < 0){
                    r = add(carry, b.charAt(j));
                    carry = '0';
                    if (r == '2') {
                        r = '0';
                        carry = '1';
                    }
                } else if (j < 0){
                    r = add(carry, a.charAt(i));
                    carry = '0';
                    if (r == '2') {
                        r = '0';
                        carry = '1';
                    }
                } else {
                    r = add(carry, a.charAt(i));
                    carry = '0';
                    if (r == '2') {
                        r = '0';
                        carry = '1';
                    }

                    r = add(r, b.charAt(j));
                    if (r == '2') {
                        r = '0';
                        carry = '1';
                    }
                }
            }

            sb.append(r);
            i--;
            j--;
        }
        if (carry != '0'){
            sb.append(carry);
        }


        return sb.reverse().toString();
    }

    public char add(char a, char b) {
        if (a != b) {
            return '1';
        } else {
            if (a == '0') {
                return '0';
            } else {
                return '2';
            }
        }
    }

    public static void main(String[] args) {
        String a = "110010";
        String b = "10111";
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary2(a, b));
    }
}

