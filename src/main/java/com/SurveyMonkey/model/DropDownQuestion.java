package com.SurveyMonkey.model;

import javax.persistence.Entity;

@Entity
public class DropDownQuestion extends QType {
    private String option1;
    private String option2;

    public DropDownQuestion() {
    }

    public DropDownQuestion(Integer number, String surveyQuestion, String option1, String option2) {
        this.setNumber(number);
        this.setQuestion(surveyQuestion);
        this.option1 = option1;
        this.option2 = option2;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    @Override
    public String toString() {
        return String.format(
                "Question: [id=%d, number='%s', question='%s', option1='%s', option2='%s']",
                this.getId(), this.getNumber(), this.getQuestion(), option1, option2);
    }
    public static void main(String[] args) {
        DropDownQuestion question = new DropDownQuestion(1,"name?","hassan","nasr");
        System.out.print(question.getSurveyQuestion());
    }
}
