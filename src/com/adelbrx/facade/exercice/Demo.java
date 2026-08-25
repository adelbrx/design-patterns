package com.adelbrx.facade.exercice;

public class Demo {
    public  static void show() {
        var twitterService = new TwitterAPI("appKey","secret");
        twitterService.getRecentTweets();
    }
}
