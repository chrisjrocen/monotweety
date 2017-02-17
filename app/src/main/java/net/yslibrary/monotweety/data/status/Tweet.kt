package net.yslibrary.monotweety.data.status

/**
 * Created by yshrsmz on 2017/02/07.
 */
data class Tweet(val id: Long,
                 val inReplyToStatusId: Long,
                 val text: String,
                 val createdAt: String) {
  companion object {
    fun from(twitterTweet: com.twitter.sdk.android.core.models.Tweet): Tweet {
      return Tweet(
          id = twitterTweet.id,
          inReplyToStatusId = twitterTweet.inReplyToStatusId,
          text = twitterTweet.text,
          createdAt = twitterTweet.createdAt
      )
    }
  }
}