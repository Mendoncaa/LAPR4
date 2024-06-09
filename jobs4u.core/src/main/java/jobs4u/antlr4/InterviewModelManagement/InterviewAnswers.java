package jobs4u.antlr4.InterviewModelManagement;


public class InterviewAnswers {
    private String id;
    private String content;
    private String answer;
    private int value;

    public InterviewAnswers(String id, String content, String answer, int value) {
        this.id = id;
        this.content = content;
        this.answer = answer;
        this.value = value;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAnswer() {
        return answer;
    }

    public int getValue() {
        return value;
    }
}
