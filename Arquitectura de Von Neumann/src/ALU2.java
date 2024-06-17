public class ALU2 {
    public int sumar(int a, int b) {
        // Convertir a y b a binario
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        
        // Realizar la suma binaria
        String binSum = sumaBinaria(binA, binB);
        
        // Convertir la suma binaria de vuelta a decimal
        return Integer.parseInt(binSum, 2);
    }

    public int restar(int a, int b) {
        // Convertir a y b a binario con longitud adecuada
        int maxLength = Math.max(Integer.toBinaryString(a).length(), Integer.toBinaryString(b).length()) + 1;
        String binA = ajustarLongitud(Integer.toBinaryString(a), maxLength);
        String binB = ajustarLongitud(Integer.toBinaryString(b), maxLength);
        
        // Obtener el complemento a dos de b
        String binBComplement = complementoADos(binB);
        
        // Realizar la suma binaria de a y el complemento a dos de b
        String binDiff = sumaBinaria(binA, binBComplement);
        
        // Ajustar la longitud del resultado
        binDiff = ajustarLongitud(binDiff, maxLength);
        
        // Convertir la resta binaria de vuelta a decimal, considerando el signo
        return binarioADecimal(binDiff);
    }

    public int multiplicar(int a, int b) {
        // Convertir a y b a binario
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        
        // Realizar la multiplicación binaria
        String binProduct = multiplicacionBinaria(binA, binB);
        
        // Convertir el producto binario de vuelta a decimal
        return Integer.parseInt(binProduct, 2);
    }

    // public int multiplicarBooth(int a, int b) {
    //     // Convertir a y b a binario
    //     String binA = Integer.toBinaryString(a);
    //     String binB = Integer.toBinaryString(b);

    //     // Realizar la multiplicación binaria utilizando el algoritmo de Booth
    //     String binProduct = multiplicacionBooth(binA, binB);

    //     // Convertir el producto binario de vuelta a decimal
    //     return Integer.parseInt(binProduct, 2);
    // }

    // Método para realizar la suma binaria
    private String sumaBinaria(String binA, String binB) {
        int maxLength = Math.max(binA.length(), binB.length());
        binA = String.format("%" + maxLength + "s", binA).replace(' ', '0');
        binB = String.format("%" + maxLength + "s", binB).replace(' ', '0');

        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = binA.charAt(i) - '0';
            int bitB = binB.charAt(i) - '0';
            int sum = bitA + bitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

    // Método para obtener el complemento a dos de una cadena binaria
    private String complementoADos(String bin) {
        // Invertir los bits
        StringBuilder complement = new StringBuilder();

        for (char bit : bin.toCharArray()) {
            complement.append(bit == '0' ? '1' : '0');
        }

        // Sumar 1 al complemento
        return sumaBinaria(complement.toString(), "1");
    }

    // Método para realizar la multiplicación binaria
    private String multiplicacionBinaria(String binA, String binB) {
        int m = binA.length();
        int n = binB.length();
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int bitA = binA.charAt(i) - '0';
                int bitB = binB.charAt(j) - '0';
                int product = bitA * bitB;
                int sum = product + result[i + j + 1];
                result[i + j + 1] = sum % 2;
                result[i + j] += sum / 2;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            sb.append(r);
        }

        return sb.toString().replaceFirst("^0+(?!$)", "");
    }

    // private String multiplicacionBooth(String binA, String binB) {
    //     int m = binA.length();
    //     int n = binB.length();
    
    //     // Asegurar que binA y binB tengan la misma longitud para la multiplicación de Booth
    //     if (m > n) {
    //         binB = String.format("%" + m + "s", binB).replace(' ', '0');
    //         n = m; // Actualizar la longitud de binB
    //     } else if (m < n) {
    //         binA = String.format("%" + n + "s", binA).replace(' ', '0');
    //         m = n; // Actualizar la longitud de binA
    //     }
    
    //     // Preparar P inicialmente con ceros, con un bit adicional para el desbordamiento
    //     StringBuilder P = new StringBuilder(String.format("%" + (m + n + 1) + "s", "0").replace(' ', '0'));
    //     StringBuilder A = new StringBuilder(binA);
    //     StringBuilder S = new StringBuilder(complementoADos(binA)); // Complemento a dos de A
    
    //     // Realizar la multiplicación de Booth
    //     for (int i = 0; i < n; i++) {
    //         // Obtener el último bit de P
    //         char lastBit = P.charAt(m + n);
    
    //         if (lastBit == '0') {
    //             // P = P + A
    //             P = new StringBuilder(sumaBinaria(P.substring(0, m + n), A.toString()) + P.substring(m + 1));
    //         } else if (lastBit == '1') {
    //             // P = P + S
    //             P = new StringBuilder(sumaBinaria(P.substring(0, m + n), S.toString()) + P.substring(m + 1));
    //         }
    
    //         // Desplazar P a la derecha
    //         P.insert(0, P.charAt(m + n - 1));
    //         P.deleteCharAt(m + n + 1);
    //     }
    
    //     // Retornar el resultado como una cadena binaria
    //     return P.substring(0, m + n);
    // }
    // Método para ajustar la longitud de una cadena binaria
    private String ajustarLongitud(String bin, int length) {
        if (bin.length() > length) {
            return bin.substring(bin.length() - length);
        } else {
            return String.format("%" + length + "s", bin).replace(' ', '0');
        }
    }

    // Método para convertir una cadena binaria a un número decimal considerando el signo
    private int binarioADecimal(String bin) {
        if (bin.charAt(0) == '1') {
            // Número negativo
            String complement = complementoADos(bin.substring(1));
            return -Integer.parseInt(complement, 2);
        } else {
            // Número positivo
            return Integer.parseInt(bin, 2);
        }
    }
}