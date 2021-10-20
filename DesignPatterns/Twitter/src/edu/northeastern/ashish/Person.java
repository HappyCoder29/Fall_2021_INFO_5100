package edu.northeastern.ashish;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Person extends  Thread{

    private ArrayList<Person> followers;

    String personName;

    public String getPersonName() {
        return personName;
    }

    public Person(String personName){
        this.personName = personName;
        this.followers = new ArrayList<>();
    }

    @Override
    public void run(){
        System.out.println("Thread Running");
    }

    public void tweet(String tweetMessage){
        for (Person follower : followers) {
            follower.getTweet(this,  tweetMessage);
        }
    }

    public void addFollower(Person person){
        if(!followers.contains(person)){
            followers.add(person);
        }
    }

    public void removeFollower(Person person){
        if(followers.contains(person)){
            followers.remove(person);
        }
    }

    public void getTweet(Person person, String tweetMessage) {
        System.out.println(this.getPersonName() + ": " +  person.getPersonName() + " has  Tweeted: " +  tweetMessage);
    }


    public void follow(Person person){
        person.addFollower(this);
    }

    public void unFollow(Person person){
        person.removeFollower(this);
    }



}
