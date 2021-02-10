package com.strings;

public class RemoveCharFromString {

    public static void main(String[] args) {

        removeCharFromString("abcbcdjfkd", 'e');
        removeCharFromString("WYUFYTY", 'Y');
        removeCharFromString("ç∂©$%^*@&@∂ç", '@');

    }

    private static void removeCharFromString(String input, char c) {
        String result = input.replaceAll(String.valueOf(c), "");
        System.out.println(result);
    }
}
