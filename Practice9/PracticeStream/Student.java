package Practice9.PracticeStream;

public class Student {
    private String name;
    private int age;
    private float mathScore;
    private float historyScore;

    public Student() {

    }

    public Student(String name, int age, float mathScore, float historyScore) {
        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
        this.historyScore = historyScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(float historyScore) {
        this.historyScore = historyScore;
    }

    public Float getAverage() {
        return (mathScore + historyScore) / 2;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mathScore=" + mathScore +
                ", historyScore=" + historyScore +
                '}';
    }
}
