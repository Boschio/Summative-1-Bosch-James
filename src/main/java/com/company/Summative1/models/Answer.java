package com.company.Summative1.models;

public class Answer {
    private int id;
    private String question;
    private String answer;

    public Answer(){}

    public Answer(int id, String answer){
        this.id = id;
        this.answer = answer;
    }

    public Answer(int id, String question, String answer){
        this.question = question;
        this.id = id;
        this.answer = answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}
