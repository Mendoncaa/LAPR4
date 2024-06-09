package jobs4u.antlr4.CustomerRequirementsManagement;

public class RequirementAnswers {
    private String id;
    private String content;
    private String answer;

    public RequirementAnswers(String id, String content, String answer) {
        this.id = id;
        this.content = content;
        this.answer = answer;
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
}