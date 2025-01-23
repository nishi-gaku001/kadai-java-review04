package animal;

public class Animal {
    // フィールド
    private String name; // 名前
    private int age; // 年齢

    // 引数なしコンストラクタ
    public Animal() {
    }

    //引数ありコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // nameのgetter
    public String getName() {
        return name;
    }

    // nameのsetter
    public void setName(String name) {
        this.name = name;
    }

    // ageのgetter
    public int getAge() {
        return age;
    }

    // ageのsetter
    public void setAge(int age) {
        this.age = age;
    }

    // 名前と年齢を表示
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }

}
