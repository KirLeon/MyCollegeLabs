package Mohistro.Laba10;

public class Coder {
    public static void code(){
        Message message = new Message();
        Matrix matrix = new Matrix(message);
        matrix.switch_columns();
        matrix.switch_rows();
        matrix.arr_to_str();
    }
    public static void decode(){
        Matrix matrix = new Matrix();
        matrix.code_to_arr();
        matrix.normalize_arr();
    }
}