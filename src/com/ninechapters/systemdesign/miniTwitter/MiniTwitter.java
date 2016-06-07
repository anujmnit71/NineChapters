package com.ninechapters.systemdesign.miniTwitter;

import java.util.ArrayList;
import java.util.List;
//http://www.jiuzhang.com/solutions/mini-twitter/
public class MiniTwitter {
   private int id = 0;
   List<Tweet> list =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public MiniTwitter() {
        // initialize your data structure here.
        list = new ArrayList<Tweet>(); 
        
    }

    // @param user_id an integer
    // @param tweet a string
    // return a tweet
    public Tweet postTweet(int user_id, String tweet_text) {
    	Tweet tweet =  Tweet.create(user_id,tweet_text);
    	id = id+1;
    	tweet.id=id;
    	return tweet;
    }

    // @param user_id an integer
    // return a list of 10 new feeds recently
    // and sort by timeline
    public List<Tweet> getNewsFeed(int user_id) {
        // Write your code here
    }
        
    // @param user_id an integer
    // return a list of 10 new posts recently
    // and sort by timeline
    public List<Tweet>  getTimeline(int user_id) {
        // Write your code here
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id follows to_user_id
    public void follow(int from_user_id, int to_user_id) {
        // Write your code here
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id unfollows to_user_id
    public void unfollow(int from_user_id, int to_user_id) {
        // Write your code here
    }

}
