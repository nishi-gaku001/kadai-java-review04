package animal;

public class Review04 {

    public static void main(String[] args) {
        // 3人分のインスタンスを作成 + say + think
        // （子に定義されていなくても、継承していれば親のを使える）
        //田中
        Human tanaka = new Human("田中　太郎", 25, "電車");
        tanaka.say();
        tanaka.think();

        // 鈴木
        Human suzuki = new Human("鈴木　次郎", 30, "野球");
        suzuki.say();
        suzuki.think();

        // 佐藤
        Human sato = new Human("佐藤　花子", 20, "映画");
        sato.say();
        sato.think();

    }

}
