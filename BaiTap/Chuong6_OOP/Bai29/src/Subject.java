import java.util.TreeMap;

public class Subject {
    private String id;
    private String name;
    private int credit; // số tín chỉ
    private int numOfLesson; // số tiết
    private int numOfTest; // số bài kiểm tra

    public Subject() {
        id = "";
        name = "";
    }

    // constructor 1 tham số
    public Subject(String id) {
        this.id = id;
    }

    // constructor 2 tham số
    public Subject(String id, String name) {
        this(id);
        this.name = name;
    }

    // constructor 3 tham số
    public Subject(String id,
                   String name, int credit) {
        this(id, name);
        this.credit = credit;
    }

    // constructor 4 tham số
    public Subject(String id, String name,
                   int credit, int numOfLesson) {
        this(id, name, credit);
        this.numOfLesson = numOfLesson;
    }

    // constructor 5 tham số
    public Subject(String id, String name,
                   int credit, int numOfLesson, int numOfTest) {
        this(id, name, credit, numOfLesson); // gọi constructor 4 tham số
        this.numOfTest = numOfTest;
    }
    // các getter/setter:

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getNumOfLesson() {
        return numOfLesson;
    }

    public void setNumOfLesson(int numOfLesson) {
        this.numOfLesson = numOfLesson;
    }

    public int getNumOfTest() {
        return numOfTest;
    }

    public void setNumOfTest(int numOfTest) {
        this.numOfTest = numOfTest;
    }

    public String fullInfo(){
        return "Mã môn học: " + id + "\nTên môn học: "
                + name + "\nSố tín chỉ: " + credit
                + "\nSố tiết học: " + numOfLesson
                + "\nSố bài kiểm tra: " + numOfTest;
    }

    public void showInfoLine() {
        System.out.printf("%-15s%-20s%-15d%-15d%-15d\n",
                id, name, credit, numOfLesson, numOfTest);
    }
}
