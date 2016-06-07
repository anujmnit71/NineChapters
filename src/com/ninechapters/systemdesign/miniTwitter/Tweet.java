package com.ninechapters.systemdesign.miniTwitter;

public class Tweet {
	      public int id;
	      public int user_id;
	      public String text;
	      
	      public static Tweet create(int user_id, String tweet_text) {
	    	  Tweet tweet = new Tweet();
	    	  tweet.user_id= user_id;
	    	  tweet.text = tweet_text;
	    	  
			return tweet;
	          // This will create a new tweet object,
	          // and auto fill id
	      }
	  }
