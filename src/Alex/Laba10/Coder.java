package Alex.Laba10;

import java.util.ArrayList;

public class Coder {
    private static boolean new_abc = false;
    public static String code(Message message){
        if(!new_abc){
            create_abc(message);
        }
        ArrayList<Character> upd_char = new ArrayList<>(message.getMessage().length()+2);
        char[] before_char = message.getMessage().toCharArray();
        for(char c: before_char){
            upd_char.add(Alphabet.get_char_from_modif_abc(c));
        }
        StringBuilder coded_message = new StringBuilder();
        for(char c: upd_char){
            coded_message.append(c);
        }
        System.out.println(coded_message);
        return coded_message.toString();
    }
    public static String encode(Message message){
        if(!new_abc){
            create_abc(message);
        }
        ArrayList<Character> upd_char = new ArrayList<>(message.getCoded_message().length()+2);
        char[] before_char = message.getCoded_message().toCharArray();
        for (char c: before_char){
            upd_char.add(Alphabet.get_char_from_real_abc(c));
        }
        StringBuilder encoded_message = new StringBuilder();
        for(char c: upd_char){
            encoded_message.append(c);
        }
        System.out.println(encoded_message);
        return encoded_message.toString();
    }
    public static void create_abc(Message message){
        Alphabet.modifie_abc(message);
        new_abc = true;
    }

}
