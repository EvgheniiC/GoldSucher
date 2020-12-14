package com.evghenii.validators;

import java.util.Arrays;

public class NameValidator implements StringValidator{

    // массив содержит все запрещенные имена (все буквы большие, потом будем имя приводить к заглавным буквам и сравнивать с элементами массива)
    private final static String[] notAllowNames = {"KING", "LADY", "LORD", "QUEEN", "SIR"};// нужно записать элементы в алфавитном порядке, чтобы binarySearch работал, без сортировки binarySearch не будет работать  
    // массив содержит все римские цифры
    private final static char[] romanNumerals = {'C', 'D', 'I', 'L', 'M', 'V', 'X'};// нужно записать элементы в алфавитном порядке, чтобы binarySearch работал, без сортировки binarySearch не будет работать

    // проверяет имя на валидность
    @Override
    public boolean isValid(String text) {
        
        if (text==null || text.trim().length()==0){
            return false;
        }
        
        boolean isValidName = false;
        if (Arrays.binarySearch(notAllowNames, text.toUpperCase()) < 0) {// если имя не входит в список запрещенный имен
            if (Arrays.binarySearch(romanNumerals, text.charAt(text.length() - 1)) < 0) {// если последняя буква не римская
                isValidName = true;
            }
        }
        return isValidName;
    }
}
