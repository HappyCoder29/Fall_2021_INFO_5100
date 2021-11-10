package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        JobPrep jobPrep = new JobPrep(new PMJobPrep());
        jobPrep.prepareForInterview();


        /// The interview happened and now I have another interview for Dev
        jobPrep = new JobPrep(new DevJobPrep());
        jobPrep.prepareForInterview();

    }
}
