package edu.northeastern.ashish;

public class JobPrep {

    private Strategy jobPrep;
    public JobPrep(Strategy jobPrep){
        this.jobPrep = jobPrep;
    }
    public void prepareForInterview(){
        jobPrep.prepareForInterview();
    }
}
