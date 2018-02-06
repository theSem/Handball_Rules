package com.example.android.miwok;


public class Rule {

    private float mRuleNum;
    private String mTitle;
    private String mRule;

    public Rule(float ruleNum, String title, String rule){
        mRuleNum = ruleNum;
        mTitle = title;
        mRule = rule;
    }

    public String getmRule() {
        return mRule;
    }

    public String getmTitle() {
        return mTitle;
    }

    public float getmRuleNum() {
        return mRuleNum;
    }
}
