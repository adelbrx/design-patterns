package com.adelbrx.facade.exercice;

import java.util.List;

public class TwitterAPI {
    private String appKey;
    private String secret;

    public TwitterAPI(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweets() {
        var accessToken = getAccessToken();
        var twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(accessToken);
    }

    public String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        return oauth.getAccessToken(requestToken);
    }
}
