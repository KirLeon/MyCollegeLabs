package Alex.Laba10;

import java.util.ArrayList;

public class Alphabet {
    //Два списка символов: оригинальный алфавит, заполняющийся в full_abc(), и модифицированный, заполняющийся в modifie_abc(Message message)
    private static ArrayList<Character> real_abc = new ArrayList<Character>(40);
    private static ArrayList<Character> modif_abc = new ArrayList<Character>(40);
    //Метод, заполняющий оригинальный алфавит. Вызывается первым делом в методе modifir_abc для экономии строчек кода
    public static void full_abc(){
        for(int i = 1072; i<1104; i++){
            if(i == 1078){
                real_abc.add((char) 1105);
            }
            real_abc.add((char) i);
        }
    }
    //Метод принимает в себя объект Message, содержащий интересующие нас кодовое слово и длину ключа, и создаёт модифицированный алфавит на их основе
    public static void modifie_abc(Message message){
        full_abc();
        getReal_abc();
        //Заполняем лист с уникальными символами, чтобы подставлять в алфавит
        ArrayList<Character> uniq = new ArrayList<Character>(40);
        OUTER: for(int i = 0; i<message.getCode_word().length(); i++){
            for(char c: uniq){
                //Если в уникальном алфавите уже есть этот символ, то пропускаем всю итерацию внешнего цикла (= берём следующую букву)
                if (message.getCode_word().charAt(i) == c) continue OUTER;
            }
            //В противном случае добавляем новый уникальный символ
            uniq.add(message.getCode_word().charAt(i));
        }

        //Добавляем остальные буквы в уникальный алфавит
        for(char c: real_abc){
            //Если данная буква из оригинального алфавита не встречается в уникальном, то добавляем её
            if(!uniq.contains(c)){
                uniq.add(c);
            }
        }

        //Добавляем последние буквы алфавита, идущие до начала ключевого слова, в начало нового алфавита
        for (int i = uniq.size() - message.getKey(); i<33; i++){
            modif_abc.add(uniq.get(i));
        }

        //Заполняем алфавит оставшимися буквами
        for(int i =0; i<uniq.size() - message.getKey(); i++){
            modif_abc.add(uniq.get(i));
        }
        getModif_abc();
    }
    //Метод принимает в себя символ, ищет его в реальном алфавите, а затем возвращает символ под тем же индексом из модифицированного алфавита
    public static char get_char_from_modif_abc(char char_in_mess){
        if (char_in_mess == ' ') return ' ';
        return modif_abc.get(real_abc.indexOf(char_in_mess));
    }
    public static char get_char_from_real_abc(char char_in_code){
        if (char_in_code == ' ') return ' ';
        return real_abc.get(modif_abc.indexOf(char_in_code));
    }

    public static ArrayList<Character> getReal_abc() {
        System.out.println(real_abc);
        return real_abc;
    }

    public static ArrayList<Character> getModif_abc() {
        System.out.println(modif_abc);
        return modif_abc;
    }

}
